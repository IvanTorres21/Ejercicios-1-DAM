
/**
 * Programa que hace la media de todos los dígitos de un número.
 *
 * @author Iván Torres
 */
import java.util.Scanner;

public class Ejercicio58 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    long num;
    do {

      System.out.print("Introduce un número entero positivo: ");
      num = Long.parseLong(s.nextLine());
    } while (num < 0);

    //Contar dígitos número.
    int cont = 1;
    do {

      if (num / (long) Math.pow(10, cont) != 0) {

        cont++;
      }
    } while (num / (long) Math.pow(10, cont) != 0);

    if (cont > 1) {
      int media = 0;
      for (int i = 1; i <= cont; i++) {

        long aux = num - ((num / (long) Math.pow(10, i)) * (long) Math.pow(10, i)); //Primer corte
        aux = aux / (long) Math.pow(10, i-1); //Segundo corte
        media += aux;
      }
      System.out.print("La media es: " + (double) media/ (double) cont);
    } else {
      System.out.print("El número tiene solo un dígito: " + num);
    }
  }
}
