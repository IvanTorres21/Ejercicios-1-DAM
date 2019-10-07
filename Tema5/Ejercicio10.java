import java.util.Scanner;

/**
 * Programa que hace la media de una cantida de numeros desconocida.
 * @author Iván Torres.
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("A continuación podrá introducir datos para hacer una media.");
    System.out.println("Cuando quiera dejar de introducir datos ponga un número negativo.");
    double datosTotales = 0;
    int cantidadDatos = 0;
    double datoActual = 0;
    do {
      
      System.out.print("Introduzca el dato: ");
      datoActual = Integer.parseInt(s.nextLine());
      datosTotales += datoActual;
      cantidadDatos++;
    } while (datoActual >= 0);
    //Las próximas dos lineas son para control de datos, seguro que puede arreglarse de otra manera.
    cantidadDatos--;
    datosTotales -= datoActual;
    double media = datosTotales / (double) cantidadDatos;
    System.out.printf("\nLa media es: %.2f", media);
  }
}
