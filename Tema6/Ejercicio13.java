
/**
 * Programa que tira dos dados hasta que estos tienen el mismo valor.
 * @author Iván Torres
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    
    int dado1 = 0;
    int dado2 = 0;
    
    do {
      
      dado1 = (int) (Math.random() * 6 +1);
      dado2 = (int) (Math.random() * 6 +1);
      System.out.println(dado1 + " " + dado2);
    } while (dado1 != dado2);
  }
}
