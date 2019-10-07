import java.util.Scanner;

/**
 * Programa que mira cuantas cifras tiene un número con un bucle.
 * @author Ivan Torres.
 */
public class Ejercicio09 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero: ");
    long num = Integer.parseInt(s.nextLine());
    long modulo = 10;
    int cont = 1;
    while (num >= modulo) {
      
      modulo = modulo * 10;
      cont++;
    }
    System.out.printf("\nEl número tiene %d cifras", cont);
  }
}
