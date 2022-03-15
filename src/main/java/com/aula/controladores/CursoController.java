package com.aula.controladores;

import com.aula.repositorios.Alumno;
import com.aula.repositorios.Curso;
import com.aula.repositorios.CursoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/cursos")
public class CursoController {

    @Autowired
    public CursoRepositorio cursoRepositorio;
    @GetMapping
    public void createAlumno(){
        Curso curso = new Curso("Geografía");
        cursoRepositorio.save(curso);
    }
}
