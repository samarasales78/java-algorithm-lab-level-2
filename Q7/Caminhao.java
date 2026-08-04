package Q7;

public class Caminhao extends Veiculo {

  public Caminhao(String marca, String modelo) {
    super(marca, modelo);
  }

  @Override
  public void mover() {
    System.out.println("O caminhão está transportando carga.");
  }
}
