package Q9;

import java.util.ArrayList;

public class Escola {

  private String nome;
  private String endereco;
  private ArrayList<Pessoa> pessoas;

  public Escola(String nome, String endereco) {
    this.nome = nome;
    this.endereco = endereco;
    this.pessoas = new ArrayList<>();
  }

  public void adicionarPessoa(Pessoa pessoa) {
    pessoas.add(pessoa);
  }

  public void removerPessoa(Pessoa pessoa) {
    pessoas.remove(pessoa);
  }

  public Pessoa buscarPessoa(String nome) {
    for (Pessoa pessoa : pessoas) {
      if (pessoa.getNome().equalsIgnoreCase(nome)) {
        return pessoa;
      }
    }
    return null;
  }

  public void listarPessoas() {
    for (Pessoa pessoa : pessoas) {
      pessoa.exibirDados();
    }
  }

  public ArrayList<Pessoa> getPessoas() {
    return pessoas;
  }
}
