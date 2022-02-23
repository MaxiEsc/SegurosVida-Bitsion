package com.maxsoft.holamundo.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;

    @NotEmpty
    @Size(min = 1, max = 45)
    private String nombre_completo;

    @NotEmpty
    @Size(min = 1, max = 50)
    private String identificacion;

    @NotNull
    private Integer edad;

    @NotEmpty
    @Size(min = 1, max = 45)
    private String genero;

    @NotEmpty
    @Email
    @Size(min = 1, max = 45)
    private String email;

    @Column(name = "estado", nullable = false, columnDefinition = "TINYINT(1)")
    private boolean estado;

    @Column(name = "maneja", nullable = false, columnDefinition = "TINYINT(1)")
    private boolean maneja;

    @Column(name = "lentes", nullable = false, columnDefinition = "TINYINT(1)")
    private boolean lentes;

    @Column(name = "diabetico", nullable = false, columnDefinition = "TINYINT(1)")
    private boolean diabetico;

    private String enfermedad;

    private String comentarios;
}
