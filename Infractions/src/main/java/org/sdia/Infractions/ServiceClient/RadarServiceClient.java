package org.sdia.Infractions.ServiceClient;

import org.sdia.Infractions.Entities.Proprietaire;
import org.sdia.Infractions.Entities.Radar;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="radar-service")
public interface RadarServiceClient {
    @GetMapping("/radars/{id}")
    Radar findRadarById(@PathVariable("id") Long id);
}
