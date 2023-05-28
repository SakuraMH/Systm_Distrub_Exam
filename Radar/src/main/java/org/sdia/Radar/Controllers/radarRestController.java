package org.sdia.Radar.Controllers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.sdia.Radar.DetectGrpcService.Service.RestData;
import org.sdia.Radar.Entities.Infraction;
import org.sdia.Radar.Entities.Radar;
import org.sdia.Radar.Entities.proprietaire;
import org.sdia.Radar.Entities.vehicule;
import org.sdia.Radar.Repository.radarRepository;
import org.sdia.Radar.Service.ImmatriculationServiceClient;
import org.sdia.Radar.Service.InfractionServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@RestController
public class radarRestController {
    @Autowired
    private radarRepository radarRepository;
    @Autowired
    private InfractionServiceClient infractionServiceClient;
    @Autowired
    private ImmatriculationServiceClient immatriculationServiceClient;

    @GetMapping("/radars/{id}")
    public Radar getRadars(@PathVariable(name = "id") Long id) {
        Radar radar = radarRepository.findById(id).get();
        return radar;
    }
    @GetMapping("/vehicule/{id}")
    public vehicule findVehicule(@PathVariable(name = "id") Long id) {
        System.out.println(id);
        vehicule vehicule = immatriculationServiceClient.findVehiculeById(id);
        return vehicule;
    }
    @GetMapping("/immatric/{mat}")
    public vehicule findVehiculeMat(@PathVariable(name = "mat") String mat) {
        System.out.println(mat);
        vehicule vehicule1 = immatriculationServiceClient.findByMat(mat);
        return vehicule1;
    }
    @PostMapping("/api/data")
    public Optional<Radar> receiveDetectData(@RequestBody RestData restData) {
        // Traiter les données reçues de gRPC
        String vehiculeMatriculation = restData.getVehiculeMatriculation();
        //Double idRadar = Request.getIdRadar();
        Long idRadar=Double.valueOf(restData.getIdRadar()).longValue();
        Double vehiculeVitesse = restData.getVehiculeVitesse();
        Optional<Radar> radar=radarRepository.findById(idRadar);
        vehicule vehicule1=immatriculationServiceClient.findByMat(vehiculeMatriculation);
        proprietaire proprietaire1=immatriculationServiceClient.findProprietaireById(vehicule1.getIdProprietaire());
        System.out.println(proprietaire1);
        Infraction infraction=new Infraction(null,new Date(),radar.get().getVitessMax(), vehiculeVitesse,500.0,idRadar,vehiculeMatriculation,vehicule1.getIdv(),null,null);
        infractionServiceClient.save(infraction);
        return radar;

    }


    @GetMapping("/radars")
    public List<Radar> getAllRadars(){
        return radarRepository.findAll();
    }

    @PostMapping("/radars")
    public Radar save(@RequestBody Radar request ){
        return radarRepository.save(request);
    }
    @PutMapping("/radars/{id}")
    public Radar update(@PathVariable Long id,@RequestBody Radar radar ){
        Radar radar1=radarRepository.findById(id).orElseThrow();
        if (radar.getVitessMax()!=null)radar1.setVitessMax(radar.getVitessMax());
        if (radar.getLongitude()!=null)radar1.setLongitude(radar.getLongitude());
        if(radar.getLatitude()!=null)radar1.setLatitude(radar.getLatitude());
        return radarRepository.save(radar1);
    }
    @DeleteMapping("/radars/{id}")
    public void deleteRadar(@PathVariable Long id){
        radarRepository.deleteById(id);
    }

    public proprietaire findPropietaireById(Long id){
        return immatriculationServiceClient.findPropietaireById(id);
    }

}
