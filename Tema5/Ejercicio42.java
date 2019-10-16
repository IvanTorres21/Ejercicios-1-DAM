
/**
 * Programa que pide un número entero positivo y muestra los próximos cinco números seguidos de
 * si son primos o no.
 *
 * @author Iván Torres
 */
import java.util.Scanner;

public class Ejercicio42 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int num = 0;

    do {

      System.out.print("Introduce un número entero positivo: ");
      num = Integer.parseInt(s.nextLine());
    } while (num <= 0);

    boolean primo = false;
    int divisor;
    float modulo;
    int max = num + 5;
    for (;num < max;num++) {


      System.out.print(num);
      divisor = 2;
      modulo = 0;
      do {

        modulo = (float) num % (float) divisor;
        float cociente = (float) num / (float) divisor;
        if (modulo != 0 && cociente < divisor) {

          primo = true;
        }
        divisor++;
      } while (modulo != 0 && divisor < num);
      if (primo) {

        System.out.println(" es primo");
      } else if (!primo) {

        System.out.println(" no primo");
      }
      primo = false;
    }
  }
}
