
/**
 * Programa que genera numeros aleatorios pares entre 0 y 100 y no para hasta sacar el 24.
 * @author Iván Torres
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    
    int num = 0;
    do {
      
      do {
        num = (int) (Math.random() * 100 + 1);
      } while (num % 2 != 0);
      System.out.println(num + " ");
    } while (num != 24);
  }
}
