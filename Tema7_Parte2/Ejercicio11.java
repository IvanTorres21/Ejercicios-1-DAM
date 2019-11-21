
/**
 * Programa que muestra un array de 10x10 con números entre 200 y 300 y luego muestra los números
 * de la diagonal desde la esquina superior izquierda hasta la inferior derecha, su media, el máx
 * y el mín.
 * @author Iván Torres
 */
public class Ejercicio11 {
  public static void main(String[] args) 
    throws InterruptedException {
    
      int[][] array = new int[10][10];

      //Rellenamos el array de números aleatorios entre 200 y 300, los mostramos y comprobamos los valores de la diagonal
      double media = 0;
      int max = 0;
      int min = 400;
      for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {

          array[i][j] = (int) (Math.random()*101) + 200;
          System.out.print(array[i][j] + " ");
          if (i == j) {
            if (array[i][j] > max) {

              max = array[i][j];
            }
            if (array[i][j] < min) {

              min = array[i][j];
            }
            media += array[i][j];
          }
        }
        System.out.println();
      }
      media = media / 10;
      //Mostramos la díagonal del array
      System.out.println();
      Thread.sleep(2000);
      for (int i = 0; i<10; i++) {
        
        System.out.println(array[i][i]);
        for (int j = 0; j <= i; j++) {
          
          System.out.print("    ");
        }
        Thread.sleep(300);
      }
      System.out.printf("\nLa media es %.2f\nEl máximo es %d\nEl mínimo es: %d", media, max, min);
    }
}
