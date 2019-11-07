import java.util.Scanner;
/**
 * Programa que pide 10 datos y los muestra al reves.
 * @author Iván Torres
 */
public class Ejercicio03 {
  public static void main(String[] args)
    throws InterruptedException {
    
    Scanner s = new Scanner(System.in);
    
    int[] array = new int[10];
    for (int i = 0; i < 10; i++) {
      
      System.out.print("Introduzca el " + (i+1) + "º entero: ");
      array[i] = Integer.parseInt(s.nextLine());
    }
    System.out.print("El array del reves es: ");
    for (int i = 9; i >= 0; i--) {
      
      System.out.print(array[i] + " ");
      Thread.sleep(400);
    }
   }
}
