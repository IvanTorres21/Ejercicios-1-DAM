
/**
 * Programa que genera aleatoriamente la tirada de un dado de poker de 6 caras: As, K, Q, J, 7 y 8
 * @author Iván Torres
 */
public class Ejercicio23 {
  public static void main(String[] args){
    
    for (int i = 0; i < 5; i++) {
      
      int tirada = (int) (Math.random() * 6) + 1;
      switch (tirada) {
        
        case 1: 
          
          System.out.print("As ");
          break;
        case 2: 
          
          System.out.print("K ");
          break;
        case 3: 
          
          System.out.print("Q ");
          break;
        case 4: 
          
          System.out.print("J ");
          break;
        case 5: 
          
          System.out.print("8 ");
          break;
        case 6: 
          
          System.out.print("7 ");
          break;
      }
    }
  }
}
