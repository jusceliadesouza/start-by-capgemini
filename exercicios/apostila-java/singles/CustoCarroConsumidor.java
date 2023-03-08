import java.util.Scanner;

public class CustoCarroConsumidor {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.printf("Custo de fábrica: R$ ");
    float custo = ler.nextFloat();

    float impostos = (custo * 45) / 100;
    float distribuidor = ((custo + impostos) * 28) / 100;

    System.out.printf("Custo ao consumidor: R$ %.2f", custo + distribuidor);

    ler.close();
  }
}
