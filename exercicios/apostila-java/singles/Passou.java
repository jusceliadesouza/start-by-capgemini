import java.util.Scanner;

public class Passou {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Aluno:");
    String aluno = ler.nextLine();

    float media = 0;

    for (int i = 0; i < 3; i++) {
      System.out.printf("Nota%d:", i + 1);
      media += ler.nextFloat();
    }

    media /= 3;

    if (media >= 7)
      System.out.printf("%s [APROVADO]", aluno);
    else if (media <= 5)
      System.out.printf("%s [REPROVADO]", aluno);
    else
      System.out.printf("%s [RECUPERAÇÃO]", aluno);

    ler.close();
  }
}
