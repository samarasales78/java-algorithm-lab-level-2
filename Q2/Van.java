package Q2;

public class Van extends Veiculo {

  private double valorBase;
  private int quantidadeAssentos;

  public Van(String placa, String modelo, double valorBase, int quantidadeAssentos) {
      super(placa, modelo);
      this.valorBase = valorBase;
      this.quantidadeAssentos = quantidadeAssentos;
  }

  @Override
  public double calcularDiaria() {
      return valorBase + (quantidadeAssentos * 5.0);
  }
}