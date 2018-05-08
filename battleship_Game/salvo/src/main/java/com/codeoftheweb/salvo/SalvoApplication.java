package com.codeoftheweb.salvo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SalvoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalvoApplication.class, args);

	}


	@Bean
	public CommandLineRunner initData(PlayerRepository repository) {
		Player one = new Player("Wyll", "Gs", "mc");

		return (args) -> {
			// save players
			repository.save(one);

		};
	}








}

