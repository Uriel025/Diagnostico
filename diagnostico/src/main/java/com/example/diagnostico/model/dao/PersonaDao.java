package com.example.diagnostico.model.dao;

import com.example.diagnostico.model.entity.PersonaBean;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<PersonaBean, Integer> {


}
