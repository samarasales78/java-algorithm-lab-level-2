package Q5;

public class Main {
  
  public static void main(String [] args) {

    Funcionario gerente = new Gerente("ANA", 1200);
    Funcionario programador = new Programador("JOÃO", 1100);

    gerente.exibirDados();
    System.out.println(" | Salário final = R$ " + gerente.calcularSalarioFinal());

    System.out.println();

    programador.exibirDados();
    System.out.println(" | Salário final = R$ " + programador.calcularSalarioFinal());

  }
}
