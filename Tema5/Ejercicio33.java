import java.util.Scanner;

/**
 * Programa que imprime la letra U con altura variable
 * @author Iván Torres
 */
public class Ejercicio33 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    int altura = 0;
    do {
      
      System.out.print("Introduzca la altura de la U: ");
      altura = Integer.parseInt(s.nextLine());
    } while (altura <= 0);
    
    for (int i = 1; i < altura; i++) {
      
      System.out.print("*");
      for (int j = 0; j < (altura-2); j++) {
        
        System.out.print(" ");
      }
      System.out.print("*\n");
    }
    System.out.print(" ");
    for (int i = 0; i < (altura-2); i++) {
      
      System.out.print("*");
    }
  }
}
