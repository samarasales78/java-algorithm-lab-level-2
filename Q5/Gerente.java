package Q5;

public class Gerente extends Funcionario {
  
  public Gerente (String nome, double salario) {
    super(nome, salario);
  }

  @Override
  public double calcularSalarioFinal() {
    return getSalario() * 1.20;
  }
}