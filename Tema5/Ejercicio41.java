/**
 * Programa que cuenta cuantos números pares e impares tiene un número introducido por teclado
 * @author Iván Torres
 */
import java.util.Scanner;

public class Ejercicio41 {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número: ");
    String num = s.nextLine();
    
    int cantPar = 0;
    int cantImpar = 0;
    for (int i = 0; i < num.length(); i++) {
      
      if (Character.getNumericValue(num.charAt(i)) % 2 == 0) {
        
        cantPar++;
      } else {
        
        cantImpar++;
      }
    }
    System.out.printf("Hay %d pares\nHay %d impares", cantPar, cantImpar);
  }
}
