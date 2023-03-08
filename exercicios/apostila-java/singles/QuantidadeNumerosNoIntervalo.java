import java.util.Scanner;

public class QuantidadeNumerosNoIntervalo {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int qntNumeros = 5;
    int numero, soma = 0;

    for (int i = 0; i < qntNumeros; i++) {
      System.out.printf("Número%d:", i + 1);
      numero = ler.nextInt();

      if (numero >= 10 && numero <= 150)
        soma++;
    }

    System.out.printf("Há %d números no intervalo!", soma);
  }
}
