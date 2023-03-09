import java.util.Scanner;

public class QualEhOMes {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    boolean valido = true;

    do {
      System.out.println("Mês:");
      int mes = ler.nextInt();

      switch (mes) {
        case 1:
          System.out.print("Janeiro");
          valido = true;
          break;
        case 2:
          System.out.print("Fevereiro");
          valido = true;
          break;
        case 3:
          System.out.print("Março");
          valido = true;
          break;
        case 4:
          System.out.print("Abril");
          valido = true;
          break;
        case 5:
          System.out.print("Maio");
          valido = true;
          break;
        case 6:
          System.out.print("Junho");
          valido = true;
          break;
        case 7:
          System.out.print("Julho");
          valido = true;
          break;
        case 8:
          System.out.print("Agosto");
          valido = true;
          break;
        case 9:
          System.out.print("Setembro");
          valido = true;
          valido = true;
          break;
        case 10:
          System.out.print("Outubro");
          valido = true;
          break;
        case 11:
          System.out.print("Novembro");
          valido = true;
          break;
        case 12:
          System.out.print("Dezembro");
          valido = true;
          break;
        default:
          System.out.print("Mês inválido\n");
          valido = false;
          break;
      }
    } while (!valido);

    ler.close();
  }
}
