package com.fenixia_owls.vibe.app.dominio.asincrono.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "tipo_menu")
public class TipoMenu {

    @Id
    private Long tipoMenuId; // serial

    private Integer menuId; // integer
    private String descripcion; // string
    private Double precio; // money
}
