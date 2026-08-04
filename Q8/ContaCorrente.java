package Q8;

public class ContaCorrente extends Conta {

  public ContaCorrente(int numero, String titular, double saldo) {
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
