import java.util.Scanner;
/**
 * Programa que imprime una pecera de tamaño mínimo 4x4 (datos introducidor por usuario) y coloca
 * un pez dentró de la misma en una posición aleatoria.
 * @author Iván Torres
 */
public class Ejercicio17 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura y la base de la pecera: ");
    int altura;
    int ancho;
    do {
      
      altura = s.nextInt();
      ancho = s.nextInt();
      s.nextLine();
      if (altura < 4 || ancho < 4) {
        
        System.out.print("Las medidas mínimas son de 4 x 4");
      }
    } while (altura < 4 || ancho < 4);
    
    
    ancho -= 2;
    int posPezX = (int) (Math.random() * ancho);
    int posPezY = (int) (Math.random() * (altura-1)) + 1;
    for (int i = 0; i < altura; i++) {
      
      System.out.print("*");
      for (int j = 0; j < ancho; j++) {
        
        if (i != 0 && i != altura-1) {
          
          if (posPezY == i && posPezX == j) {
            
            System.out.print("&");
          } else {
            
            System.out.print(" ");
          }
        } else {
          
          System.out.print("*");
        }
      }
      System.out.print("*");
      System.out.println();
    }
  }
}
