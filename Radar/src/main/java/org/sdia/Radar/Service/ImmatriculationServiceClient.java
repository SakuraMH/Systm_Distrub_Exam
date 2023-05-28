package org.sdia.Radar.Service;

import org.sdia.Radar.Entities.proprietaire;
import org.sdia.Radar.Entities.vehicule;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="immatriculation-service")
public interface ImmatriculationServiceClient {
    @GetMapping("/proprietaires/full/{id}")
    proprietaire findProprietaireById(@PathVariable("id") Long id);

    @GetMapping("/vehicules/full/{id}")
    vehicule findVehiculeById(@PathVariable("id") Long id);
    //@GetMapping("/immatric/{mat}")
    @GetMapping("/immatric/{mat}")
    vehicule findByMat(@PathVariable(name = "mat") String mat);
    @GetMapping("/vehicules/{idProprietaire}")
    proprietaire findPropietaireById(@PathVariable("idProprietaire") Long idProprietaire);

}