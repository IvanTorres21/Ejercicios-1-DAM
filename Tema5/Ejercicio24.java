import java.util.Scanner;

/**
 * Programa que pide un numero n e imprime una piramide de numeros de n altura.
 * @author Iván Torres
 */
public class Ejercicio24 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa muestra una piramide de numeros de n altura");
    int num;
    do {
      
      System.out.print("Introduzca un numero positivo: ");
      num = Integer.parseInt(s.nextLine());
    } while (num <= 0);
    for (int i = 0; i < num; i++) {
      
      for (int espacios = num; espacios > i; espacios--) {
        
        System.out.print(" ");
      }
      int j = 0;
      int aux = i;
      while (j < aux) {
        
        j++;
        System.out.print(j);
      }
      aux = 1;
      while (j > aux) {
        
        j--;
        System.out.print(j);
      }
      System.out.print("\n");
    }
  }
}
