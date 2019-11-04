
import java.util.Scanner;

/**
 * Programa que crea un array de un tamaño introducido por el usuario y genera números aleatorios
 * entre 0 y 200. Luego muestra un array modificado en el que le da la vuelta al orignial.
 *
 * @author Iván Torres
 */
public class Ejercicio28 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int[] arrayOriginal;
    int[] arrayModificado;
    System.out.print("Introduzca el tamaño del array que quiere: ");
    int cantidad = Integer.parseInt(s.nextLine());
    arrayOriginal = new int[cantidad];
    arrayModificado = new int[cantidad];
    for (int i = 0; i < cantidad; i++) {

      arrayOriginal[i] = (int) (Math.random() * 200) + 1;
    }
    for (int i = 0; i < cantidad; i++) { //Cambiamos de posición los elementos del array.
      
      if (i == 0) {
        
        arrayModificado[i] = arrayOriginal[i];
      } else if (i % 2 == 0) {
        
        arrayModificado[i/2] = arrayOriginal[i];
      } else if (i % 2 != 0) {
        
        arrayModificado[cantidad - (i/2 + 1)] = arrayOriginal[i];
      }
    }
    //Imprimimos el array original.
    System.out.println("Array original:");
    System.out.print("Indice: ");
    for (int i = 0; i < cantidad; i++) {

      System.out.printf(" %3d", i);
    }
    System.out.print("\nValor:  ");
    for (int i = 0; i < cantidad; i++) {

      System.out.printf(" %3d", arrayOriginal[i]);
    }
    //Imprimimos el array modificado.
    System.out.println("\nArray original:");
    System.out.print("Indice: ");
    for (int i = 0; i < cantidad; i++) {

      System.out.printf(" %3d", i);
    }
    System.out.print("\nValor:  ");
    for (int i = 0; i < cantidad; i++) {

      System.out.printf(" %3d", arrayModificado[i]);
    }

  }
}
