import java.util.Scanner;
/**
 * Programa que pide 10 números y luego los muestra, indicando cual es el máximo y mínimo.
 * @author Iván Torres
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int[] num = new int[10];
    int max = 0; //Estas variables no guardan el número en sí, si no la posición dentro del array en la que está.
    int min = 0;
    for (int i = 0; i < 10; i++) {
      
      System.out.print("Introduzca el " + (i+1) + "º número: ");
      num[i] = Integer.parseInt(s.nextLine());
      if (num[i] < num[min]) {
        
        min = i;
      } else if (num[i] > num[max]) {
        
        max = i;
      }
    }
    
    for (int n : num) {
      
      System.out.print("Número: " + n);
      if (n == num[max]) {
        
        System.out.print(" Máximo");
      } else if (n == num[min]) {
        
        System.out.print(" Mínimo");
      }
      System.out.println();
    }
  }
}
