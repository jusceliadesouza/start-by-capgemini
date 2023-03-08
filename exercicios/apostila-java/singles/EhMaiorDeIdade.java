import java.util.Scanner;

public class EhMaiorDeIdade {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int qntPessoas = 5;
    int idade;

    for (int i = 0; i < qntPessoas; i++) {
      System.out.printf("Idade%d:", i + 1);
      idade = ler.nextInt();

      if (idade > 18)
        System.out.println("Maior de idade");
      else
        System.out.println("Menor de idade");
    }
  }
}
