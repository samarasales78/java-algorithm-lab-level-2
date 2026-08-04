package Q8;

public interface OperacoesBancarias {
  
  public void depositar(double valor);
  
  public boolean sacar(double valor);

  public double consultarSaldo();
}
