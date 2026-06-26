package Q2;

public class Carro extends Veiculo {

  private double valorDiaria;

  public Carro(String placa, String modelo, double valorDiaria) {
      super(placa, modelo);
      this.valorDiaria = valorDiaria;
  }

  @Override
  public double calcularDiaria() {
      return valorDiaria;
  }
}