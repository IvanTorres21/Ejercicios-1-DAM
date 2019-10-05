import java.util.Scanner;

/**
 * Programa que dice cuantas cifras tiene un número.
 * @author Iván Torres
 */
public class Ejercicio19 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número de cinco dígitos o menos: ");
    String numero = s.nextLine();
    int digitos;
    if((numero.charAt(0) == '-' || numero.charAt(0) == '+') && numero.charAt(1) != ' ') {
      
      digitos = numero.length()-1;
    } else if (numero.charAt(1) == ' '){
      
      digitos = numero.length()-2;
    } else {
      
      digitos = numero.length();
    }
    
    //Comprobar que no sea de más de cinco dígitos.
      if (digitos <= 5){
        
        System.out.print("\nTiene: " + digitos + " dígitos");
      } else {
        
        System.out.print("\nEl número tiene que tener cinco dígitos o menos");
      }
  }
}
