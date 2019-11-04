import java.util.Scanner;
/**
 * Programa que imprime una pecera de tamaño aleatorio e imprime un caballito de mar, un pez y 
 * una caracola.
 * @author Iván Torres
 */
public class Ejercicio30 {
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
    boolean pezColocado = false;
    boolean caracolaColocada = false;
    boolean caballitoColocado = false;
    for (int i = 0; i < altura; i++) {
      
      System.out.print("*");
      for (int j = 0; j < ancho; j++) {
        
        if (i != 0 && i != altura-1) {
          
          if ((Math.random() <= 0.05 && !pezColocado) || (i == altura-3 && j == 0 && !pezColocado)) {
            
            System.out.print("&");
            pezColocado = true;
          } else if ((Math.random() <= 0.07 && !caracolaColocada) || (i == altura-3 && j == 1 && !caracolaColocada)){
            
            System.out.print("@");
            caracolaColocada = true;
          } else if ((Math.random() <= 0.1&& !caballitoColocado) || (i == altura-2 && j == 1 && !caballitoColocado)){
            
            System.out.print("$");
            caballitoColocado = true;
            
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
