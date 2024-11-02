package com.fenixia_owls.vibe.app.dominio.sincrono.model;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Document(collection = "documento_identificacion")
public class DocumentoIdentificacion {

    @Id
    private String identificacionId; // serial

    private Integer idPersona; // integer
    private String codigoIdentificador; // string
    private String nombreIdentificacion; // string
    private Date fechaExpedicion; // date
    private String nacionalidad; // string
    private Date fechaAlta; // date
    private Date fechaBaja; // date

}
