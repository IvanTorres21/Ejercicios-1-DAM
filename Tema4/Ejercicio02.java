import java.util.Scanner;

/**
 * Programa que te saluda dependiendo de la hora del día
 * @author Iván Torres
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la hora actual (sin minutos y en formato 24h) : ");
    int horaActual = s.nextInt();
    String saludo;
    if (horaActual >= 6 && horaActual <= 12) {
      
      saludo = "Buenos días";
      
    } else if (horaActual <= 5 || horaActual >= 21) {
      
      saludo = "Buenas noches";
      
    } else {
      
      saludo = "Buenas tardes";
      
    }
    if (horaActual < 0 || horaActual > 24) {
      
      System.out.printf("\nERROR: Introduce horas entre las 0 y las 24");
      
    } else {
      
      System.out.println("\n" + saludo);
    }
  }
}
