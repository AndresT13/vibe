package com.fenixia_owls.vibe.app.dominio.asincrono.model;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Document(collection = "reserva")
public class Reserva {

    private String reservaId;

    private Integer idReserva;
    private Integer numeroMesa;
    private Integer comensalId;
    private Date fechaReserva;
    private Integer restauranteId;

}
