import java.util.Scanner;

/*
 * Programa que muestra el resultado de una multiplicación 
 * introducida por el usuario.
 */
public class Ejercicio01 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca los números a multiplicar separados por un espacio");
    double x1 = s.nextDouble();
    double x2 = s.nextDouble();
    System.out.println("El resultado de la multiplicación es: " + (x1 * x2));
  }
}
