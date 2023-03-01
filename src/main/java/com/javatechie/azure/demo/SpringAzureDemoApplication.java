package com.javatechie.azure.demo;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {
	Logger logger = Logger.getLogger(SpringAzureDemoApplication.class.getName());

	@GetMapping("/message")
	public String message(){
		logger.log(Level.FINE,"Level.FINE");
		logger.log(Level.INFO,"level.info");
		logger.log(Level.SEVERE,"level.server");
		logger.log(Level.WARNING,"level.warning");
		return "Congrats ! your application deployed successfully in Azure Platform. !";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}

}
