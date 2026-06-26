package Q3;

public class CartaFace extends Carta {

    public CartaFace(String naipe, String valor) {
        super(naipe, valor);
    }

    @Override
    public int calcularPontuacao() {
        return 10;
    }
}