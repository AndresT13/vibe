package com.fenixia_owls.vibe.app.dominio.sincrono.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "calificaciones")
public class Calificacion {

    @Id
    private String calificacionId;
    private Integer calificacion;
}
