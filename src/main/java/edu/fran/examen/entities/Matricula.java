package edu.fran.examen.entities;

import java.time.LocalDate;

import edu.fran.examen.enums.Convocatoria;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name = "matriculas")

public class Matricula {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_matriculacion", nullable = false)
    private LocalDate fechaMatriculacion;

    
    private Double calificacion;

    private Convocatoria convocatoria;

    public Matricula() {
    }

    public Matricula(LocalDate fechaMatriculacion, Double calificacion, Convocatoria convocatoria) {
        this.fechaMatriculacion = fechaMatriculacion;
        this.calificacion = calificacion;
        this.convocatoria = convocatoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public Convocatoria getConvocatoria() {
        return convocatoria;
    }

    public void setConvocatoria(Convocatoria convocatoria) {
        this.convocatoria = convocatoria;
    }

    @Override
    public String toString() {
        return "Matricula [id=" + id + ", fechaMatriculacion=" + fechaMatriculacion + ", calificacion=" + calificacion
                + ", convocatoria=" + convocatoria + "]";
    }

    

}
