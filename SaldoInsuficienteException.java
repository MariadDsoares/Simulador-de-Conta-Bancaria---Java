// Cria uma Exceção personalizada, herdando de Exception.
public class SaldoInsuficienteException extends Exception {
    // Construtor que aceita uma mensagem de erro.
    public SaldoInsuficienteException(String mensagem) {
        // Passa a mensagem para o construtor da classe Exception pai.
        super(mensagem); 
    }


}
