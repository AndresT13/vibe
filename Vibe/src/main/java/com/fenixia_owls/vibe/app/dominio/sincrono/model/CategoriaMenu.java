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
@Document(collection = "categoria_menu")
public class CategoriaMenu {

    @Id
    private String categoriaId;

    private Integer idCategoria;
    private Integer idCategoriaMenu;
    private Integer codCategoria;
    private String nombreCategoria;
    private Date fechaCrecion;
    private Boolean visible;
}
