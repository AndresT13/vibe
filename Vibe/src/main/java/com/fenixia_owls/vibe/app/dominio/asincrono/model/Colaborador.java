package com.fenixia_owls.vibe.app.dominio.asincrono.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "colaborador")
public class Colaborador {

    @Id
    private String personaId;

    private String numeroIdentificacion;
    private Integer identificadorId;
    private Integer idContacto;
    private Boolean activo;
    private Boolean estado;
    private Integer idFoto;
    private Date fechaAlta;
    private Date fechaBaja;
    private Integer idCargo;
    private Integer restauranteId;
}
