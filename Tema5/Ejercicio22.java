import java.util.Scanner;

/**
 * Programa que muestra todos los números primos entre 2 y 100
 * @author Iván Torres
 */
public class Ejercicio22 {
  public static void main(String[] args) {
   
    System.out.println("2");
    for(int num = 2; num <= 100; num++) {
      
      int divisor = 2;
      float modulo = 0;
      float cociente = 0;
      do {

        modulo = (float) num % (float) divisor;
        cociente = (float) num / (float) divisor;
        divisor++;
      } while (divisor < num && modulo != 0);
      if ((int) modulo != 0 && cociente < divisor) {
          
        System.out.println(num);
      }
    }
    System.out.println("100");
  }
}
