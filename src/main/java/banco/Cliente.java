package banco;

public class Cliente {

  private String nomeCompleto;
  private long cpf;

  // Nome Completo
  public String getNomeCompleto() {
    return nomeCompleto;
  }

  public void setNomeCompleto(String nomeCompleto) {
    this.nomeCompleto = nomeCompleto;
  }

  // CPF
  public long getCpf() {
    return cpf;
  }
  public void setCpf(long cpf) {
    this.cpf = cpf;
  }

}
