package com.kleberaluizio.tvshows;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TvshowsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TvshowsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Primeiro projeto spring sem web");
	}
}
