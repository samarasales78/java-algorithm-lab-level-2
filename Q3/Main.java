package Q3;

public class Main {

    public static void main(String[] args) {

        Carta c1 = new CartaNumerica("Copas", 7);
        Carta c2 = new CartaFace("Espadas", "Rei");
        Carta c3 = new As("Ouros");

        Carta[] cartas = {c1, c2, c3};

        for (Carta carta : cartas) {
            carta.exibirCarta();
            System.out.println("Pontuação: " + carta.calcularPontuacao());
            System.out.println(" ");
        }
    }
}