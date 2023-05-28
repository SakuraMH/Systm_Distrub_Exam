package org.sdia.Infractions.Controllers;

import lombok.AllArgsConstructor;
import org.sdia.Infractions.Entities.Infraction;
import org.sdia.Infractions.Entities.Radar;
import org.sdia.Infractions.Entities.Vehicule;
import org.sdia.Infractions.Repository.InfractionRepository;
import org.sdia.Infractions.ServiceClient.ImmatriculationServiceClient;
import org.sdia.Infractions.ServiceClient.RadarServiceClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class InfractionRestController {
    private InfractionRepository infractionRepository;
    private ImmatriculationServiceClient immatriculationServiceClient;
    private RadarServiceClient radarServiceClient;

    @GetMapping("/infractions/full/{id}")
    public Infraction getInfraction(@PathVariable(name="id") Long id){
        Infraction infraction=infractionRepository.findById(id).get();
        Radar radar=radarServiceClient.findRadarById(infraction.getRadarID());
        infraction.setRadar(radar);
        Vehicule vehicule=immatriculationServiceClient.findVehiculeById(infraction.getVehiculId());
        infraction.setVehicule(vehicule);
        return infraction; }
    @GetMapping("/infractions")
    public List<Infraction> getAllInfraction(){
        return infractionRepository.findAll();
    }
    @PostMapping("/infractions")
    public Infraction save(@RequestBody Infraction request ){
        return infractionRepository.save(request);
    }
    @DeleteMapping("/infractions/{id}")
    public void deleteInfraction(@PathVariable Long id){ infractionRepository.deleteById(id);
    }





}
