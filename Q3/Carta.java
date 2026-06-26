package Q3;

public abstract class Carta {

    protected String naipe;
    protected String valor;

    public Carta(String naipe, String valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public void exibirCarta() {
        System.out.println("Naipe: " + naipe);
        System.out.println("Valor: " + valor);
    }

    public abstract int calcularPontuacao();
}