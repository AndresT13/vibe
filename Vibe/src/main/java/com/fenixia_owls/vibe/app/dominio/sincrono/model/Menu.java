package com.fenixia_owls.vibe.app.dominio.sincrono.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "menu")
public class Menu {

    @Id
    private String menuId;

    private Integer idMenu;
    private Integer idPlato;
    private String origenPlato;
    private Date fechaCreacion;
    private String descripcion;
}
