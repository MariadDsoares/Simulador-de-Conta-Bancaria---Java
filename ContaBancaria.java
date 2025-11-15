//Classe que implementa o contrato da Interface.
public class ContaBancaria implements OperacoesBancarias {
    
    private String titular;
    private double saldo; //Atributo para armazenar o saldo.

    public ContaBancaria (String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        
    }

    public String getTitular() {
        return titular; // Retorna o valor do atributo privado 'titular'
    }
    
    // Se precisar de um Setter (para modificar o titular, se fosse o caso):
    // public void setTitular(String novoTitular) { ... }
    // Implementação do método depositar da interface.
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Erro: Valor de depósito inválido.");
        }
    }
    // Implementação do método sacar da interface, com tratamento de exceção.
    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > 0) {
            //lógica de negócios: verifica se há saldo suficiente.
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado. Novo saldo: R$" + saldo);
            } else {
                // Se a condição for falsa, LANÇA a nossa Exceção personalizada.
                throw new SaldoInsuficienteException("Saldo insuficiente para saque de R$" + valor); 
            }
        } else {
            System.out.println("Erro: Valor de saque inválido.");
        }
    }

    // Implementação do método consultarSaldo da Interface.
    @Override
    public double consultarSaldo() {
        return this.saldo;
    }
}
