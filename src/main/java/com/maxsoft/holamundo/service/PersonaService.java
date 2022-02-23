package com.maxsoft.holamundo.service;

import com.maxsoft.holamundo.domain.Persona;
import java.util.*;

public interface PersonaService {

    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);

}
