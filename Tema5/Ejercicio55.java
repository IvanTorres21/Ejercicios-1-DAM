
/**
 * Programa que mueve los dígitos de un número introducido a la izquierda
 *
 * @author Iván Torres
 */
import java.util.Scanner;

public class Ejercicio55 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    long num;
    do {

      System.out.print("Introduzca un número entero positivo: ");
      num = Integer.parseInt(s.nextLine());
    } while (num < 0);

    //Contar dígitos
    int cont = 1;
    do {

      if (num / (long) Math.pow(10, cont) != 0) {

        cont++;
      }
    } while (num / (long) Math.pow(10, cont) != 0);

    if (cont > 1) {
      long aux = num - (num / 10 * 10);
      long nuevoNum = (aux * (long) Math.pow(10, cont - 1) + (num / 10));
      System.out.print("El número es: " + nuevoNum);
    } else {
      System.out.print("El número es de un dígito: " + num);
    }
  }
}
