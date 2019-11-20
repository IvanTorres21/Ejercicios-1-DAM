import java.util.Scanner;
/**
 * Programa que muestra una tabla de números aleatorios entre 100 y 999 y la suma de filas, columnas
 * y el total.
 * @author Iván Torres
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int[][] array = new int[4][5];
    
    //Generamos los números
    for (int i = 0; i < 4; i++) {
      
      for (int j = 0; j < 5; j++) {
        
        array[i][j] = (int) (Math.random()*900) + 100;
      }
    }
    System.out.println();
    int sumTot = 0;
    //Mostramos el array y la suma de las filas
    for (int i = 0; i < 4; i++) {
      
      System.out.print("          ");
      int sum = 0;
      for (int j = 0; j < 5; j++) {
        
        System.out.printf("%6d", array[i][j]);
        sum += array[i][j];
      }
      System.out.println(" Suma: " + sum);
      sumTot += sum;
    }
    //Mostramos la suma de las columnas
    System.out.print("Columnas: ");
    for (int j = 0; j < 5; j++) {
      int sum = 0;
      for (int i = 0; i < 4; i++) {
        
        sum += array[i][j];
      }
      System.out.printf("%6d", sum);
      sumTot += sum;
    }
    System.out.println(" Total: " + sumTot);
  }
}
