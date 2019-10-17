
/**
 * Programa que imprime un reloj de arena multiples veces con altura variante y caracter elegido por
 * el usuario.
 *
 * @author Iván Torres
 */
import java.util.Scanner;

public class EjercicioSorpresa2 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int altura = 0;
    int repeticiones = 0;
    char caracter;
    do {

      System.out.print("Introduzca la altura del reloj: ");
      altura = Integer.parseInt(s.nextLine());
      if (altura < 3 || altura % 2 == 0) {
        System.out.println("La altura tiene que ser mayor que 3 e impar");
      }
    } while (altura < 3 || altura % 2 == 0);
    do {

      System.out.print("Introduzca las repeticiones: ");
      repeticiones = Integer.parseInt(s.nextLine());
      if (repeticiones < 0) {

        System.out.println("Como mínino tiene que ser 0 repeticiones");
      }
    } while (repeticiones < 0);
    System.out.print("Introduzca el caracter con el que quiere hacerlo: ");
    caracter = (s.nextLine()).charAt(0);

    //Dibujo de reloj.
    System.out.println("\n\n");
    for (int h = 0; h < repeticiones; h++) {
      int caracterPorLinea = altura;
      int espaciosPorLinea = 0;
      for (int i = 0; i < altura; i++) {

        if (i < altura / 2) {

          for (int k = 0; k < espaciosPorLinea; k++) {

            System.out.print(" ");
          }

          for (int j = 0; j < (caracterPorLinea); j++) {

            System.out.print(caracter);
          }
          caracterPorLinea -= 2;
          espaciosPorLinea++;
        } else {

          for (int k = 0; k < espaciosPorLinea; k++) {

            System.out.print(" ");
          }

          for (int j = 0; j < (caracterPorLinea); j++) {

            System.out.print(caracter);
          }
          caracterPorLinea += 2;
          espaciosPorLinea--;

        }
        System.out.println();
      }
      System.out.println("\n\n\n");
    }
  }
}
