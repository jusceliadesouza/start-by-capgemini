import java.util.Scanner;

/**
 * Questão 01: Faça um algoritmo que receba dois números e exiba o resultado da
 * sua soma
 */

public class Soma {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Número 1: ");
    int number1 = ler.nextInt();

    System.out.println("Número 2: ");
    int number2 = ler.nextInt();

    System.out.println(number1 + number2);
    ler.close();
  }
}
