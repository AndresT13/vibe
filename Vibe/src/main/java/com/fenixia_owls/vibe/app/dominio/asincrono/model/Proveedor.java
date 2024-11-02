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
@Document(collection = "proveedores")
public class Proveedor {

    @Id
    private Long proveedoresId;

    private String nombre;
    private String nit;
    private Integer contactoId;
    private Date fechaIngreso;
}
