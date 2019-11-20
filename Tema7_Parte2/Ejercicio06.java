
/**
 * Programa que muestra una tabla de 6 x 10 con valores entre 0 y 1000, luego muestra la posición
 * del máximo y el mínimo. Los valores no pueden repetirse.
 *
 * @author Iván Torres
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    
    int[][] array = new int[6][10];
    //Posicion de la fila y columna del máximo y del mínimo
    int posFmax = 0;
    int posFmin = 0;
    int posCmax = 0;
    int posCmin = 0;
    //Genera los números aleatorios y mira quien es el máximo y quien el mínimo
    for (int i = 0; i < 6; i++) {

      for (int j = 0; j < 10; j++) {
        
        array[i][j] = (int) (Math.random() * 1001);
        boolean igual = false;
        do { //Comprueba si ya está en el array
          igual = false;
          for (int k = 0; k < i; k++) {

            for (int h = 0; h < j; h++) {

              if (array[i][j] == array[k][h]) {

                igual = true;
              }
            }
          }
          if (igual) {
            
            array[i][j] = (int) (Math.random() * 1001);
          }
        } while (igual);
        System.out.printf("|%4d|", array[i][j]);
        if (array[i][j] > array[posFmax][posCmax]) {

          posFmax = i;
          posCmax = j;
        }
        if (array[i][j] < array[posFmin][posCmin]) {

          posFmin = i;
          posCmin = j;
        }
      }
      System.out.println();
    }
    System.out.print("\nEl máximo está en: " + posFmax + " " + posCmax);
    System.out.println(" y es: " + array[posFmax][posCmax]);
    System.out.print("El mínimo está en: " + posFmin + " " + posCmin);
    System.out.println(" y es: " + array[posFmin][posCmin]);
  }
}
