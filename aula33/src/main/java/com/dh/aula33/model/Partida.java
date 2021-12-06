package com.dh.aula33.model;

import com.dh.aula33.enums.Status;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Optional;

@Document(collection = "partida")
@Getter
@Setter
public class Partida {
    @Id
    private String id;
    private Status status;
    private String resultado;
    @Field(name =  "time_local")
    private Time timeLocal;
    @Field(name =  "time_visitante")
    private Time timeVisitante;
}
