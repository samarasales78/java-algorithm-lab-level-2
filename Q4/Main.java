package Q4;

public class Main {

    public static void main(String[] args) {

        Personagem p1 = new Guerreiro("Tchico", 1, 2);
        Personagem p2 = new Mago("Vinicin", 10, 15);

        Personagem[] personagens = {p1, p2};

        for (Personagem p : personagens) {
            System.out.println(
                    p.nome + " | " +
                    p.nivel + " | " +
                    p.calcularAtaque()
            );
        }
    }
}