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
@Document(collection = "pedido")
public class Pedido {

    @Id
    private String pedidoId;

    private Integer idPedido;
    private Integer facturaId;
    private Integer grupoId;
    private Integer productoId;
    private Integer cantidad;
    private Date tiempo;
    private Double precio;
    private Integer empleadoId;
    private Integer restauranteId;

}
