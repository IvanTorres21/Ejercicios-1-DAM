
/**
 * Programa que muestra 50 números entre -100 y 200 y muestra su máximo, mínimo y media
 * @author Iván Torres
 */
public class Ejercicio19 {
  public static void main(String[] args) {
    
    int max = -101;
    int min = 201;
    int media = 0;
    int num;
    
    for (int i = 0; i < 50; i++) {
      
      num = (int) (Math.random() * 300 - 100);
      System.out.println(num);
      if (num < min) {
        
        min = num;
      }
      if (num > max) {
        
        max = num;
      }
      media += num;
    }
    System.out.println("Máximo: " + max);
    System.out.println("Mínimo: " + min);
    System.out.println("Media : " + media / 50);
  }
}
