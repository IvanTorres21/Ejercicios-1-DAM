
/**
 * Programa que hace una quiniela de 15 partidos, 1/6 de ser un 2, 2/6 de ser x y 3/6 de ser 1.
 *
 * @author Iván Torres
 */
public class Ejercicio08 {

  public static void main(String[] args) {

    for (int i = 0; i < 15; i++) {

      if (i != 14) {
        for (int j = 0; j < 3; j++) {
        
          double num = Math.random();
          String resultado;
          if (num > 0.5) {
          
            resultado = "1";
          } else if (num <= 0.17) {
          
            resultado = "2";
          } else if (num > 0.17 && num <= 0.5) {
          
            resultado = "x";
          } else {
          
            resultado = "ERROR";
          }
          System.out.print("| " + resultado + " | ");
        }
      } else {
        
        double num = Math.random();
        String resultado;
        if (num > 0.5) {
          
          resultado = "1";
        } else if (num <= 0.17) {
          
          resultado = "2";
        } else if (num > 0.17 && num <= 0.5) {
          
          resultado = "x";
        } else {
          
          resultado = "ERROR";
        }
        System.out.print("| " + resultado + " | ");
    }
      System.out.println();
    }
  }
}

