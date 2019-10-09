import java.util.Scanner;

/**
 * Programa que comprueba si un número es primo
 * @author Iván Torres
 */
public class Ejercicio16 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero: ");
    int num = Integer.parseInt(s.nextLine());
    boolean primo = false;
    int divisor = 2;
    float modulo = 0;
    do {

      modulo = (float) num % (float) divisor;
      float cociente = (float) num / (float) divisor;
      if ((int) modulo != 0 && cociente < divisor) {
        
        primo = true;
      }
      divisor++;
    } while (divisor < num && modulo != 0);
    
    if (primo) {
      
      System.out.print("El número es primo");
    } else {
      
      System.out.print("El número no es primo");
    }
      
  }
}
