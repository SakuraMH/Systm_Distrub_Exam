package org.sdia.immatriculation.Controllers;

import org.sdia.immatriculation.Entities.Proprietaire;
import org.sdia.immatriculation.Entities.Vehicule;
import org.sdia.immatriculation.Repository.ProprietaireRepository;
import org.sdia.immatriculation.Repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class ImmatriculationGraphqlController {
    @Autowired
    private ProprietaireRepository proprietaireRepository;
    @Autowired
    private VehiculeRepository vehiculeRepository;
    @QueryMapping
    public List<Proprietaire> proprietaireList(){
        return proprietaireRepository.findAll();
    }
    @QueryMapping
    public List<Vehicule> vehiculeList(){
        return vehiculeRepository.findAll();
    }
    @QueryMapping
    public Proprietaire getProprietaireById(@Argument Long id)
            {
                Optional<Proprietaire> proprietaire= proprietaireRepository.findById(id);
                Proprietaire proprietaire1=new Proprietaire();
                proprietaire1.setDateNaissance(proprietaire.get().getDateNaissance());
                proprietaire1.setNom(proprietaire.get().getNom());
                proprietaire1.setIdP(proprietaire.get().getIdP());
                proprietaire1.setEmail(proprietaire.get().getEmail());
        return proprietaire1;
    }
    @MutationMapping
    public Proprietaire saveNewProprietaire(@Argument Proprietaire
                                                       request)  {
        return proprietaireRepository.save(request);
    }
    @MutationMapping
    public Proprietaire updateProprietaire(@Argument Proprietaire request)  {
        Optional<Proprietaire> proprietaire= proprietaireRepository.findById(request.getIdP());
        Proprietaire proprietaire1=new Proprietaire();
        proprietaire1.setDateNaissance(proprietaire.get().getDateNaissance());
        proprietaire1.setNom(proprietaire.get().getNom());
        proprietaire1.setIdP(proprietaire.get().getIdP());
        proprietaire1.setEmail(proprietaire.get().getEmail());
        proprietaireRepository.delete(proprietaire1);
        return proprietaireRepository.save(request);
    }
    @MutationMapping
    public Boolean deleteProprietaire(@Argument Long id)  {
        proprietaireRepository.deleteById(id);
        return true;
    }
}
