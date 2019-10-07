import java.util.Scanner;

/**
 * Programa que dice cuantos números son positivos y cuantos negativos de diez numeros introducidos
 * por teclado.
 * @author Iván Torres
 */
public class Ejercicio13 {
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    int numPos = 0;
    int numNeg = 0;
    for (int i = 1; i <= 10; i++) {
      
      System.out.printf("Introduzca el %dº número de la lista: ", i);
      double numAct = Double.parseDouble(s.nextLine());
      if (numAct < 0) {
        
        numNeg++;
      } else {
        
        numPos++;
      }
    }
    System.out.printf("\nHay %d positivos y %d negativos", numPos, numNeg);
  }
}
