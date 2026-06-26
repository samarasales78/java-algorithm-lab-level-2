package Q4;

public abstract class Personagem {

    protected String nome;
    protected int nivel;

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
    }

    public abstract double calcularAtaque();
}