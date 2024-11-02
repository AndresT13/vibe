package com.fenixia_owls.vibe.app.dominio.sincrono.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "mesa")
public class Mesa {

    @Id
    private String mesaId;

    private Integer idMesa;
    private String codigo;
    private Boolean servicioMesa;
    private String facturaId;
    private String descripcion;
}
