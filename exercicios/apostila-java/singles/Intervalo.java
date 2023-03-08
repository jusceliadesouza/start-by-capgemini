import java.util.Scanner;

public class Intervalo {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Número: ");
    int number = ler.nextInt();

    boolean achou = false;

    for (int i = 100; i <= 200 && !achou; i++) {
      System.out.println(i);
      if (number == i)
        achou = true;
    }

    System.out.println(achou);

    if (!achou)
      System.out.printf("%d não está no intervalo!", number);
    else
      System.out.printf("%d está no intervalo!", number);

    ler.close();
  }
}
