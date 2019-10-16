
/**
 * Programa que pide numeros por teclado hasta que introduzca uno primo y calcula la media, el
 * máximo y el mínimo.
 *
 * @author Iván Torres.
 */
import java.util.Scanner;

public class Ejercicio49 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Introduzca números, cuando quiera parar introduzca un número primo");

    double media = 0;
    double max = 0;
    double min = 0;
    boolean primerNumIntroducido = false;
    boolean primo = false;
    int cantNum = 0;
    do {

      double num = Double.parseDouble(s.nextLine());
      int divisor = 2;
      do {

        if (num % (double) divisor != 0 && num / (double) divisor > divisor) {

          primo = true;
        }
        divisor++;
      } while (divisor < num && num % (float) divisor == 0);
      if (!primo) {
        media += num;
        if (!primerNumIntroducido) {

          max = num;
          min = num;
          primerNumIntroducido = true;
        } else {

          if (num < min) {

            min = num;
          }
          if (num > max) {

            max = num;
          }
        }
        cantNum++;
      }
    } while (!primo);

    System.out.println("La media es: " + media / cantNum);
    System.out.println("El máx es: " + max);
    System.out.println("El mín es: " + min);
  }
}
