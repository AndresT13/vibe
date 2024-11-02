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

@Document(collection = "fotos")
public class Fotos {

    @Id
    private String fotosId;

    private Integer idFoto;
    private Integer idComensale;
    private Integer idColaborador;
    private Integer idMenu;
    private Integer idDatosContacto;
    private Integer idPlato;
    private Integer idIngrediente;
    private String nombre;
    private byte[] datosBinarios;
    private Date fechaCreacion;

}
