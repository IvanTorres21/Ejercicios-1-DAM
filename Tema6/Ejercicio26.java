
import java.util.Scanner;

/**
 * Programa que imprime una tableta de turrón de tamaño introducido por el usuario y se le da un
 * bocado en una posción aleatoria.
 *
 * @author Iván Torres
 */
public class Ejercicio26 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int ancho;
    int alto;
    do {
      System.out.print("Introduzca la altura y el ancho de la tableta de turrón: ");
      ancho = s.nextInt();
      alto = s.nextInt();
      s.nextLine();
      if (ancho <= 0 || alto <= 0) {
        System.out.println("No pueden ser menor o igual a 0");
      }
    } while (ancho <= 0 || alto <= 0);

    int bocadoY = (int) (Math.random() * alto);
    int bocadoX = (int) (Math.random() * 2);
    if (bocadoX == 1) {
      
      bocadoX = ancho - 1;
    }
    for (int i = 0; i < alto; i++) {

      for (int j = 0; j < ancho; j++) {

        if (bocadoX == j && bocadoY == i) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
