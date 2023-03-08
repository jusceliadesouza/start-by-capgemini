import java.util.Scanner;

public class QuantidadeHomensMulheres {
  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int qntPessoas = 5;

    int qntHomens = 0, qntMulheres = 0;

    for (int i = 0; i < qntPessoas; i++) {
      System.out.printf("Nome: ");
      String nome = ler.nextLine();

      System.out.printf("Gênero: ");
      String genero = ler.nextLine().toUpperCase();

      switch (genero) {
        case "M":
          qntHomens++;
          System.out.printf("%s Homem\n", nome);
          break;
        case "F":
          qntMulheres++;
          System.out.printf("%s Mulher\n", nome);
          break;
        default:
          break;
      }
    }

    System.out.printf("%d homens\n", qntHomens);
    System.out.printf("%d mulheres", qntMulheres);
  }
}
