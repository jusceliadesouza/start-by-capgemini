import java.util.Scanner;

public class ConverteTemperatura {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("°C: ");
    float celsius = ler.nextFloat();

    System.out.printf("F = %.2f", (9 * celsius + 160) / 5);

    ler.close();
  }

}
