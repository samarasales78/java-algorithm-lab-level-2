package Q4;

public class Mago extends Personagem {

    private double poderMagico;

    public Mago(String nome, int nivel, double poderMagico) {
        super(nome, nivel);
        this.poderMagico = poderMagico;
    }

    @Override
    public double calcularAtaque() {
        return poderMagico * nivel;
    }
}