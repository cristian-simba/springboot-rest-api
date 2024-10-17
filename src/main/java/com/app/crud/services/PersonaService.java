package com.app.crud.services;

import com.app.crud.entities.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaService {
    List<Persona> obtenerPersonas();
    Optional<Persona> obtenerID(Long id);
    Persona crearPersona(Persona persona);
    Persona actualizarPersona(Long id, Persona personaDetalles);
    void eliminarPersona(Long id);
}
