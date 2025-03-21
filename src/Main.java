public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        banco.criarConta(cliente1, "corrente", "001");

        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00");
        banco.criarConta(cliente2, "poupanca", "002");

        banco.listarContas();
    }
}