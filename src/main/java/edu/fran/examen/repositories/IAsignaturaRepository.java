package edu.fran.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.fran.examen.entities.Asignatura;

public interface IAsignaturaRepository extends JpaRepository<Asignatura, Long> {
    public void countByCreditosGreaterThanEqual(int creditos);

    
    
}
