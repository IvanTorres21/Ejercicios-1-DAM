import java.util.Scanner;

/**
 * Programa que calcula el factorial de un número.
 * @author Iván Torres
 */
public class Ejercicio28 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    System.out.print("Este programa calcula el factorial de un número entero.\n");
    int num = 0;
    do {
      System.out.print("Introduzca un número entero: ");
      num = Integer.parseInt(s.nextLine());
    } while (num < 0);
    long factorial = 1;
    for (int i = 1; i <= num; i++) {
      
      factorial = factorial * i;
    }
    if (factorial <= 0) {
      
      System.out.print("El número es demasiado grande, lo siento.");
    } else {
      
      System.out.print("Su factorial es: " + factorial);
    }
  }
}
