package Q4;

public class Guerreiro extends Personagem {

    private double forca;

    public Guerreiro(String nome, int nivel, double forca) {
        super(nome, nivel);
        this.forca = forca;
    }

    @Override
    public double calcularAtaque() {
        return forca * nivel;
    }
}