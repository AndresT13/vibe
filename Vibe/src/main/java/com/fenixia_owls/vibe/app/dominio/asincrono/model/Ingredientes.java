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
@Document(collection = "ingrediente")
public class Ingredientes {

    @Id
    private String ingredientesPlatoId;

    private Integer idIngredientesPlato;
    private Integer idProveedores;
    private String nombre;
    private Double stock;
    private Double precio;
    private Date fechaIngreso;
    private Date fechaCaducidad;
}
