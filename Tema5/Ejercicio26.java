import java.util.Scanner;

/**
 * Programa que dice en que posicion se encuentra un dígito en un número
 * @author Iván Torres
 */
public class Ejercicio26 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número: ");
    String num = s.nextLine();
    System.out.print("Introduzca un dígito: ");
    char dig = (s.nextLine()).charAt(0);
    int posDig = 0;
    boolean posEncontrada = false;
    for (int i = 0; i < num.length() && !posEncontrada; i++) {
      
      if (num.charAt(i) == dig) {
        
        posDig = i + 1;
        posEncontrada = true;
      }
    }
    System.out.print("EL dígito " + dig + " está en la posición: " + posDig);
  }
}
