package com.aula.dtos;

import com.aula.repositorios.Curso;

public class AlumnoDto {

  private String nombre;
  private String apellido;
  private Integer edad;
  private Integer dni;
  private Curso curso;

  public AlumnoDto(){

  }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public Integer getDni() {
        return dni;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
