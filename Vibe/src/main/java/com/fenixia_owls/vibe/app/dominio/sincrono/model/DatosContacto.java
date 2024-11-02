package com.fenixia_owls.vibe.app.dominio.sincrono.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "datos_contacto")
public class DatosContacto {

    @Id
    private Long contactoId; // serial

    private Integer idContacto; // integer
    private Integer idComensal; // integer
    private Integer idProveedor; // integer
    private String barrio; // string
    private String sexo; // string
    private String direccion; // string
    private Integer telefono1; // integer
    private Integer telefono2; // integer
    private Integer movil1; // integer
    private Integer movil2; // integer
    private String email; // string
    private Boolean activo; // boolean

}
