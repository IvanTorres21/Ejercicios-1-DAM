import java.util.Scanner;

/**
 * Programa que suma los cien proximos números a un número ya introducido posible.
 * @author Iván Torres
 */
public class Ejercicio17 {
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    int num;
    long total = 0;
    do {
      
      System.out.print("Introduce un número entero positivo: ");
      num = Integer.parseInt(s.nextLine());
    } while (num < 0);
    for (int i = 0; i <= 100; i++) {
    
    total = total + (num + i);
    System.out.println(total);
    }
    System.out.print("La suma de sus 100 primeros numeros es: " + total);
  } 
}
