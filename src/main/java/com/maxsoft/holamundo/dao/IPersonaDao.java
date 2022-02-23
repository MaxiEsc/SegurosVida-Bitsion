package com.maxsoft.holamundo.dao;

import com.maxsoft.holamundo.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Persona, Long>{
    
}
