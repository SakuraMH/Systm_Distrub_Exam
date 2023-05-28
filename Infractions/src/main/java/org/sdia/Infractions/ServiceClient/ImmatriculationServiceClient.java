package org.sdia.Infractions.ServiceClient;

import org.sdia.Infractions.Entities.Proprietaire;
import org.sdia.Infractions.Entities.Vehicule;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="immatriculation-service")
public interface ImmatriculationServiceClient {
    @GetMapping("/proprietaires/{id}")
    Proprietaire findProprietaireById(@PathVariable("id") Long id);
    @GetMapping("/vehicules/{id}")
    Vehicule findVehiculeById(@PathVariable("id") Long id);

}
