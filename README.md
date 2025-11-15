# 💰 Simulador de Conta Bancária em Java.

## 💡 Sobre o Projeto

projeto java focado em garantir a robustez do sistema. Simula operações bancárias básicas (depósito, saque, consulta) com foco no gerenciamento de regras de negócio e falhas.

## 🧠 Conceitos de Java Aplicados (Diferenciais)

* Interfaces (interface): Definição do contrato OperacoesBancarias, demonstrando Polimorfismo (a classe ContaBancaria implementa as regras).

* Tratamento de Exceções (try-catch-throw): Criação da exceção customizada SaldoInsuficienteException para lidar com saques que violam a regra de negócio.

* Encapsulamento e POO: Uso de métodos Getters (getTitular()) para proteger os dados privados.

## ⚙️ Funcionalidades

* Realiza depósito e saque. 

* Lança uma exceção controlada quando o saque ultrapassa o saldo disponível. 

* O programa não quebra e exibe uma mensagem amigável ao usuário quando a exceção é lançada.

## 💻 Como Executar

1. Clone o repositório.
   https://github.com/MariadDsoares/Simulador-de-Conta-Bancaria---Java.git
2. Compile e execute a classe SimuladorBanco.java.
