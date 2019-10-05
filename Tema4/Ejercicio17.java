import java.util.Scanner;

/**
* Programa que dice la última cifra de un número introducido por teclado.
* @author Iván Torres
*/
public class Ejercicio17 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número: ");
    String numero = s.nextLine();
    System.out.print("\nEl último número es: " + numero.charAt(numero.length()-1));
  }
}
