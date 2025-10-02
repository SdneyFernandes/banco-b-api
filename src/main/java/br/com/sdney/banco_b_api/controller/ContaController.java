package br.com.sdney.banco_b_api.controller;

import br.com.sdney.banco_b_api.dtos.SaldoDTO;
import br.com.sdney.banco_b_api.dtos.TransacaoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContaController {

    @GetMapping("/{id}/saldo")
    public ResponseEntity<SaldoDTO> getSaldo(@PathVariable String id) {
        // Retorna um saldo fixo, simulando o Banco B
        SaldoDTO saldo = new SaldoDTO(new BigDecimal("4230.10"));
        return ResponseEntity.ok(saldo);
    }

    @GetMapping("/{id}/extrato")
    public ResponseEntity<List<TransacaoDTO>> getExtrato(@PathVariable String id) {
        // Retorna uma lista de transações fixas, simulando o Banco B
        List<TransacaoDTO> extrato = List.of(
        new TransacaoDTO(LocalDate.now(), "Compra Online", new BigDecimal("-299.90")),
        new TransacaoDTO(LocalDate.now().minusDays(2), "Transferência Recebida", new BigDecimal("500.00"))
);
        return ResponseEntity.ok(extrato);
    }
}