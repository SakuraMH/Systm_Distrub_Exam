package org.sdia.Radar;

import org.sdia.Radar.DetectGrpcService.Server.server;
import org.sdia.Radar.DetectGrpcService.Service.DetectGrpcService;
import org.sdia.Radar.Entities.DetectVitess;
import org.sdia.Radar.Entities.Radar;
import org.sdia.Radar.Entities.vehicule;
import org.sdia.Radar.Repository.radarRepository;
import org.sdia.Radar.Service.ImmatriculationServiceClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
@EnableFeignClients
@SpringBootApplication
public class RadarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RadarApplication.class, args);
	}

	@Bean
	CommandLineRunner start(radarRepository radarRepository, RepositoryRestConfiguration repositoryRestConfiguration, ImmatriculationServiceClient immatriculationServiceClient) {
		repositoryRestConfiguration.exposeIdsFor(Radar.class);
		return args -> {

			radarRepository.save(new Radar(null, 120, "2.3522°E", "48.8566°N"));
			radarRepository.save(new Radar(null, 80, "74.0060°W", "40.7128°N"));
			radarRepository.save(new Radar(null, 140, "-43.1729°W", " -22.9068°S"));
			radarRepository.findAll().forEach(System.out::println);

			//vehicule vehicule= immatriculationServiceClient.findVehiculeById(1L);
			//System.out.println(vehicule);







		};



	}
}
