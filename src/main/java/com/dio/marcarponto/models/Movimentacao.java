package com.dio.marcarponto.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Movimentacao {



  @NoArgsConstructor
  @AllArgsConstructor
  @EqualsAndHashCode
  @Embeddable
  public class MovimentoId implements Serializable {
      private long idMovimento;
      private long idUsuario;
  }
  @EmbeddedId
  private MovimentoId id;
  private LocalDateTime dataEntrada;
  private LocalDateTime dataSaida;
  private BigDecimal periodo;
  @ManyToOne
  private Ocorrencia ocorrencia;
  @ManyToOne
  private Calendario calendario;

}
