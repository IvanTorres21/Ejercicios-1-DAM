/**
* Programa que muestra el factorial de una serie de números a partir de uno introducido por
* teclado.
* @author Iván Torres
*/
import java.util.Scanner;
public class Ejercicio39 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(s.nextLine());
    int numFactorizado;
    for (int i = 1; i <= num; i++) {
      
      numFactorizado = 1;
      for (int j = 1; j <= i; j++) {
        
        numFactorizado = numFactorizado * j;
      }
      System.out.printf("!%d: %d\n", i, numFactorizado);
    }
  }
  
}