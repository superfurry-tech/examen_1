package edu.fran.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.fran.examen.entities.Matricula;

public interface IMatriculaRepository extends JpaRepository<Matricula, Long> {
    public void findByCalificacionGreaterThanEqual(Double calificacion);

   
    
}
