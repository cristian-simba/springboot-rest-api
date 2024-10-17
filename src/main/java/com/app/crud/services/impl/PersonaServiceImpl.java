package com.app.crud.services.impl;

import com.app.crud.entities.Persona;
import com.app.crud.repository.PersonaRepository;
import com.app.crud.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public List<Persona> obtenerPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Optional<Persona> obtenerID(Long id) {
        return personaRepository.findById(id);
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona actualizarPersona(Long id, Persona personaDetalles) {
        return personaRepository.findById(id).map(persona -> {
            persona.setNombre(personaDetalles.getNombre());
            persona.setApellido(personaDetalles.getApellido());
            persona.setNumero(personaDetalles.getNumero());
            return personaRepository.save(persona);
        }).orElse(null);
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }
}
