package banco;

public abstract class Conta implements interfacaConta {
    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor; // saldo = saldo - valor
    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo += valor; // saldo = saldo + valor
    }

    @Override
    public void transferir(double valor, Conta contaDestino) { // Uma transferência, nada mais é do que um saque de uma
                                                               // conta e ou deposito em outra
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    // Agencia
    public int getAgencia() {
        return agencia;
    }

    // Número
    public int getNumero() {
        return numero;
    }

    // Saldo
    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosContas() {
        System.out.println(String.format("Titular: %s", this.cliente.getNomeCompleto()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
