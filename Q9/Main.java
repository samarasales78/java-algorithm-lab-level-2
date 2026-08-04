package Q9;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    Escola escola = new Escola("UEPB", "CG");
    Aluno aluno = new Aluno(1, "Samara", 19, "200000", "ADS");
    Professor professor = new Professor(2, "Maria", 42, "POO", 4000);

    escola.adicionarPessoa(aluno);
    escola.adicionarPessoa(professor);

    escola.listarPessoas();

    Turma turma = new Turma("POO - Turma A");
    turma.adicionarAluno(aluno);

    turma.listarAlunos();

    ArrayList<Pessoa> pessoas = new ArrayList<>();
    pessoas.add(aluno);
    pessoas.add(professor);

    for (Pessoa p : pessoas) {
      p.exibirDados();

      if (p instanceof Autenticavel) {
        ((Autenticavel) p).login();
      }
    }
  }
}
