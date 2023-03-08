import java.util.Scanner;

public class QualEhMaior {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Número1: ");
    int number1 = ler.nextInt();

    System.out.println("Número2: ");
    int number2 = ler.nextInt();

    if (number1 > number2)
      System.out.printf("%d > %d!", number1, number2);
    else
      System.out.printf("%d é %d!", number2, number1);
  }
}
