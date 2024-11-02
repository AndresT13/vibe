package com.fenixia_owls.vibe.app.dominio.sincrono.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "cargo")
public class Cargo {

    @Id
    private String cargoId;
    private Integer idCargo;
    private String nombre;
    private String description;

}
