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
@Document(collection = "eventos")
public class Eventos {
    @Id
    private String eventosId;

    private Integer idEmpleado;
    private Integer idMesa;
    private String nombre;
    private Integer idMesero;
    private Date horaInicio;
    private Date horaFin;
    private Integer restauranteId;
}
