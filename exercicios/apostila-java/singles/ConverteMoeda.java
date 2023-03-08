import java.util.Scanner;

public class ConverteMoeda {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Cotação (R$): ");
    float cotacao = ler.nextFloat();

    System.out.println("US$: ");
    float valorDolar = ler.nextFloat();

    System.out.printf("CONVERSÃO DE MOEDAS\nUS$ %.2f - R$ %.2f", valorDolar, valorDolar * cotacao);
  }
}
