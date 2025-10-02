# Mock Bank API (Banco B)

![Java](https://img.shields.io/badge/Java-21-orange.svg)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green.svg)

## 📖 Visão Geral

Esta é uma API REST simples construída com Spring Boot, projetada para simular os serviços de um banco fictício (o "Banco B").

Ela faz parte do ecossistema do projeto **"Meu Gestor Open Finance"** e serve como uma fonte de dados para a aplicação principal, que agrega informações de múltiplas contas.

Os dados retornados por esta API são fixos (hardcoded) e servem apenas para fins de demonstração e desenvolvimento do agregador principal.

---

## Endpoints Disponíveis

A API expõe dois endpoints para consulta de dados de uma conta.

### Obter Saldo
Retorna o saldo fixo da conta.

* **Endpoint:** `GET /contas/{id}/saldo`
* **Exemplo de Resposta:**
  ```json
  {
    "saldo": 1550.75
  }
  ```

### Obter Extrato
Retorna uma lista fixa de transações recentes.

* **Endpoint:** `GET /contas/{id}/extrato`
* **Exemplo de Resposta:**
  ```json
  [
    {
      "data": "2025-10-01",
      "descricao": "Compra no Supermercado",
      "valor": -150.45
    },
    {
      "data": "2025-09-30",
      "descricao": "Pagamento Salário",
      "valor": 3500.00
    },
    {
      "data": "2025-09-29",
      "descricao": "Restaurante",
      "valor": -80.00
    }
  ]
  ```

---

## 🛠️ Tech Stack

-   Java 21
-   Spring Boot 3
-   Spring Web
-   Maven

---

## 🚀 Como Executar

Esta aplicação está configurada para rodar na porta `8081`.

1.  Clone o repositório.
2.  Navegue até a pasta raiz do projeto.
3.  Execute o comando:
    ```bash
    mvn spring-boot:run
    ```