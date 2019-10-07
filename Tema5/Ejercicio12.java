import java.util.Scanner;

/**
 * Programa que muestra los primeros n números de la secuencia de fibonacci.
 * @author Iván Torres
 */
public class Ejercicio12 {
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la cantidad de numeros de la secuencia de Fibonacci que quieres ver: ");
    int cant = Integer.parseInt(s.nextLine());
    int numFib = 0;
    int numFibNuevo = 1;
    int aux = 0;
    for (int i = 0; i < cant; i++) {
      
      System.out.printf("\n%d", numFib);
      aux = numFib;
      numFib = numFibNuevo;
      numFibNuevo = aux + numFibNuevo;
    }
       
  }
}
