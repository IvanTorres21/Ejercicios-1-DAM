import java.util.Scanner;

/**
 * Programa que simula el funcionamiento de una caja fuerte electrónica.
 * @author Iván Torres.
 */
public class Ejercicio07 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    int cod = 0;
    for (int i = 3; i >= 0; i--) {
          
      System.out.print("Introduzca el código de 4 cifras: ");
      cod = Integer.parseInt(s.nextLine());
      if (cod == 1469) {
      
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        break;
      } else {
            
        System.out.printf("Lo siento, ese no es el código.(%d intentos restantes)\n", i);
            
            
      }
    }
  }
}
