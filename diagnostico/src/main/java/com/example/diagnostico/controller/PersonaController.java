package com.example.diagnostico.controller;

import com.example.diagnostico.model.dto.PersonaDto;
import com.example.diagnostico.service.IPersona;
import com.example.diagnostico.model.entity.PersonaBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/persona")
public class PersonaController {
@Autowired
    private IPersona personaService;

@GetMapping("/")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
public List<PersonaBean> getPersona(){return personaService.findAll();}


    @GetMapping("/{id}")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public PersonaBean showById(@PathVariable Integer id) {
        return personaService.findById(id);
    }

    @PostMapping("/")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public PersonaDto create(@RequestBody PersonaDto personaDto) {
        PersonaBean personaSave = personaService.save(personaDto);
        return PersonaDto.builder()
                .idPersona(personaSave.getIdPersona())
                .nombre(personaSave.getNombre())
                .primerApellido(personaSave.getPrimerApellido())
                .segundoApellido(personaSave.getSegundoApellido())
                .curp(personaSave.getCurp())
                .fechaNacimineto(personaSave.getFechaNacimineto())
                .build();
    }

    @PutMapping("/")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public PersonaDto update(@RequestBody PersonaDto personaDto) {
        PersonaBean personaUpdate = personaService.save(personaDto);
        return PersonaDto.builder()
                .idPersona(personaUpdate.getIdPersona())
                .nombre(personaUpdate.getNombre())
                .primerApellido(personaUpdate.getPrimerApellido())
                .segundoApellido(personaUpdate.getSegundoApellido())
                .curp(personaUpdate.getCurp())
                .fechaNacimineto(personaUpdate.getFechaNacimineto())
                .build();
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public void delete(@PathVariable Integer id) {
        PersonaBean persona = personaService.findById(id);
        personaService.delete(persona);
    }



}
