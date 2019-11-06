import java.util.Scanner;
/**
 * Programa que imprime un sendero de 6 de ancho con curvas aleatorias y obstaculos.
 * @author Iván Torres
 */
public class Ejercicio32 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la longitud del sendero: ");
    int longitud = Integer.parseInt(s.nextLine());
    
    int pos = 0; //Esta variable tomara valores entre -1 y 1, permitiendo modificar luego la dirección del camino
    int obstaculo; //Comprueba si hay obstaculo o no.
    int tipObstaculo; //Mira que tipo de obstaculo es.
    int posObstaculo;
    for (int i = 0; i < longitud; i++) {
      
      //Imprime los espacios y se encarga de girar el camino.
      for (int j = 0; j < 8 - pos; j++) {
        
        System.out.print(" ");
      }
      System.out.print("|");
      obstaculo = (int) (Math.random()*2);
      if (obstaculo == 1) { // Hay obstaculo
        
        tipObstaculo = (int) (Math.random() * 2);
        posObstaculo = (int) (Math.random() * 4);
        for (int j = 0; j < 4; j++) {
        
          if (j == posObstaculo) {
          
            if (tipObstaculo == 0) {
              
              System.out.print("*"); //Imprime arbusto
            } else {
              
              System.out.print("O"); //Imprime roca
            }
          } else {
            
            System.out.print(" "); //Imprime espacio vacio
          }
        }
      } else { //Si no hay obstaculo
        
        for (int j = 0; j < 4; j++) {
          
          System.out.print(" ");
        }
      }
      System.out.println("|");
      pos = (int) (Math.random() * 3) - 1; //Se encarga de cambiar la dirección.
    }
  }
}
