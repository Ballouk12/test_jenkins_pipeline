package com.example.HelloWord2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWord2Application {

	private static final Logger logger = LoggerFactory.getLogger(HelloWord2Application.class);

	public static void main(String[] args) {
		logger.info("🚀 Démarrage de l'application HelloWord2...");
		SpringApplication.run(HelloWord2Application.class, args);
		logger.info("✅ Application démarrée avec succès !");
	}
}
