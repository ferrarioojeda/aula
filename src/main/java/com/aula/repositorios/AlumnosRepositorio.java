package com.aula.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnosRepositorio extends JpaRepository<Alumno, Integer> {
}
