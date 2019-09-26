import java.util.Scanner;

/*
 * Programa que calcula el area de un rectángulo.
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la base y la altura separados por un espacio: ");
    double base = s.nextDouble();
    double altura = s.nextDouble();
    System.out.println("\nEl area del rectángulo es: " + (base * altura));
  }
}
