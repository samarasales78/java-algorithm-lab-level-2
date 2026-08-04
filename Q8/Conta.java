package Q8;

public abstract class Conta implements OperacoesBancarias {
  
  private int numero;
  private String titular;
  protected double saldo;

  public Conta(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }

  public int getNumero() {
    return numero;
  }

  public String getTitular() {
    return titular;
  }
  
  public double getSaldo() {
    return saldo;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  @Override
  public void depositar(double valor) {
    saldo += valor;
  }

  @Override
  public double consultarSaldo() {
    return saldo;
  }

  @Override
  public abstract boolean sacar(double valor);
}