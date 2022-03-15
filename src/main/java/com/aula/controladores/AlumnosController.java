package com.aula.controladores;

import com.aula.dtos.AlumnoDto;
import com.aula.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Optional;

@RestController
@RequestMapping(path = "/alumnos")
public class AlumnosController {

    @Autowired
    private AlumnosRepositorio alumnosRepositorio;
    @Autowired
    private CursoRepositorio cursoRepositorio;

/*    @GetMapping
    public void createAlumno(){
        Curso curso = cursoRepositorio.getById(3);
        Alumno alumno = new Alumno("Carlos", "Rios", 38, 30131122, curso);
        alumnosRepositorio.save(alumno);
    }

    @PostMapping
    public Alumno altaAlumno(@RequestBody AlumnoDto alumnoDto){

        Curso curso = cursoRepositorio.getById(alumnoDto.getCurso().getCursoId());
        Alumno alumno = new Alumno(alumnoDto.getNombre(), alumnoDto.getApellido(), alumnoDto.getEdad(), alumnoDto.getDni(), curso );
        return alumnosRepositorio.save(alumno);
    }*/

    @PostMapping
    @Transactional
    public Alumno altaAlumno(@RequestBody HashMap<String, Object> reqBody){

        System.out.println(reqBody);
        HashMap<String, Object> reqCurso = (HashMap<String, Object>) reqBody.get("curso");
        Curso curso = new Curso((Integer) reqCurso.get("id_curso"),(String) reqCurso.get("nombre"));
        //Curso found = cursoRepositorio.getById((Integer) reqCurso.get("cursoId"));
        //Curso curso = new Curso(found.getCursoId(), found.getNombre());
        Alumno alumno1 = new Alumno(
                (String) reqBody.get("nombre"),
                (String) reqBody.get("apellido"),
                (Integer) reqBody.get("edad"),
                (Integer) reqBody.get("dni"),
                curso);
        System.out.println("hola david");
        return alumnosRepositorio.save(alumno1);
    }
}
