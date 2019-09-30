import java.util.Scanner;

/**
 * Programa que resuelve una ecuación de primer grado.
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa resuelve ecuaciones del tipo ax + b = 0");
    System.out.print("Introduzca el valor de a y de b separados por un espacio: ");
    double a = s.nextDouble();
    double b = s.nextDouble();
    double resultadoEcuacion = -b / a;
    if (a != 0) {
      
      System.out.printf("\nEl resultado de %.2fx + %.2f = 0 es : %.2f", a, b, resultadoEcuacion);
      
    } else {
      
      System.out.printf("\nEsta ecuación no tiene solución real");
      
    }
  }
}

