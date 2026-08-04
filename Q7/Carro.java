package Q7;

public class Carro extends Veiculo {

  public Carro(String marca, String modelo) {
    super(marca, modelo);
  }
  
  @Override 
  public void mover() {
    System.out.println("O carro está andando pela estrada.");
  }
}
