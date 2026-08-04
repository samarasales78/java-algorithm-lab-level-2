package Q9;

public class Professor extends Pessoa implements Autenticavel {
  
  private String disciplina;
  private double salario;

  public Professor(int id, String nome, int idade, String disciplina, double salario) {
    super(id, nome, idade);
    this.disciplina = disciplina;
    this.salario = salario;
  }

  public String getDisciplina() {
    return disciplina;
  }

  public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  @Override
  public void exibirDados() {
    System.out.println("Professor: " + getNome() + "| Disciplina: " + disciplina + "| Salário: " + salario);
  }

  @Override
  public void login() {
    System.out.println(getNome() + " fez login.");

  }

  @Override 
  public void logout() {
    System.out.println(getNome() + " fez logout.");
  }

}
