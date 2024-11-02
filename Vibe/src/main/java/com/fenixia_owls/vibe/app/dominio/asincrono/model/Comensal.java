package com.fenixia_owls.vibe.app.dominio.asincrono.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Document(collection = "comensal")
public class Comensal {

    @Id
    private String comensalId;

    private String nombre;
    private String foto;
    private String apellido1;
    private String apellido2;
    private Integer idContacto;
    private Integer idFoto;
    private Boolean activo;
    private Integer restauranteId;
}
