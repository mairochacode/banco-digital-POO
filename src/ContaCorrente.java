public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(Cliente cliente, String numeroConta, double limite) {
        super(cliente, numeroConta);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (saldo + limite)) {
            saldo -= valor;
        } else {
            System.out.println("Limite excedido!");
        }
    }
}