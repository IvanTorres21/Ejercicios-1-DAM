import java.util.Scanner;

/**
 * Programa que calcula la potencia n de un número m.
 * @author Iván Torres
 */
public class Ejercicio14 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la base y el exponente (positivo) separado por espacio: ");
    int base = s.nextInt();
    int exponente = s.nextInt();
    s.nextLine();
    System.out.print("La potencia es: " + Math.pow(base, exponente));
  }
}
