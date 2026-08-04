package Q7;

public class Main {

  public static void main(String[] args) {

    Veiculo[] veiculos = {
        new Carro("Relampago McQueen", "Vermelho"),
        new Moto("Motoqueiro Fantasma", "Invisível"),
        new Caminhao("Optimus Prime", "Transformers")
    };

    for (Veiculo veiculo : veiculos) {

      System.out.println("Marca: " + veiculo.getMarca());
      System.out.println("Modelo: " + veiculo.getModelo());

      veiculo.ligar();
      veiculo.mover();
      veiculo.desligar();

      System.out.println();
    }
  }
}
