package Q2;

public abstract class Veiculo {

  protected String placa;
  protected String modelo;

  public Veiculo(String placa, String modelo) {
      this.placa = placa;
      this.modelo = modelo;
  }

  public void exibirDados() {
      System.out.println("Placa: " + placa);
      System.out.println("Modelo: " + modelo);
  }

  public abstract double calcularDiaria();
}