import java.util.Scanner;

/**
 * Escreva um algoritmo para determinar o consumo médio de um automóvel sendo
 * fornecida a distância
 * total percorrida pelo automóvel e o total de combustível gasto;
 */

public class ConsumoMedio {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Distância: ");
    float distancia = ler.nextFloat();

    System.out.println("Combustível gasto: ");
    float gasto = ler.nextFloat();

    System.out.printf("Consumo médio de %.2f Km/l", distancia / gasto);

    ler.close();
  }
}
