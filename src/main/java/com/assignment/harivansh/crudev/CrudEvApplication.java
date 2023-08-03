package com.assignment.harivansh.crudev;

import com.assignment.harivansh.crudev.model.EvStation;
import com.assignment.harivansh.crudev.repository.EvStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudEvApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudEvApplication.class, args);
	}

	@Autowired
	private EvStationRepository evStationRepository;

	@Override
	public void run(String... args) throws Exception {
	}
}
