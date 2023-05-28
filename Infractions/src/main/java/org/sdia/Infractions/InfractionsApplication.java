package org.sdia.Infractions;

import org.sdia.Infractions.Repository.InfractionRepository;
import org.sdia.Infractions.ServiceClient.ImmatriculationServiceClient;
import org.sdia.Infractions.ServiceClient.RadarServiceClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
@EnableFeignClients
@SpringBootApplication
public class InfractionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfractionsApplication.class, args);
	}

	@Bean
	CommandLineRunner start(InfractionRepository infractionRepository,
							ImmatriculationServiceClient immatriculationServiceClient, RadarServiceClient radarServiceClient) {

		return args -> {

			//Radar radar = radarServiceClient.findRadarById(1L);
			//System.out.println(radar.getVitessMax());
			//Vehicule vehicule = immatriculationServiceClient.findVehiculeById(1L);
			//Infraction infraction = new Infraction(null, new Date(), 120, 140, 500.0, radar.getId(), vehicule.getNumMatricule(),vehicule.getId(), null, null);
			//infractionRepository.save(infraction);

		};
	}
}
