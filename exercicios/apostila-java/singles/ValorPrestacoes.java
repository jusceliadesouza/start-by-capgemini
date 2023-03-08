import java.util.Scanner;

public class ValorPrestacoes {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Valor da compra: ");
    float valor = ler.nextFloat();

    System.out.printf("Prestação: 5x R$ %.2f", valor / 5);

    ler.close();
  }
}
