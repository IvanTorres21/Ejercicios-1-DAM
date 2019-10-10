import java.util.Scanner;

/**
 * Programa que muestra todos los enteros positivos menores que uno introducido por teclado
 * y que no sean divisibles por otro número introducido.
 * @author Iván Torres
 */
public class Ejercicio29 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa muestra todos los números enteros positivos menores que uno");
    System.out.println("introducido por teclado, y que no sean divisibles por otro número");
    int numInicio = 0;
    int numDivisor = 0;
    do {
      
      System.out.print("Introduce el número desde el que empezar: ");
      numInicio = Integer.parseInt(s.nextLine());
      System.out.print("Introduzca el número por el que no puede ser divisible: ");
      numDivisor = Integer.parseInt(s.nextLine());
      if (numInicio <= 0 || numDivisor <= 0) {
        
        System.out.println("El número no puede ser ni negativo ni cero.");
      }
    } while (numDivisor <= 0 || numInicio <= 0);
    
    for (;numInicio > 0; numInicio--) {
      
      if(numInicio % numDivisor != 0) {
        
        System.out.println(numInicio);
      }
    }
  }
}
