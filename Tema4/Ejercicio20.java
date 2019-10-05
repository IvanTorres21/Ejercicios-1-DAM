import java.util.Scanner;

/**
 * Programa que dice si un número positivo entero de hasta cinco cifras es capicua.
 * @author Iván Torres
 */
public class Ejercicio20 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número de hasta cinco dígitos, solo positivos: ");
    String numero = s.nextLine();
    //Comprobar tamaño del número
    int digitos = numero.length();
    if (numero.charAt(0) == '+' || numero.charAt(0) == '-') {
      
      System.out.print("\nNo uses ni + ni - al introducir el numero");
      
    } else {
      
    if (digitos <= 5) {
      
      switch (digitos) {
        
        case 1:
          
          System.out.print("\nEl número es una sola cifra...");
          break;
          
        case 2:
          
          if (numero.charAt(0) == numero.charAt(1)) {
            
            System.out.print("\nEl número es capicua");
          }
          break;
          
        case 3:
          
          if (numero.charAt(0) == numero.charAt(2)) {
            
            System.out.print("\nEl número es capicua");
          }
          break;
          
        case 4:
          
          if (numero.charAt(0) == numero.charAt(3) && numero.charAt(1) == numero.charAt(2)) {
            
            System.out.print("\nEl número es capicua");
          }
          break;
        
        case 5:
        
          if (numero.charAt(0) == numero.charAt(4) && numero.charAt(1) == numero.charAt(3)) {
            
            System.out.print("\nEl número es capicua");
          }
          break;
          
        default:
          
          System.out.print("\nEl número no es capicua");
          break;
      }
    } else {
      
      System.out.print("\nEl número tiene más de cinco dígitos");
    }
  }
  }
}
