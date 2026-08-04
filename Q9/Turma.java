package Q9;

import java.util.ArrayList;

public class Turma {

  private String nome;
  private ArrayList<Aluno> alunos;

  public Turma(String nome) {
    this.nome = nome;
    this.alunos = new ArrayList<>();
  }

  public void adicionarAluno(Aluno aluno) {
    alunos.add(aluno);
  }

  public void removerAluno(Aluno aluno) {
    alunos.remove(aluno);
  }

  public void listarAlunos() {
    for (Aluno aluno : alunos) {
      aluno.exibirDados();
    }
  }

  public ArrayList<Aluno> getAlunos() {
    return alunos;
  }
}