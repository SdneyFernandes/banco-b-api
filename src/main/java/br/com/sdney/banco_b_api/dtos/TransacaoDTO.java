package br.com.sdney.banco_b_api.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

public record TransacaoDTO(LocalDate data, String descricao, BigDecimal valor) {
}
