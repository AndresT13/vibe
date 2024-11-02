package com.fenixia_owls.vibe.app.dominio.asincrono.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "plato")
public class Plato {

    @Id
    private String platoId;

    private Integer idMicheline;
    private String codPlato;
    private String nombre;
    private String descripcion;
    private String origen;
    private Double precio;
    private Boolean recomendado;
    private Integer idCalificacion;
}
