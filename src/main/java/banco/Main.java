package banco;

public class Main {
    public static void main(String[] args) {
        Cliente pedrogbraz = new Cliente();
        pedrogbraz.setNomeCompleto("Pedro");

        Conta corrente = new ContaCorrente(pedrogbraz);
        Conta poupanca = new ContaPoupanca(pedrogbraz);

        corrente.depositar(100);
        corrente.transferir(100, poupanca);

        corrente.imprimirExtratos();
        poupanca.imprimirExtratos();
    }
}
