package com.dh.aula33.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Time {
    @Id
    private String id;
    private String nome;
    private String pais;
}
