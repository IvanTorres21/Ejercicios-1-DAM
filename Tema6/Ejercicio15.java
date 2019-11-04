
/**
 * Programa que genera una melodía
 * @author Iván Torres
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    
    int notaAct;
    int cantidadNotas;
    int primNot = 1;
    do {
      
      cantidadNotas = (int) (Math.random() * 24 + 4);
    } while (cantidadNotas % 4 != 0);
    for (int i = 1; i <= cantidadNotas; i++) {
        if (i != cantidadNotas) {
        notaAct = (int) (Math.random() * 7 +1);
        if (i == 1) {
          primNot = notaAct;
        }
        switch (notaAct) {
          
          case 1:
            
            System.out.print("do ");
            break;
          case 2:
            
            System.out.print("re ");
            break;
          case 3:
            
            System.out.print("mi ");
            break;
          case 4:
            
            System.out.print("fa ");
            break;
          case 5:
            
            System.out.print("sol ");
            break;
          case 6:
            
            System.out.print("la ");
            break;
          case 7:
            
            System.out.print("si ");
            break;
        }
      } else {
        
        switch (primNot) {
          
          case 1:
            
            System.out.print("do ");
            break;
          case 2:
            
            System.out.print("re ");
            break;
          case 3:
            
            System.out.print("mi ");
            break;
          case 4:
            
            System.out.print("fa ");
            break;
          case 5:
            
            System.out.print("sol ");
            break;
          case 6:
            
            System.out.print("la ");
            break;
          case 7:
            
            System.out.print("si ");
            break;
        }
      }
      if (i % 4 == 0) {
        System.out.print(" | ");
      }
    }
    System.out.print(" | ");
  }
}
