package edu.fran.examen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamenApplication {

	@Autowired 
	private IEstudianteRepository estudianteRepository;

	

	public static void main(String[] args) {
		SpringApplication.run(ExamenApplication.class, args);
	}

}
