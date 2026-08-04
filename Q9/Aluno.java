package Q9;

public class Aluno extends Pessoa implements Autenticavel {
  
  private String matricula;
  private String curso;

  public Aluno(int id, String nome, int idade, String matricula, String curso) {
    super(id, nome, idade);
    this.matricula = matricula;
    this.curso = curso;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  @Override
  public void exibirDados() {
    System.out.println("Aluno: " + getNome() + "| Matrícula: " + getMatricula() + " | Curso: " + getCurso());
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
