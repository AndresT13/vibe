package com.fenixia_owls.vibe.app.dominio.asincrono.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "restaurantes")
public class Restaurante {

    @Id
    private String restauranteId; // serial

    private String nombre; // string
    private String direccion; // string
    private String telefono; // string
    private String email; // string
    private Date fechaCreacion; // timestamp
    private Boolean activo; // boolean
}
