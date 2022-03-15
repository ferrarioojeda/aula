package com.aula.repositorios;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Curso implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso", unique = true, nullable= false)
    private Integer cursoId;
    @Column(name = "nombre")
    private String nombre;

    public Curso() {
    }

    public Curso(String nombre) {

        this.nombre = nombre;
    }

    public Curso(Integer cursoId, String nombre) {

        this.cursoId = cursoId;
        this.nombre = nombre;
    }

    public Integer getCursoId() {
        return cursoId;
    }

    public void setCursoId(Integer cursoId) {
        this.cursoId = cursoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombre=" + nombre + '}';
    }

}
