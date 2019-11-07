
import java.util.Scanner;

/**
 * Programa que imprime una pecera de tamaño aleatorio e imprime un caballito de mar, un pez y una
 * caracola.
 *
 * @author Iván Torres
 */
public class Ejercicio30 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la altura y la base de la pecera: ");
    int altura;
    int ancho;
    do {

      altura = s.nextInt();
      ancho = s.nextInt();
      s.nextLine();
      if (altura < 4 || ancho < 4) {

        System.out.print("Las medidas mínimas son de 4 x 4");
      }
    } while (altura < 4 || ancho < 4);

    ancho -= 2;
    int posPezX;
    int posPezY;
    int posCarX;
    int posCarY;
    int posCabX;
    int posCabY;
    do {

      posPezX = (int) (Math.random() * ancho);
      posPezY = (int) (Math.random() * (altura - 2)) + 1;
      posCarX = (int) (Math.random() * ancho);
      posCarY = (int) (Math.random() * (altura - 2)) + 1;
      posCabX = (int) (Math.random() * ancho);
      posCabY = (int) (Math.random() * (altura - 2)) + 1;
      
    } while((posPezX == posCarX && posPezY == posCarY) || (posPezX == posCabX && posPezY == posCabY)
            || (posCarX == posCabX && posCarY == posCabY));
    
    
    for (int i = 0; i < altura; i++) {

      System.out.print("*");
      for (int j = 0; j < ancho; j++) {

        if (i != 0 && i != altura - 1) {

          if (posPezY == i && posPezX == j) {

            System.out.print("&");
          } else if (posCarY == i && posCarX == j) {

            System.out.print("@");
          } else if (posCabY == i && posCabX == j) {

            System.out.print("$");
          } else {

            System.out.print(" ");
          }
        } else {

          System.out.print("*");
        }
      }
      System.out.print("*");
      System.out.println();
    }
    
    System.out.print("Pez: " + posPezX + " " + posPezY + " Caballito: " + posCabX + " " + posCabY + " Caracola: " + posCarX + " " + posCarY);
  }
}
