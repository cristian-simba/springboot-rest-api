package com.app.crud.repository;

import com.app.crud.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
