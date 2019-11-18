import java.util.Scanner;
/**
 * Programa que pide 20 números y muestra luego la suma de sus filas y columnas a parte de la total.
 * @author Iván Torres
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int[][] array = new int[4][5];
    
    System.out.println("Introduzca solo números enteros por favor");
    int numAct = 1;
    //Pedimos los datos
    for (int i = 0; i < 4; i++) {
      
      for (int j = 0; j < 5; j++) {
        
        System.out.print(numAct + "º número: ");
        array[i][j] = Integer.parseInt(s.nextLine());
        numAct++;
      }
    }
    System.out.println();
    int sumTot = 0;
    //Mostramos el array y la suma de las filas
    for (int i = 0; i < 4; i++) {
      
      System.out.print("          ");
      int sum = 0;
      for (int j = 0; j < 5; j++) {
        
        System.out.printf("%4d", array[i][j]);
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
      System.out.printf("%4d", sum);
      sumTot += sum;
    }
    System.out.println(" Total: " + sumTot);
  }
}
