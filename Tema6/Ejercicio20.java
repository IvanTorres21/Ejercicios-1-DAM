
import java.util.Scanner;

/**
 * Programa que imprime una cuba de una capacidad introducida por el usuario y la rellena una
 * cantidad aleatoria.
 *
 * @author Iván Torres
 */
public class Ejercicio20 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la capacidad de la cuba (entero): ");
    int capacidad = Integer.parseInt(s.nextLine());
    int litrosLlenos = (int) (Math.random() * capacidad + 1);
    for (int i = 0; i < capacidad; i++) {

      System.out.print("*");
      if (i < litrosLlenos) {
        for (int j = 0; j < 3; j++) {

          System.out.print(" ");
        }
      } else if (i >= litrosLlenos) {

        for (int j = 0; j < 3; j++) {

          System.out.print("=");
        }
      }
      System.out.println("*");
    }
    System.out.print("*****");
  }
}
