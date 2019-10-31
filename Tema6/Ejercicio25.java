
/**
 * Programa que muestra 100 numeros aleatorios entre 10 y 200, marcando los primos entre # y los 
 * multiplos de 5 entre []
 * @author Iván Torres
 */
public class Ejercicio25 {
  public static void main(String[] args) {
    
    for (int i = 0; i < 100; i++) {
      
      int num = (int) (Math.random() * 190) + 10;
      int k = 2; //Para comprobar si es primo;
      boolean primo = false;
      do {
        
        if ((double) num % (double) k != 0 && (double) num / (double) k < k) {
          
          primo = true;
        }
        k++;
      } while ((double) num % (double) k != 0 && !primo);
      boolean multiplo5 = false;
      if (num % 5 == 0) {
        
        multiplo5 = true;
      }
      
      if (primo) {
        
        System.out.printf("#%d# ", num);
      } else if (multiplo5) {
        
        System.out.printf("[%d] ", num);
      } else {
        
        System.out.printf("%d ", num);
      }
    }
  }
}
