package Q8;

public class Main {

  public static void main(String [] args) {

    Conta conta1 = new ContaCorrente(101, "João", 1000);
    Conta conta2 = new ContaCorrente(202, "Maria", 2000);
  
    conta1.depositar(500);
    conta1.sacar(300);

    conta2.depositar(200);
    conta2.sacar(1000);

    System.out.println("Conta Corrente");
    System.out.println("Titular: " + conta1.getTitular());
    System.out.println("Saldo: R$ " + conta1.consultarSaldo());

    System.out.println();

    System.out.println("Conta Poupança");
    System.out.println("Titular: " + conta2.getTitular());
    System.out.println("Saldo: R$ " + conta2.consultarSaldo());
  }
}
