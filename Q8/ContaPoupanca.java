package Q8;

public class ContaPoupanca extends Conta {

  public ContaPoupanca(int numero, String titular, double saldo) {
    super(numero, titular, saldo);
  }

  @Override
  public boolean sacar(double valor) {
    if (valor <= saldo) {
      saldo -= valor;
      return true;
    }
    return false;
  }
}
