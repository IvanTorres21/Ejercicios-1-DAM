
import java.util.Scanner;

/**
 * Programa que simula el juego del Craps.
 *
 * @author Iván Torres
 */
public class Ejercicio31 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Juguemos al Craps, si sale 7 u 11 ganas, si sale 2 3 o 12 yo gano.");
    System.out.print("\n¿Cuánto dinero apuestas?: ");
    int dinero = Integer.parseInt(s.nextLine());
    int sumDad = 0;
    int dado1 = (int) (Math.random() * 6) + 1;
    int dado2 = (int) (Math.random() * 6) + 1;
    sumDad = dado1 + dado2;
    System.out.println("Dado 1: " + dado1 + "    Dado 2:" + dado2);
    System.out.println("Total: " + sumDad);

    switch (sumDad) {

      case 7:
      case 11:

        System.out.print("Has ganado, te llevas: " + dinero * 2 + " €");
        break;
      case 2:
      case 3:
      case 12:

        System.out.print("Has perdido, pierdes: " + dinero);
        break;
      default:

        System.out.println("Hay que volver a jugar, ganas con el mismo número; pierdes con un 7");
        int numAct = sumDad;
        String opcion = "";
        do {
          
          System.out.print("¿Sigues jugando? (s/n): ");
          opcion = s.nextLine().toLowerCase();
          if (opcion.equals("s")) {
            numAct = sumDad;
            dado1 = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;
            sumDad = dado1 + dado2;
            System.out.println("Dado 1: " + dado1 + "    Dado 2:" + dado2);
            System.out.println("Total: " + sumDad);
            if (sumDad != 7 && sumDad != numAct) {

              System.out.println("Hay que volver a jugar, ganas con el mismo número; pierdes con un 7");
            }
          }
        } while (sumDad != 7 && sumDad != numAct && opcion.equals("s"));
        
        if (opcion.equals("n")) {
          
          System.out.println("Una pena");
        } else {
          
          if (sumDad == 7) {

            System.out.print("Has perdido, pierdes: " + dinero);
          } else {

            System.out.print("Has ganado, te llevas: " + dinero * 2 + " €");
          }
        }
    }

  }
}
