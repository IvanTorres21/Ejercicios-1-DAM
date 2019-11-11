
/**
 * Programa que crea 20 números aleatorios entre 0 y 100 y ordena los pares y los impares
 * @author Iván Torres
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    
    int[] num = new int[20];
    
    for (int i = 0; i < 20; i++) {
      
      num[i] = (int) (Math.random()*101);
    }
    
    int aux;
    boolean cambiado = false;
    for (int i = 0; i < 20; i++) {
      
      if (num[i] % 2 != 0) {
        
        aux = num[i];
        for (int j = i; j < 20 && !cambiado; j++) {
        
          if (num[j] % 2 == 0) {
            
            num[i] = num[j];
            num[j] = aux;
            cambiado = true;
          }
        }
      }
      cambiado = false;
    }
    
    System.out.println("Array ordenado en pares e impares:");
    for (int k : num) {
      
      System.out.print(k + " ");
    }
    
  }
}
