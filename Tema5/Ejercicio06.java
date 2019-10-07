/**
 * Programa que cuenta desde 320 hasta 160 de 20 en 20.
 * @author Iván Torres
 */
public class Ejercicio06 {
  public static void main(String[] args) {
   
    int i = 320;
    do {
      
      System.out.printf("\n%d", i);
      i -= 20;
    } while (i >= 160);
  }
}

