package com.aula.repositorios;

import javax.persistence.*;

@Entity
@Table(name = "curso")
public class Curso {

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
