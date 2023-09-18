package com.kleberaluizio.tvshows;

import com.kleberaluizio.tvshows.service.ConsumeAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class TvshowsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TvshowsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner leitura = new Scanner(System.in);
		String search = "";

		while(!search.equalsIgnoreCase("sair")) {
			System.out.println("Qual filme você gostaria de buscar? ");
			search = leitura.nextLine();

			if (search.equalsIgnoreCase("sair")) {
				break;
			}
			String address = "https://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=638e10ca";

			ConsumeAPI consumeAPI = new ConsumeAPI();

			var json = consumeAPI.obtainData(address);

			System.out.println(json);
		}
	}
}
