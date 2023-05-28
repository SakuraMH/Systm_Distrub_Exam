package org.sdia.Radar.Service;

import org.sdia.Radar.Entities.Infraction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="infraction-service")
public interface InfractionServiceClient {
    @PostMapping("/infractions")
    Infraction save(@RequestBody Infraction request );

}
