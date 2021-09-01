package com.dio.marcarponto.models;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BancoDeHoras {
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BancoDeHorasId implements Serializable {
        private long idBancoDeHoras;
        private long idMovimentacao;
        private long idUsuario;
    }

    @EmbeddedId
    private BancoDeHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal qtdHorasTrabalhada;
    private BigDecimal saldoHoras;

}
