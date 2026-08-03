package Q5;

public class Programador extends Funcionario {
  
  public Programador (String nome, double salario) {
    super(nome, salario);
  }

  @Override
  public double calcularSalarioFinal() {
    return getSalario() * 1.10;
  }
}
