package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan({"com.example.demo.restController.equipoController"})
//@EnableJpaRepositories(basePackages = "com.example.demo.repositorios.Equipos_repositorio")
//@EntityScan(basePackages = "com.example.demo.model.Equipos")
@EnableAutoConfiguration
public class InicioRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(InicioRestApiApplication.class, args);
	}

}
