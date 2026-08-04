package Q7;

public class Moto extends Veiculo{

  public Moto(String marca, String modelo) {
    super(marca, modelo);
  }

  @Override
  public void mover() {
    System.out.println("A moto está acelerando pela rua.");
  }
}
