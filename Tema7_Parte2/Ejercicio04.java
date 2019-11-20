
import java.util.Scanner;

/**
 * Programa que muestra una tabla de números aleatorios entre 100 y 999, luego hay una pausa antes
 * de cada suma parcial y total, dando la impresión de que el programa se queda pensando.
 *
 * @author Iván Torres
 */
public class Ejercicio04 {

  public static void main(String[] args)
    throws InterruptedException {
    
      Scanner s = new Scanner(System.in);

      int[][] array = new int[4][5];

      //Generamos los números
      for (int i = 0; i < 4; i++) {

        for (int j = 0; j < 5; j++) {

          array[i][j] = (int) (Math.random() * 900) + 100;
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
        Thread.sleep(1000);
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
        Thread.sleep(1000);
        System.out.printf("%6d", sum);
        sumTot += sum;
      }
      Thread.sleep(3000);
      System.out.println(" Total: " + sumTot);
  }
}
