
/**
 * Programa que muestra un array de una dimensión con valores nulos.
 * @author Iván Torres
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    
    int[] array = new int[12];
    array[0] = 39;
    array[1] = -2;
    array[4] = 0;
    array[6] = 14;
    array[8] = 5;
    array[9] = 120;
    
    for (int n : array) {
      
      System.out.println("El valor es:" + n);
      //Los valores que no han sido establecidos son almacenados como 0.
    }
  }
}