import java.util.Scanner;

/**
 * Programa que muestra la tabla de multiplicar de un número introducido por teclado.
 * @author Iván Torres
 */
public class Ejercicio08 {
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número entero: ");
    int num = Integer.parseInt(s.nextLine());
    for (int i = 0; i <= 10; i++) {
      
      System.out.printf("\n%d * %d = %d", num, i, num * i);
    }
    
  }
}
