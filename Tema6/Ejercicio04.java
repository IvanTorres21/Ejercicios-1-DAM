
/**
 * Programa que muestra 20 números aleatorios entre el 0 y el 10
 * @author Iván Torres
 */
public class Ejercicio04 {
  
  public static void main(String[] args) {
    
    System.out.println("Los 20 números son: ");
    for (int i = 0; i < 20; i++) {
      
      System.out.print((int)(Math.random() * 11) +  " ");
    }
  }
}
