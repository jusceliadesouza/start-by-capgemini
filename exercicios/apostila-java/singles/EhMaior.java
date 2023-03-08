import java.util.Scanner;

public class EhMaior {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Número: ");
    int number = ler.nextInt();

    if (number > 10)
      System.out.printf("%d é maior que 10!", number);
    else
      System.out.printf("%d é menor que 10!", number);

    ler.close();
  }
}
