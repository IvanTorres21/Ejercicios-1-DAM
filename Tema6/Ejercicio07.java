
/**
 * Programa que hace una quiniela de 15 partidos
 *
 * @author Iván Torres
 */
public class Ejercicio07 {

  public static void main(String[] args) {

    for (int i = 0; i < 15; i++) {
      if (i != 14) {
        for (int j = 0; j < 3; j++) {
        
          int num = (int) (Math.random()*3);
          String resultado;
          switch (num) {
          
            case 0:
            
              resultado = "1";
              break;
            case 1:
            
              resultado = "x";
              break;
            case 2:
            
              resultado = "2";
              break;
            default:
            
              resultado = "ERROR";
              break;
          }
          System.out.print("| " + resultado + " | ");
        }
    } else {
        
        int num = (int) (Math.random()*3);
        String resultado;
        switch (num) {
          
          case 0:
            
            resultado = "1";
            break;
          case 1:
            
            resultado = "x";
            break;
          case 2:
            
            resultado = "2";
            break;
          default:
            
            resultado = "ERROR";
            break;
        }
        System.out.print("| " + resultado + " | ");
    }
      System.out.println();
    }
  }
}
