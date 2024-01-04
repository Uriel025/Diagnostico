package com.example.diagnostico.service.Impl;

import com.example.diagnostico.service.IPersona;

import com.example.diagnostico.model.dao.PersonaDao;
import com.example.diagnostico.model.dto.PersonaDto;
import com.example.diagnostico.model.entity.PersonaBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaImpl implements IPersona {
@Autowired
private PersonaDao personaDao;

    @Override
    @Transactional
    public PersonaBean save(PersonaDto personaDto) {
PersonaBean persona = PersonaBean.builder()
        .idPersona(personaDto.getIdPersona())
        .nombre(personaDto.getNombre())
        .primerApellido(personaDto.getPrimerApellido())
        .segundoApellido(personaDto.getSegundoApellido())
        .curp(personaDto.getCurp())
        .fechaNacimineto(personaDto.getFechaNacimineto())
        .build();
        return personaDao.save(persona);
    }

    @Override
    @Transactional(readOnly= true)
    public PersonaBean findById(Integer id) {
        return personaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly= true)
    public List<PersonaBean> findAll() {
        return (List<PersonaBean>) personaDao.findAll();
    }

    @Override
    @Transactional
    public void delete(PersonaBean persona) {
personaDao.delete(persona);
    }


}
