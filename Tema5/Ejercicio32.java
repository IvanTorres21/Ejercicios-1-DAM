import java.util.Scanner;

/**
 * Programa que muestra los dígitos pares de un número y los suma.
 * @author Iván torres
 */
public class Ejercicio32 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    System.out.print("Este programa muestra los dígitos pares de un número que introduzcas y su suma");
    System.out.print("\nIntroduzca el número: ");
    String num = s.nextLine();
    int suma = 0;
    System.out.print("\nPares: ");
    for (int i = 0; i < num.length(); i++) {
      
      int digActual = Character.getNumericValue(num.charAt(i));
      if (digActual % 2 == 0) {
        
        System.out.print(digActual + " ");
        suma += digActual;
      }
    }
    System.out.print("Suma: " + suma);
  }
}
