
/**
 * Programa que muestra 50 números aleatorios entre 100 y 199, y muestra la media, máximo y mínimo.
 * @author Iván Torres
 */
public class Ejercicio05 {
  
  public static void main (String[] args) {
    
    System.out.println("Los 50 números aleatorios: ");
    
    int num;
    int media = 0;
    int max = 0;
    int min = 200;
    for (int i = 0; i < 50; i++) {
      
      num =(int) (Math.random() * 100 + 100);
      media += num;
      if (num > max) {
        
        max = num;
      }
      if (num < min) {
        
        min = num;
      }
      System.out.print(num + " ");
    }
    System.out.println("\nLa media es:  " + media / 50);
    System.out.println("El máximo es: " + max);
    System.out.println("El mínimo es: " + min);
  }
}
