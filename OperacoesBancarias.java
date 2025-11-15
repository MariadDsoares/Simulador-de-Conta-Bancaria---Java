// Define um "contrato" de métodos que qualquer classe de conta deve seguir.
public interface OperacoesBancarias {
    // Métodos abstratos (sem corpo), a serem implementados pela classe conta.
    public void depositar(double valor);
    public void sacar(double valor) throws Exception; //indica que o método pode lançar uma exceção.
    public double consultarSaldo();
}
