import java.util.Scanner;
/**
 * Programa que muestra 100 números aleatorios entre 0 y 500, luego pregunta al usuario si quiere
 * resaltar el máximo o el mínimo y lo resalta entre asteriscos.
 * @author Iván Torres
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int[] array = new int[100];
    int max = 0;
    int min = 501;
    for (int i = 0; i < 100; i++) {
      
      array[i] = (int) (Math.random()*501);
      if (array[i] > max) {
        
        max = array[i];
      }
      if (array[i] < min) {  
       
        min = array[i];
      }
      System.out.printf(" %d", array[i]);
      if (i == 30 || i == 60 || i == 90) {
        
        System.out.println();
      }
    }
    
    System.out.print("\nQue quiere resaltar? (1 - mínimo, 2 - máximo): ");
    int opcion = Integer.parseInt(s.nextLine());
    while (opcion != 1 && opcion != 2) {
      
      System.out.print("\nIntroduzca una opcion valida (1 - mínimo, 2 - máximo): ");
      opcion = Integer.parseInt(s.nextLine());
    }
    
    for (int i = 0; i < 100; i++) {
      
      switch (opcion) {
        
        case 1: 
          
          if (array[i] == min){
            
            System.out.printf(" **%d**", array[i]);
          } else {
            
            System.out.printf(" %d", array[i]);
          }
          break;
        case 2: 
          
          if (array[i] == max){
            
            System.out.printf(" **%d**", array[i]);
          } else {
            
            System.out.printf(" %d", array[i]);
          }
          break;
      }
      if (i == 30 || i == 60 || i == 90) {
        
        System.out.println();
      }
    }
  }
}
