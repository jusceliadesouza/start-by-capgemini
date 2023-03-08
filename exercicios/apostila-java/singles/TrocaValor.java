import java.util.Scanner;

public class TrocaValor {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("A:");
    int a = ler.nextInt();

    System.out.println("B:");
    int b = ler.nextInt();

    int aux = a;
    a = b;
    b = aux;

    System.out.printf("A: %d B: %d", a, b);

    ler.close();
  }
}
