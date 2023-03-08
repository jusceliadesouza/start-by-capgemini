import java.util.Scanner;

public class Comissão {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Vendedor: ");
    String vendedor = ler.nextLine();

    System.out.println("Salário: ");
    float salarioFixo = ler.nextFloat();

    System.out.println("Vendas no mês: ");
    float vendas = ler.nextFloat();

    int comissao = 15;

    float salario = salarioFixo + ((vendas * comissao) / 100);

    System.out.printf("Vendedor: %s \nSalário Fixo: R$ %.2f\nSalário: R$ %.2f", vendedor, salarioFixo, salario);
  }
}
