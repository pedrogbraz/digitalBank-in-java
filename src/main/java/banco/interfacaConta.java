package banco;

public interface interfacaConta {

  void sacar(double valor);
  void depositar(double valor);
  void transferir(double valor, Conta contaDestino);

  void imprimirExtratos();
}
