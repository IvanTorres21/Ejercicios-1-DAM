
/**
 * Ejercicio que imprime una piramide maya de altura variable
 *
 * @author Iván Torres
 */
import java.util.Scanner;

public class Ejercicio69 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la altura de la piramide: ");
    int altura = Integer.parseInt(s.nextLine());
    int anchoIzq = 1;
    int anchoDer = 1;
    int anchoCen = 4;
    int espacios = altura - 1;
   
    for (int i = 1; i <= altura; i++) {
      
      //Espacios
      for (int j = 0; j < espacios; j++) {
        
        System.out.print(" ");
      }
      //Lado izquierdo
      for (int j = 0; j < anchoIzq; j++) {
        
        System.out.print("*");
      }
      //Centro piramide
      for (int j = 0; j < anchoCen; j++) {
        
        if (i % 2 != 0) {
          
          System.out.print("*");
        } else {
          
          System.out.print(" ");
        }
      }
      //Lado derecho
      for (int j = 0; j < anchoDer; j++) {
        
        System.out.print("*");
      }
      anchoIzq++;
      anchoDer++;
      espacios--;
      System.out.println();
    }
  }
}
