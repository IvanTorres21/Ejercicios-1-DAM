import java.util.Scanner;
/**
 * Programa que pide 10 números y luego los muestra poniendo primero los primos.
 * @author Iván Torres
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca 10 número:");
    int[] num = new int[10];
    for (int i = 0; i < 10; i++) {
      
      System.out.print("El número " + (i+1) + ": ");
      num[i] = Integer.parseInt(s.nextLine());
    }
    
    int aux;
    boolean primo = true;
    int posI = 0;
    for (int i = 0; i < 10; i++) {
      
      int k = 2;
      do {
        
        if (num[i] % k == 0) {
          
          primo = false;
        }
        k++;
      } while(k < num[i]);
      if (primo) {
        
        aux = num[posI];
        num[posI] = num[i];
        num[i] = aux;
        posI++;
      }
      primo = true;
    }
    
    System.out.println();
    for (int k : num) {
      
      System.out.print(" " + k);
    }
  }
}
