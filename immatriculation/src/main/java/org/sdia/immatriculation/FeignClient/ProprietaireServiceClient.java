package org.sdia.immatriculation.FeignClient;
import org.sdia.immatriculation.Entities.Proprietaire;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//@FeignClient(name="proprietaire-service")
public interface ProprietaireServiceClient {
   // @GetMapping("/proprietaire/{id}")
    //Proprietaire findproprietaireById(@PathVariable("id") Long id);

}
