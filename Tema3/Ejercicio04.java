import java.util.Scanner;

/*
 * Lee dos números por teclado y muestra su suma, resta, multiplicación y división.
 */
public class Ejercicio04 {
  public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
      
     System.out.print("Introduzca dos números separados por un espacio: ");
     double x1 = s.nextDouble();
     double x2 = s.nextDouble();
     System.out.printf("\nSuma: %f\nResta: %f", x1 + x2, x1 - x2);
     System.out.printf("\nMultiplicación: %f\nDivisión: %f", x1 * x2, x1 / x2);
  }
}
