import java.util.Scanner;

/*
 * Programa que calcula una factura a partir de la base imponible.
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la base imponible: ");
    double baseImponible = s.nextDouble();
    double iva = baseImponible * 0.21;
    System.out.printf("\nEl iva es: %.2f, el precio total %.2f", iva, baseImponible + iva);
  }
}
