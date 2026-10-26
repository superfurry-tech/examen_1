package edu.fran.examen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.fran.examen.entities.Estudiante;
import edu.fran.examen.entities.Matricula;
import edu.fran.examen.repositories.IAsignaturaRepository;
import edu.fran.examen.repositories.IEstudianteRepository;
import edu.fran.examen.repositories.IMatriculaRepository;

@SpringBootApplication
public class ExamenApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteRepository estudianteRepository;

	@Autowired
	private IAsignaturaRepository asignaturaRepository;

	@Autowired
	private static IMatriculaRepository matriculaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ExamenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// BLOQUE 1
		estudianteRepository.count();
		asignaturaRepository.count();
		matriculaRepository.count();

		System.out.println("Estudiante con ID 1: " + estudianteRepository.findById(1L));


		// BLOQUE 2
		estudianteRepository.findByDni("12345678A");
		findByCalificacionGreaterThanEqual(5.0);	

		

		

		



    



		

	}

	static void findByCalificacionGreaterThanEqual(Double calificacion) {
		if (calificacion>=5.0) {
			for (Matricula matricula : matriculaRepository.findAll()) {
				System.out.println("Matricula con calificación mayor o igual a 5: " + matricula.getFechaMatriculacion() + matricula.getCalificacion());
			}
			
		}
		
	}
	
}
