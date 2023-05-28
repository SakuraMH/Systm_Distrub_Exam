package org.sdia.immatriculation.FeignClient;

import org.sdia.immatriculation.Entities.Vehicule;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

//@FeignClient(name="immatriculation-service")
public interface VehiculeServiceClient {
   // @GetMapping("/vehicules/{id}")
    //Vehicule findVehiculeById(@PathVariable("id") Long id);
    //Optional<Vehicule> findByMat(String mat);



}
