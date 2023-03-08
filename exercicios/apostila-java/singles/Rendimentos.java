import java.util.Scanner;

public class Rendimentos {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Valor do depósito (R$): ");
    double deposito = ler.nextDouble();

    double juroFixo = 0.07;

    System.out.printf("Rendimentos: R$ %.2f", deposito * juroFixo);
  }
}
