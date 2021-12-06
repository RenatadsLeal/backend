package com.leal.checkpoint2;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Checkpoint2Application {

	public static void main(String[] args) {
		SpringApplication.run(Checkpoint2Application.class, args);
		PropertyConfigurator.configure("log4j.properties");
	}

}
