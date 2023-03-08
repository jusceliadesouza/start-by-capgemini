import java.util.Scanner;

/**
 * Questão 02: Faça um algoritmo que receba dois números e ao final mostre a
 * soma, subtração, multiplicação e a divisão dos dois números lidos;
 */

public class Operacoes {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Número1: ");
    int number1 = ler.nextInt();

    System.out.println("Número2: ");
    int number2 = ler.nextInt();

    System.out.printf("%d+%d: %d\n", number1, number2, number1 + number2);
    System.out.printf("%d-%d: %d\n", number1, number2, number1 - number2);
    System.out.printf("%d*%d: %d\n", number1, number2, number1 * number2);
    System.out.printf("%d/%d: %d\n", number1, number2, number1 / number2);

  }
}
