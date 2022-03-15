package com.aula.repositorios;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "alumnos")
@PrimaryKeyJoinColumn(name="personaId")
public class Alumno extends Persona implements Serializable{

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_curso")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "alumnos"})
    private Curso curso;

    public Alumno(){
    }

   public Alumno(String nombre, String apellido, Integer edad,  Integer dni, Curso curso){
        super(nombre, apellido, edad, dni);
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
