package banco;

public class ContaPoupanca extends Conta {

  public ContaPoupanca(Cliente cliente) {
    super(cliente);
  }

  @Override
  public void imprimirExtratos() {
    System.out.println("=== Extrato Conta Poupança ===");
    imprimirInfosContas();
  }

}
