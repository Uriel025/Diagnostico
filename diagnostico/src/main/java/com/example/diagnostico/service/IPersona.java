package com.example.diagnostico.service;

import com.example.diagnostico.model.dto.PersonaDto;
import com.example.diagnostico.model.entity.PersonaBean;

import java.util.List;

public interface IPersona {
    PersonaBean save(PersonaDto persona);

    PersonaBean findById(Integer id);
    List<PersonaBean> findAll();

    void delete(PersonaBean persona);


}
