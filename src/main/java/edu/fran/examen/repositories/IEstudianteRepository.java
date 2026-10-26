package edu.fran.examen.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.fran.examen.entities.Estudiante;

public interface IEstudianteRepository extends JpaRepository<Estudiante, Long> {

    public static Optional<Estudiante> findByDni(String dni) {
        return IEstudianteRepository.findByDni(dni);
    }

}
