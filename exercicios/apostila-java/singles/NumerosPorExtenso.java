import java.util.Scanner;

public class NumerosPorExtenso {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    boolean valido = false;

    // Leitura de dados
    System.out.printf("Número:");
    int numero = ler.nextInt();

    while (!valido) {
      switch (numero) {
        case 1:
          System.out.println("Um");
          valido = true;
          break;
        case 2:
          System.out.println("Dois");
          valido = true;
          break;
        case 3:
          System.out.println("Três");
          valido = true;
          break;
        case 4:
          System.out.println("Quatro");
          valido = true;
          break;
        case 5:
          System.out.println("Cinco");
          valido = true;
          break;
        default:
          valido = false;
          System.out.println("Número inválido\n");

          System.out.printf("Número:");
          numero = ler.nextInt();
          valido = true;
          break;
      }
    }
  }
}
