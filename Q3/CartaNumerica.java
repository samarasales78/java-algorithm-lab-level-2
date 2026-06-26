package Q3;

public class CartaNumerica extends Carta {

    private int numero;

    public CartaNumerica(String naipe, int valor) {
        super(naipe, String.valueOf(valor));
        this.numero = valor;
    }

    @Override
    public int calcularPontuacao() {
        return numero;
    }
}