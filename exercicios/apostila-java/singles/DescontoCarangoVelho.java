import java.util.Scanner;

public class DescontoCarangoVelho {
  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    boolean continua = true;

    double desconto = 0;

    int totalParcial = 0; // carros até 2000
    int totalGeral = 0;

    while (continua) {
      totalGeral++;

      System.out.printf("Valor do veículo: ");
      float valorVeiculo = ler.nextFloat();

      System.out.printf("Ano do veículo: ");
      int anoVeiculo = ler.nextInt();

      if (anoVeiculo <= 2000) {
        totalParcial++;
        desconto = valorVeiculo * 0.12;
      } else {
        desconto = valorVeiculo * 0.07;
      }

      System.out.printf("Desconto: R$ %.2f\n", desconto);
      System.out.printf("Valor final: R$ %.2f\n", valorVeiculo - desconto);

      System.out.printf("Deseja continuar? [N]-Não\n");

      char opcao = ler.next().charAt(0);
      opcao = Character.toUpperCase(opcao);

      if (opcao == 'N') {
        continua = false;
      }

    }
    ;

    System.out.printf("Carros até ano 2000: %d\n", totalParcial);
    System.out.printf("Total Geral: %d", totalGeral);

    ler.close();
  }
}
