
import java.util.Scanner;

/**
 * Programa que pide las temperaturas medias de los meses del año y muestra un diagrama de barras
 *
 * @author Iván Torres
 */
public class Ejercicio08 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int[] temperaturasMedias = new int[12];
    String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
      "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    System.out.println("Introduzca la temperatura media de los meses: ");
    for (int i = 0; i < 12; i++) {
      
      System.out.print(meses[i] + ": ");
      temperaturasMedias[i] = Integer.parseInt(s.nextLine());
    }
    for (int i = 0; i < 12; i++) {
      
      System.out.printf("%15s |", meses[i]);
      for (int j = 0; j < temperaturasMedias[i]; j++) {
        
        System.out.print("█");
      }
      System.out.println();
    }

  }
}
