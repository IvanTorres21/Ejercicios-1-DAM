
import java.util.Scanner;

/**
 * Programa para indicar en que mesa se puede sentar un grupo de personas que va a un restaurante
 * cada mesa tiene 4 asientos, no se admiten grupos mayores de 4, y en caso de que no haya ninguna
 * mesa vacia se intentará sentarlos con otro grupo siempre y cuando no se les tenga que separar.
 *
 * @author Iván Torres
 */
public class Ejercicio15 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int[] mesa = new int[10];
    for (int i = 0; i < 10; i++) { //Asignamos valores aleatorios al empezar

      mesa[i] = (int) (Math.random() * 5);
    }

    int opc = 0; // La opción del usuario, en caso de que sea -1 se termina el programa.
    do {
      
      System.out.print("|Nº mesa  | ");
      for (int i = 1; i <= 10; i++) { //Mostramos el número de la mesa
        
        System.out.print(i + " | ");
      }
      System.out.print("\n|Ocupantes| ");
      for (int i = 0; i < 10; i++) { //Mostramos el array
        
        if (i != 9) {
          
          System.out.print(mesa[i] + " | ");
        } else {
          
          System.out.print(" " + mesa[i] + " | ");
        }
      }
      
      System.out.print("\n\n¿Cúantos son? (Introduzca -1 para salir): ");
      opc = Integer.parseInt(s.nextLine()); //Pedir la cantidad de personas del grupo.
      while (opc > 4 || opc < -1) {
        
        System.out.print("Lo sentimos, el grupo no puede ser mayor de 4.\n Vuelva a internarlo: ");
        opc = Integer.parseInt(s.nextLine());
      }
      if (opc != -1) {
        boolean colocado = false;
        int hueco = 14;
        for (int i = 0; i < 10 && !colocado; i++) { //Comprobamos si hay hueco o no.

          if (mesa[i] == 0) {

            mesa[i] = opc;
            System.out.println("Por favor, sientese en la mesa " + (i + 1));
            colocado = true;
          } else if (mesa[i] + opc <= 4 && hueco == 14) { // En caso de que después de recorrer el array 
                                                          // no encuentre 0 ya sabemos donde meterlo.
            hueco = i;
          }
        }
        if (!colocado && hueco != 14) {

          mesa[hueco] += opc;
          System.out.println("Lo siento, va a tener que compartir mesa. Sientese en la " + (hueco +1));
        } else {
          
          System.out.println("Lo siento, no quedan asientos.");
        }
      }
    } while (opc != -1);
  }
}
