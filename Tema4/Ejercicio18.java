import java.util.Scanner;

/**
 * Programa que dice la primera cifra de un número entero.
 * @author Iván Torres.
 */
public class Ejercicio18 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número de hasta cinco dígitos: ");
    String numero = s.nextLine();
    //Comprobar tamaño del número
    int digitos;
    if((numero.charAt(0) == '-' || numero.charAt(0) == '+') && numero.charAt(1) != ' ') {
      
      digitos = numero.length()-1;
    } else if (numero.charAt(1) == ' '){
      
      digitos = numero.length()-2;
    } else {
      
      digitos = numero.length();
    }
    if (digitos <= 5) {
    //Averiguar primer dígito
      if((numero.charAt(0) == '-' || numero.charAt(0) == '+') && numero.charAt(1) != ' ') {
      
        System.out.print("\nEl primer dígito es: " + numero.charAt(1));
      
      } else if (numero.charAt(1) == ' '){
      
        System.out.print("\nEl primer dígito es: " + numero.charAt(2));
      } else {
      
        System.out.print("\nEl primer dígito es: " + numero.charAt(0));
      }
    } else {
      
      System.out.print("\nEl número tiene más de cinco dígitos");
    }
  }
}
