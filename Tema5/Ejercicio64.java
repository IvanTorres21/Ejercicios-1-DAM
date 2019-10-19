
/**
 * Ejercicio que imprime un rectangulo por pantalla y deja al usuario modificarlo.
 *
 * @author Iván Torres
 */
import java.util.Scanner;

public class Ejercicio64 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int altura = 3;
    int ancho = 4; //El ancho es dos veces menos de lo que es realmente.
    int opcion;
    boolean vertical = true;
    do {

      for (int i = 0; i < altura; i++) {
        System.out.print("*");
        if (i == 0 || i == altura - 1) { //Solo se imprime para lo que sería la parte superior e inferior
          for (int j = 0; j < ancho; j++) {

            System.out.print("*");
          }
        } else { //Aquí es para el relleno hueco.
          for (int j = 0; j < ancho; j++) {

            System.out.print(" ");
          }
        }
        System.out.println("*");
      }

      System.out.println("\n1.-Agrandarlo\n2.-Achicarlo\n3.-Cambiar la orientación\n4.-Salir");
      System.out.print("Indique que quiere hacer (1,2,3,4): ");
      opcion = Integer.parseInt(s.nextLine());
      switch (opcion) {

        case 1:

          altura++;
          ancho++;
          break;
        case 2:

          if (altura > 2 && ancho > 2) {

            altura--;
            ancho--;
          } else {

            System.out.println("No se puede reducir más el tamaño");
          }
          break;

        case 3:

          int aux= 0;
          aux = ancho;
          ancho = altura;
          altura = aux;
          vertical = false;
          break;

        case 4:
          break;

        default:
          System.out.println("Dato de entrada incorrecto");
      }
      System.out.print("\033[H\033[2J");
      System.out.flush();
    } while (opcion != 4);
  }
}
