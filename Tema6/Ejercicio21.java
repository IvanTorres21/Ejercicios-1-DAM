
/**
 * Programa que tira cinco monedas de distinto valor y dice si son caras o cruz.
 * @author Iván Torres
 */
public class Ejercicio21 {
  public static void main(String[] args) {
    
    int moneda; //Tipo de moneda
    int lado; //Si es cara o cruz
    
    for (int i = 0; i < 5; i++) {
      
      moneda = (int) (Math.random() * 8 + 1);
      lado = (int) (Math.random() * 2);
      
      switch (moneda) {
        
        case 1:
          
          System.out.print("1 céntimos: ");
          break;
        case 2:
          
          System.out.print("2 céntimos: ");
          break;
        case 3:
          
          System.out.print("5 céntimos: ");
          break;
        case 4:
          
          System.out.print("10 céntimos: ");
          break;
        case 5:
          
          System.out.print("20 céntimos: ");
          break;
        case 6:
          
          System.out.print("50 céntimos: ");
          break;
        case 7:
          
          
          System.out.print("1 euro: ");
          break;
        case 8:
          
          System.out.print("2 euro: ");
          break;
        default:
          
          System.exit(2);
          break;
      }
      switch (lado) {
        
        case 0:
          
          System.out.println("cara");
          break;
        case 1:
          System.out.println("cruz");
          break;
        default:
          
          System.exit(2);
          break;
      }
    }
  }
}
