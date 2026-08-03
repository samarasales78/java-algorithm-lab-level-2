package Q6;

public class Main {

  public static void main(String[] args) {

    FiguraGeometrica[] figuras = {
        new Circulo(5),
        new Retangulo(8, 4),
        new Triangulo(3, 4, 5)
    };

    for (FiguraGeometrica figura : figuras) {
      System.out.println("Figura: " + figura.getClass().getSimpleName());
      System.out.printf("Área: %.2f%n", figura.calcularArea());
      System.out.printf("Perímetro: %.2f%n", figura.calcularPerimetro());
      System.out.println();
    }
  }
}