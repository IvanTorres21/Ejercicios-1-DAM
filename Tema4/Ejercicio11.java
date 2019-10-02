import java.util.Scanner;

/**
 * Programa que calcula el tiempo en segundos que queda para llegar a medianoche
 * @author Iván Torres
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la hora y los minutos separados por un espacio: ");
    int hora = s.nextInt();
    int minutos = s.nextInt();
    
    if (hora < 0 || hora > 24 || minutos < 0 || minutos >= 60) {
      
      System.out.print("\nLa hora y minutos tienen que ser según el estandar de 24 horas");
      
    } else if (hora == 0 && minutos == 0){
      
      System.out.print("\nYa es medianoche");
      
    } else {
      
      //Un día tiene 86400 segundos
      int segundosMedianoche = 86400 - ((hora * 3600) + (minutos * 60));
      
      System.out.printf("\nQuedan %d segundos hasta medianoche", segundosMedianoche);
      
    }
    
  }
}
