import java.util.Scanner;

/**
 * Programa que imprime una L hecha de asteriscos de una altura variable
 * @author Iván Torres
 */
public class Ejercicio31 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura de la L: ");
    int altura = Integer.parseInt(s.nextLine());
    for (int i = 1; i < altura; i++) {
      
      System.out.print("*\n");
    }
    for (int i = 0; i < ((altura/2) + 1); i++) {
      
      System.out.print("*");
    }
  }
}
