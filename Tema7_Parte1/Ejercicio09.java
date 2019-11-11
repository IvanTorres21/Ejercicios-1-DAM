import java.util.Scanner;
/**
 * Programa que pide 8 números y luego dice si son impares o pares
 * @author Iván Torres
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int[] num = new int[8];
    
    System.out.println("Introduzca números enteros: ");
    for (int i = 0; i < 8; i++) {
      
      System.out.print("El " + (i+1) + "º número: ");
      num[i] = Integer.parseInt(s.nextLine());
    }
    System.out.println("\n");
    for (int n : num) {
      
      System.out.print(n + " ");
      if (n%2 == 0) {
        
        System.out.println("par");
      } else {
        
        System.out.println("impar");
      }
    }
  }
}
