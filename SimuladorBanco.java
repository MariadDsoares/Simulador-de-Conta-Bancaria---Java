public class SimuladorBanco {

    public static void main(String[] args) {
        // Cria um novo objeto ContaBancaria.
        ContaBancaria minhaConta = new ContaBancaria("Maria Dev", 500.00); 

        System.out.println("--- Saldo Inicial ---");
        System.out.println("Saldo de " + minhaConta.getTitular() + ": R$" + minhaConta.consultarSaldo());

        // 1. Simulação de Depósito
        minhaConta.depositar(150.00); 
        
        // 2. Simulação de Saque BEM-SUCEDIDO
        try {
            // TENTA executar o saque.
            minhaConta.sacar(100.00); 
        } catch (SaldoInsuficienteException e) {
            // Este bloco é ignorado se o saque for bem-sucedido.
            System.err.println("Ocorreu um erro (catch): " + e.getMessage()); 
        }

        // 3. Simulação de Saque com ERRO (Tratamento de Exceção)
        System.out.println("\n--- Tentativa de Saque Excedente ---");
        // O saldo atual é 550.00.
        try {
            // TENTA sacar um valor maior que o saldo.
            minhaConta.sacar(600.00); 
        } catch (SaldoInsuficienteException e) {
            // O catch CAPTURA a exceção lançada pelo método sacar().
            // Isso permite que o programa continue rodando sem "quebrar".
            System.err.println("ERRO DETECTADO (catch): " + e.getMessage()); 
        }

        System.out.println("\n--- Saldo Final ---");
        System.out.println("Saldo de " + minhaConta.getTitular() + ": R$" + minhaConta.consultarSaldo());
    }
}


