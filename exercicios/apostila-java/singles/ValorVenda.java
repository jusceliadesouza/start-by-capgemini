import java.util.Scanner;

public class ValorVenda {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Custo do produto: ");
    float custoProduto = ler.nextFloat();

    System.out.println("Percentual: ");
    float percent = ler.nextFloat();

    System.out.printf("Valor de venda: %.2f", custoProduto + (custoProduto * percent) / 100);

    ler.close();
  }
}
