package Q7;

public abstract class Veiculo {
  
  private String marca;
  private String modelo;

  public Veiculo(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public void ligar() {
    System.out.println("O veículo foi ligado.");
  }

  public void desligar() {
    System.out.println("O veículo foi desligado.");
  }

  public abstract void mover();
}
