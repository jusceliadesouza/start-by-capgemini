import java.util.Scanner;

public class MediaAritmetica {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Aluno:");
    String aluno = ler.nextLine();

    float media = 0;

    for (int i = 0; i < 3; i++) {
      System.out.printf("Nota%d:", i + 1);
      media += ler.nextInt();
    }

    System.out.printf("%s %.2f", aluno, Math.round(media / 3));
  }
}
