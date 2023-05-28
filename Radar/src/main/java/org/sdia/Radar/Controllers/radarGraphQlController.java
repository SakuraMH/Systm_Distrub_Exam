package org.sdia.Radar.Controllers;

import org.sdia.Radar.Entities.Radar;
import org.sdia.Radar.Repository.radarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class radarGraphQlController {
    @Autowired
    private radarRepository radarRepository;
    @QueryMapping
    public List<Radar> RadarsList(){
        return radarRepository.findAll();
    }

}
