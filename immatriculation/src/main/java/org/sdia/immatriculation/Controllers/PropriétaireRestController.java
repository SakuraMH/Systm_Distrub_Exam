package org.sdia.immatriculation.Controllers;

import lombok.AllArgsConstructor;
import org.sdia.immatriculation.Entities.Proprietaire;
import org.sdia.immatriculation.FeignClient.ProprietaireServiceClient;
import org.sdia.immatriculation.FeignClient.VehiculeServiceClient;
import org.sdia.immatriculation.Repository.ProprietaireRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@RestController
public class PropriétaireRestController {
    private ProprietaireRepository proprietaireRepository;
    //private ProprietaireServiceClient proprietaireServiceClient;
    //private VehiculeServiceClient véhiculeServiceClient;



    @GetMapping("/proprietaires/full/{id}")
    public Proprietaire getProprietaire(@PathVariable(name = "id") Long id) {
        Proprietaire proprietaire = proprietaireRepository.findById(id).get();
        return proprietaire;
    }

    @GetMapping("/proprietaires")
    public List<Proprietaire> getAllPropietaire(){
        return proprietaireRepository.findAll();
    }

    @PostMapping("/propriataire")
    public Proprietaire save(@RequestBody Proprietaire request ){
        return proprietaireRepository.save(request);
    }
    @PutMapping("/proprietaire/{id}")
    public Proprietaire update(@PathVariable Long id,@RequestBody Proprietaire proprietaire ){
        Proprietaire proprietaire1=proprietaireRepository.findById(id).orElseThrow();
        if (proprietaire.getNom()!=null)proprietaire1.setNom(proprietaire.getNom());
        if (proprietaire.getDateNaissance()!=null)proprietaire1.setDateNaissance(proprietaire.getDateNaissance());
        return proprietaireRepository.save(proprietaire1);
    }
    @DeleteMapping("/proprietaire/{id}")
    public void deleteProprietaire(@PathVariable Long id){
        proprietaireRepository.deleteById(id);
    }
}


