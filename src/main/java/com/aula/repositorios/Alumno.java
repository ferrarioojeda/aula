package com.aula.repositorios;

import javax.persistence.*;

@Entity
@Table(name = "alumnos")
@PrimaryKeyJoinColumn(name="id_persona")
//@PrimaryKeyJoinColumn(name="id_curso")
public class Alumno extends Persona{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno", unique = true, nullable= false)
    private Integer alumnoId;

    @ManyToOne
    //@JoinColumn(name = "id_persona")
    private Persona personaId;

   /* @ManyToOne
    @JoinColumn(name = "id_curso")
    private Integer cursoId;
*/
    public Alumno(){
    }

   /* public Alumno(String nombre, String apellido, Integer edad, Integer personaId,  Integer dni){
        super(nombre, apellido, edad, dni);


    }*/


    public Integer getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(Integer alumnoId) {
        this.alumnoId = alumnoId;
    }

    /*public Integer getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }*/

   /* public Integer getCursoId() {
        return cursoId;
    }

    public void setCursoId(Integer cursoId) {
        this.cursoId = cursoId;
    }*/
}
