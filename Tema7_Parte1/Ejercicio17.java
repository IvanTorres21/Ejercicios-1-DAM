
import java.util.Scanner;

/**
 * Programa que muestra 10 números aleatorios y pide que se eliga uno, luego mueve ese número a la
 * primera posición haciendo todas las rotaciones que sean necesarias.
 *
 * @author Iván Torres
 */
public class Ejercicio17 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int[] array = new int[10];

    for (int i = 0; i < 10; i++) { //Asignamos valores al array y los mostramos

      array[i] = (int) (Math.random() * 101);
      System.out.print(array[i] + " ");
    }
    System.out.print("\nEliga uno de esos valores para que sea rotado a la primera posición: ");
    int opc;
    boolean existe = false;
    do {
      
      opc = Integer.parseInt(s.nextLine());
      for (int i = 0; i < 10 && !existe; i++) { //Comprueba que este en el array

        if (opc == array[i]) {

          existe = true;
        }
      }
      if (!existe) {
        
        System.out.print("Introduzca un valor valido! ");
      }
    } while (!existe);
    
    while (opc != array[0]) {
      
      for (int i = 9; i > 0; i--) {
        
        int aux = array[i-1];
        array[i-1] = array[i];
        array[i] = aux;
      }
    }
    
    for (int k : array) {
      
      System.out.print(k + " ");
    } 
  }
}
