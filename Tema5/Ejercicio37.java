import java.util.Scanner;

/**
 * Programa que convierte un número al sistema de palotes.
 * @author Iván Torres
 */
public class Ejercicio37 {
  public static void main(String[] args) {
   
   Scanner s = new Scanner(System.in);
   
   System.out.print("Introduzca un número a convertir a palotes: ");
   String num = s.nextLine();
   
   for (int i = 0; i < num.length(); i++) {
     
     int numAct = Character.getNumericValue(num.charAt(i));
     for (int j = 0; j < numAct; j++) {
       
       System.out.print("|");
     }
     System.out.print(" ");
   } 
  }
}
