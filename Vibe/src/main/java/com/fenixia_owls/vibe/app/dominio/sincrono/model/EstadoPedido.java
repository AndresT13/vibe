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
@Document(collection = "estado_pedido")
public class EstadoPedido {

    @Id
    private String estadoPedidoId;

    private Integer idEstadoPedido;
    private String codEstadoPedido;
    private String nombreEstadoPedido;
    private String detalleEstadoPedido;
    private Date tiempoIngresoPedido;
    private Date tiempoSalidaPedido;
}
