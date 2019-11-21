
/**
 * Programa que muestra una tabla con las alturas de cuatro países: España, Rusia, Japón y Australia.
 * Las alturas son valores aleatorios entre 140 y 210, y hay 10 alturas por cada país
 * @author Iván Torres
 */
public class Ejercicio12 {
   public static void main(String[] args) {
     
     String[] pais = {"España", "Rusia", "Japón", "Australia"};
     int[][] altura = new int[4][10];
     //Damos valores al array altura
     for (int i = 0; i < 4; i++) {
       for (int j = 0; j < 10; j++) {
         
         altura[i][j] = (int) (Math.random() * 71) + 140; 
       }
     }
     //Mostramos la tabla y sus medias, máximos y mínimos
     int max;
     int min;
     int media;
     System.out.printf("%-53s MED MIN MAX\n", "");
     for (int i = 0; i < 4; i++) {
       //Reseteamos los valores de media, máximo y mínimo 
       max = 0;
       min = 300;
       media = 0;
       System.out.printf("%-10s:", pais[i]);
       for (int j = 0; j < 10; j++) {
         System.out.print(" " + altura[i][j]);
         if (altura[i][j] > max) {
           
           max = altura[i][j];
         }
         if (altura[i][j] < min) {
           
           min = altura[i][j];
         }
         media += altura[i][j];
       }
       System.out.printf(" | %3d %3d %3d\n", (media/10), min, max);
     }
     
   }
}
