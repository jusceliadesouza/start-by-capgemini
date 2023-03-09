import java.util.Scanner;
import java.util.Arrays;

public class OrdemCrescente {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int[] valor = new int[3];

    // Leitura dos dados
    for (int i = 0; i < valor.length; i++) {
      System.out.printf("Valor%d:", i + 1);
      valor[i] = ler.nextInt();
    }

    Arrays.sort(valor);

    for (int i : valor) {
      System.out.printf("%d ", i);
    }

    ler.close();
  }
}
