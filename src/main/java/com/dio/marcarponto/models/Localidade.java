package com.dio.marcarponto.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Localidade {
    @Id
    private long id;
    @ManyToOne
    private NivelDeAcesso nivelDeAcesso;
    private String descricao;
}
