package edu.fran.examen.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.fran.examen.entities.Estudiante;

public interface IEstudianteRepository extends JpaRepository<Estudiante, Long> {

    Optional<Estudiante> Estudiante = null;

    public default Optional<Estudiante> findByDni(String dni) {
        return Estudiante;
    }

}
