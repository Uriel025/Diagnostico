package com.example.diagnostico.model.dto;

import jakarta.persistence.Column;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class PersonaDto {

    private Integer idPersona;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String curp;
    private String fechaNacimineto;


}
