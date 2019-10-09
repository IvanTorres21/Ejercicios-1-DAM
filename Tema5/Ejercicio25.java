import java.util.Scanner;

/**
 * Programa que pide un numero y lo muestra luego del reves.
 * @author Iván Torres
 */
public class Ejercicio25 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa muestra un número del reves");
    System.out.print("Introduzca el número: ");
    String num = s.nextLine();
    if (num.length() == 1) {
      
      System.out.print("El número solo tiene un dígito...");
    } else {
      
      System.out.print("El número del revés es: ");
      if (num.charAt(0) == '-' || num.charAt(0) == '+') {
        
        System.out.print(num.charAt(0));
      }
      for (int i = num.length() -1 ; i >= 0; i--) {
          
        if(num.charAt(i) != '-' && num.charAt(i) != '+') {
          
          System.out.print(num.charAt(i));
        }
      }
    }
  }
}
