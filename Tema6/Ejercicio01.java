
/**
 * Programa que muestra la tirada de tres dados de seis caras y su suma
 * @author Iván Torres
 */
import java.util.Scanner;

public class Ejercicio01 {
  
  public static void main(String[] args) {
    
    int suma = 0;
    int dado;
    for (int i = 0; i < 3; i++) {
      
      dado = (int) (Math.random() * 6 + 1);
      System.out.println("Dado: " + dado);
      suma += dado;
    }
    System.out.print("La suma total es: " + suma);
    
  }
}
