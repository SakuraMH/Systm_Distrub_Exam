package org.sdia.immatriculation;

import org.sdia.immatriculation.Entities.Proprietaire;
import org.sdia.immatriculation.Entities.Vehicule;
import org.sdia.immatriculation.Repository.ProprietaireRepository;
import org.sdia.immatriculation.Repository.VehiculeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@EnableFeignClients
public class ImmatriculationServiceApplication {
	public static void main(String[] args) {SpringApplication.run(ImmatriculationServiceApplication.class, args); }
	@Bean
	CommandLineRunner start(ProprietaireRepository proprietaireRepository, VehiculeRepository vehiculeRepository)
							 {

		return args -> {
			String dateString = "2023-05-15";
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date date = format.parse(dateString);
			Proprietaire proprietaire1= new Proprietaire(null,"Mahfoud",date,"Sanaa.mahfoud88@gmail.com");
			Proprietaire proprietaire2=new Proprietaire(null,"Maftouh",date,"Oumaima.maftouh12@gmail.com");
			proprietaireRepository.save(proprietaire1);
			proprietaireRepository.save(proprietaire2);
			Vehicule vehicule1=new Vehicule(null,"8965244","Mercedes",585,"AMG GTR",proprietaire1.getIdP(),proprietaire1);
			Vehicule vehicule2=new Vehicule(null,"JHfdtdtt","Ferrari",570,"458",proprietaire2.getIdP(),proprietaire2);
			vehiculeRepository.save(vehicule1);
			vehiculeRepository.save(vehicule2);



		};
	}}