
/**
 * Programa que rota en el sentido de las agujas del reloj una matriz de tamaño 12
 * @author Iván Torres
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    
    int[][] array = new int[12][12];
    
    //Damos valores aleatorios al array y lo mostramos
    System.out.println("Matriz original: ");
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 12; j++) {
        
        array[i][j] = (int) (Math.random() * 101);
        System.out.printf("%3d", array[i][j]);
      }
      System.out.println();
    }
    //Rotamos el array
    for (int k = 0; k < 6; k++) { //Para movernos por las capas
      int aux;
      for (int i = k; i < (11-k); i++) { //Primer movimiento
        
          aux = array[i+1][k];
          array[i+1][k] = array[i][k];
          array[i][k] = aux;
      }
      for (int j = k; j < (11-k); j++) { //Segundo movimiento
        
        aux = array[11-k][j+1];
        array[11-k][j+1] = array[11-k][j];
        array[11-k][j] = aux;
      }
      for (int i = 11-k; i > k; i--) { //Tercer movimiento
        
        aux = array[i-1][11-k];
        array[i-1][11-k] = array[i][11-k];
        array[i][11-k] = aux;
      }
      for (int j = 11-k; j > (k+1); j--) { //Cuarto movimiento
        
        aux = array[k][j-1];
        array[k][j-1] = array[k][j];
        array[k][j] = aux;
      }
    }
    //Mostramos array rotado
    System.out.println("Matriz modificado: ");
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 12; j++) {
        
        System.out.printf("%3d", array[i][j]);
      }
      System.out.println();
    }
  }
}
