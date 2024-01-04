package com.example.diagnostico.model.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;

import java.util.NavigableMap;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "persona")
public class PersonaBean {
@Id

@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Integer idPersona;

@Column(name = "nombre")
    private String nombre;

@Column (name = "primer_apellido")
    private String primerApellido;

@Column (name = "segundo_apellido")
    private String segundoApellido;

@Column (name = "curp")
    private String curp;

@Column (name="fecha_nacimiento")
    private String fechaNacimineto;


}
