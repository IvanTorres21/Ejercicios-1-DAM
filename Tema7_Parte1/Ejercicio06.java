import java.util.Scanner;
/**
 * Programa que pide 15 elementos y luego los muestra rotandolos (0 pasa a 1, 1 pasa a 2...)
 * @author Iván Torres
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int[] num = new int[15];
    
    for (int i = 0; i < 15; i++) {
      
      System.out.print("Introduzca el número " + (i+1) + "º:");
      num[i] = Integer.parseInt(s.nextLine());
    }
    
    int aux;
    for (int i = 14; i >= 0; i--) {
      
      aux = num[14-i]; //guarda el siguiente número
      num[14-i] = num[14]; //Pone el útlimo numero en la posición del número guardado
      num[14] = aux; //Pone el número guardado en la última posición
    }
    
    System.out.print("\nArray rotado: ");
    for (int i = 0; i < 15; i++) {
      
      System.out.print(num[i] + " ");
    }
  }
}
