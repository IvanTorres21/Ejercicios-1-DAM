
/**
 * Programa que muestra una carta de la baraja francesa aleatoria.
 * @author Iván Torres
 */
public class Ejercicio02 {
  
  public static void main(String[] args) {
    
    int numCart = (int) (Math.random() * 13 + 1);
    int tipCart = (int) (Math.random() * 4 +1);
    
    String nomCart;
    String paloCart;
    switch (numCart) {
        
      case 1:
        
        nomCart = "A";
        break;
      case 11:
        
        nomCart = "J";
        break;
      case 12:
         
        nomCart = "Q";
        break;
      case 13:
        
        nomCart = "K";
        break;
      default:
        
        nomCart = String.valueOf(numCart);
        break;
    }
    switch (tipCart) {
      
      case 1:
        
        paloCart = "Corazones";
        break;
      case 2:
        
        paloCart = "Picas";
        break;
      case 3:
        
        paloCart = "Tréboles";
        break;
      case 4:
        
        paloCart = "Diamantes";
        break;
      default:
        
        paloCart = "Error";
        break;
    }
    
    System.out.println("La carta que te ha tocado es: " + nomCart + " de " + paloCart);
  }
}
