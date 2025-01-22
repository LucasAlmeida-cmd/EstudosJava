package com.example.exercicio1.dominio;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LerDados(@JsonAlias("item") String item,
                       @JsonAlias("nota") double nota,
                       @JsonAlias("comentario") String comentario) {
}
