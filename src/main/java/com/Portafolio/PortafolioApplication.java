package com.Portafolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class PortafolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortafolioApplication.class, args);
	}

	@GetMapping(path = "/")
	public List<String> getJob(){
		return List.of(
				"qwwe",
				"fdgsfd",
				"dfgs"
		);
	}

}
