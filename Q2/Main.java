package Q2;

public class Main {

  public static void main(String[] args) {

      Veiculo v1 = new Carro("LLL-7777", "Carrinho", 180.0);
      Veiculo v2 = new Van("DEF-1322", "Carrão", 190.0, 16);

      Veiculo[] veiculos = {v1, v2};

      for (Veiculo v : veiculos) {
          v.exibirDados();
          System.out.println("Diária: R$ " + v.calcularDiaria());
      }
  }
}