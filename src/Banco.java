import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void criarConta(Cliente cliente, String tipoConta, String numeroConta) {
        Conta novaConta;
        if (tipoConta.equalsIgnoreCase("corrente")) {
            novaConta = new ContaCorrente(cliente, numeroConta, 1000.0); // Exemplo de limite
        } else {
            novaConta = new ContaPoupanca(cliente, numeroConta);
        }
        contas.add(novaConta);
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println("Conta: " + conta.getNumeroConta() + ", Cliente: " + conta.cliente.getNome() + ", Saldo: " + conta.getSaldo());
        }
    }
}