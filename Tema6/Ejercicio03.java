
/**
 * Programa que muestra una carta de la baraja española aleatoria.
 * @author Iván Torres
 */
public class Ejercicio03 {
  
  public static void main(String[] args) {
    
    int numCart = (int) (Math.random() * 10 + 1);
    int tipCart = (int) (Math.random() * 4 +1);
    
    String nomCart;
    String paloCart;
    switch (numCart) {
        
      case 1:
        
        nomCart = "As";
        break;
      case 8:
        
        nomCart = "Sota";
        break;
      case 9:
         
        nomCart = "Caballo";
        break;
      case 10:
        
        nomCart = "Rey";
        break;
      default:
        
        nomCart = String.valueOf(numCart);
        break;
    }
    switch (tipCart) {
      
      case 1:
        
        paloCart = "Espadas";
        break;
      case 2:
        
        paloCart = "Copas";
        break;
      case 3:
        
        paloCart = "Oro";
        break;
      case 4:
        
        paloCart = "Bastos";
        break;
      default:
        
        paloCart = "Error";
        break;
    }
    
    System.out.println("La carta que te ha tocado es: " + nomCart + " de " + paloCart);
  }
}
