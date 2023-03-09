import java.util.Scanner;

/**
 * Fonte:
 * https://www.gov.br/pt-br/servicos/alistar-se-no-servico-militar-obrigatorio
 */

public class ServicoMilitar {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    String nome;
    char sexo = ' ';
    int idade = 0, saude = 0;
    int totalM = 0, totalF = 0;
    int totalAptos = 0, totalInaptos = 0;

    boolean valido = false;

    System.out.println("Quantidade de Pessoas: ");
    int n = ler.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.printf("\n---- CANDIDATO(A) %d ----\n", i + 1);
      System.out.printf("Nome: ");
      nome = ler.next().toUpperCase();

      while (sexo != 'M' && sexo != 'F') {
        System.out.printf("Gênero: [F]-Feminino [M]-Masculino ");
        sexo = ler.next().charAt(0);
        sexo = Character.toUpperCase(sexo);

        if (sexo != 'M' && sexo != 'F') {
          System.out.printf("Opção inválida! Tente novamente!\n ");
        }

      }

      while (idade <= 0) {
        System.out.printf("Idade: ");
        idade = ler.nextInt();

        if (idade <= 0) {
          System.out.printf("Digite uma idade válida maior que 0!\n ");
        }
      }

      valido = false;

      while (!valido) {
        System.out.printf("Estado de saúde: [1]-Ótima [2]-Boa [3]-Razoável [4]-Debilitada");
        saude = ler.nextInt();

        switch (saude) {
          case 1:
          case 2:
          case 3:
          case 4:
            valido = true;
            break;
          default:
            System.out.printf("Opção inválida! Tente novamente!\n ");
            break;
        }
      }

      // Saídas
      System.out.printf("%s ", nome);

      if (sexo == 'M') {
        System.out.printf("Masculino ");
        totalM++;
      } else {
        System.out.printf("Feminino ");
        totalF++;
      }

      System.out.printf("%d anos ", idade);

      switch (saude) {
        case 1:
          System.out.printf("Ótima saúde ");
          break;
        case 2:
          System.out.printf("Boa saúde ");
          break;
        case 3:
          System.out.printf("Saúde razoável ");
          break;
        case 4:
          System.out.printf("Saúde debilitada ");
          break;
        // Supondo que não haverá erros na entrada, não haverá necessidade de default
      }

      if (idade < 18 || saude == 4 || sexo == 'F') {
        System.out.printf("Inaptidão para ao serviço militar ");
        totalInaptos++;
      } else {
        System.out.printf("Aptidão para o serviço militar obrigatório");
        totalAptos++;
      }

    }
    System.out.printf("\n=========== RESULTADO FINAL ===========\n");
    System.out.printf("Aptos: %d\n", totalAptos);
    System.out.printf("Inaptos: %d\n", totalInaptos);
  }
}