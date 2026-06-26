package Q3;

public class As extends Carta {

    public As(String naipe) {
        super(naipe, "Ás");
    }

    @Override
    public int calcularPontuacao() {
        return 11;
    }
}