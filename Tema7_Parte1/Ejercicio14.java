
import java.util.Scanner;

/**
 * Programa que pide 8 palabras y comprueba si hay colores, en caso afirmativo los ordena; mostrando
 * primero los que son colores
 *
 * @author Iván Torres
 */
public class Ejercicio14 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Introduzca ocho palabras a su elección y ordenare los colores primero.");
    String[] array = new String[8];
    String[] colores = {"verde", "rojo", "azul", "amarillo",
      "naranja", "rosa", "negro", "blanco",
      "morado"};
    for (int i = 0; i < 8; i++) {

      System.out.print(i + "ª Palabra: ");
      array[i] = s.nextLine().toLowerCase();
    }

    int ultCol = 0; //Usada para saber en que hueco se ha almacenado el último color y no tener que recorrer todo el array otra vez.
    for (int i = 0; i < 8; i++) { //Navegar array principal
      
      boolean color = false;
      for (int j = 0; j < 9; j++) { //Comprobamos si es uno de los colores registrados
        
        if (array[i].equals(colores[j])) {
          
          color = true; //En caso de que no sea ningun color saldrá del bucle con color = false.
        }
      }
      if (color) {
        
        boolean cambiado = false;
        for (int j = ultCol; j < 8 && !cambiado; j++) { //Para volver a recorrer el array en busca de un hueco sin color.
          color = false;
          for (int k = 0; k < 9; k++) {
            
            if (array[j].equals(colores[k])) {
              
              color = true; //Comprobamos si es un color la posición en la que vamos a cambiarlo.
            }
          }
          if (!color) { //En caso de que no sea un color hacemos el cambio.
            
            String aux = array[j];
            array[j] = array[i];
            array[i] = aux;
            cambiado = true;
          }
        }
      }
    }
    
    System.out.println();
    for (String n : array) {
      
      System.out.print(" " + n);
    }
  }
}
