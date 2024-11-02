package com.fenixia_owls.vibe.app.dominio.sincrono.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "categoria_ingredientes")
public class CategoriaIngredientes {

    @Id
    private String categoriaId;
    private Integer idCategoriaPlato;
    private String categoria;

}
