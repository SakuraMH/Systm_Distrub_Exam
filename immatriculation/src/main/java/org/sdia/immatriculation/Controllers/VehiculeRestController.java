package org.sdia.immatriculation.Controllers;
import lombok.AllArgsConstructor;
import org.sdia.immatriculation.Entities.Proprietaire;
import org.sdia.immatriculation.Entities.Vehicule;
import org.sdia.immatriculation.FeignClient.ProprietaireServiceClient;
import org.sdia.immatriculation.FeignClient.VehiculeServiceClient;
import org.sdia.immatriculation.Repository.ProprietaireRepository;
import org.sdia.immatriculation.Repository.VehiculeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController @AllArgsConstructor
public class VehiculeRestController {
    private VehiculeRepository vehiculeRepository;
    private ProprietaireRepository proprietaireRepository;
   // private ProprietaireServiceClient proprietaireServiceClient;
    //private VehiculeServiceClient vehiculeServiceClient;
    @GetMapping("/vehicules/full/{id}")
    public Vehicule getVhicule(@PathVariable(name = "id") Long id) {
        Vehicule vehicule = vehiculeRepository.findById(id).get();
        //Optional<Proprietaire> proprietaire=proprietaireRepository.findById(vehicule.getIdProprietaire());
        //vehicule.setProprietaire(proprietaire);
        return vehicule;
    }
    @GetMapping("/immatric/{mat}")
    public Vehicule findByMat(@PathVariable(name = "mat") String mat) {
        System.out.println(mat);
        Vehicule vehicule = vehiculeRepository.findByMat(mat).get();
        return vehicule;
    }
    @GetMapping("/vehicules")
    public List<Vehicule> getAllVehicule(){
        return vehiculeRepository.findAll();
    }
    @PostMapping("/vehicules")
    public Vehicule save(@RequestBody Vehicule request ){
        return vehiculeRepository.save(request);
    }
    @PutMapping("/vehicules/{id}")
    public Vehicule update(@PathVariable Long id,@RequestBody Vehicule vehicule ){
        Vehicule vehicule1=vehiculeRepository.findById(id).orElseThrow();
        if (vehicule.getMat()!=null)vehicule1.setMat(vehicule.getMat());
        if (vehicule.getMarque()!=null)vehicule1.setMarque(vehicule.getMarque());
        if (vehicule.getPuissanceFiscal()!=null)vehicule1.setPuissanceFiscal(vehicule.getPuissanceFiscal());
        if(vehicule.getModele()!=null)vehicule1.setModele(vehicule.getModele());
        if (vehicule.getIdProprietaire()!=null)vehicule1.setIdProprietaire(vehicule.getIdProprietaire());
        if(vehicule.getProprietaire()!=null)vehicule1.setProprietaire(vehicule.getProprietaire());
        return vehiculeRepository.save(vehicule1);
    }
    @DeleteMapping("/vehicules/{id}")
    public void deletePVehicule(@PathVariable Long id){
        vehiculeRepository.deleteById(id);
    }
}
