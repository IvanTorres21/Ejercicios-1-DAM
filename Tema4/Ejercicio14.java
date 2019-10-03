import java.util.Scanner;

/**
 * Programa que dice si un número es par o divisible entre 5.
 * @author Iván Torres
 */
public class Ejercicio14 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número: ");
    double num = s.nextDouble();
    if(num % 2 == 0) {
      
      System.out.printf("\nEl número es par");
      
    } else {
      
      System.out.printf("\nEl número no es par");
      
    }
    if(num % 5 == 0) {
      
      System.out.printf("\nEl número es divisible entre 5");
      
    } else {
      
      System.out.printf("\nEl número no es divisible entre 5");
      
    }
  }
}
