import java.util.Scanner;
/**
 * Programa que pinta una serpiente que serpentea de manera aleatorio y tiene una longitud 
 * introducida por el usuario.
 * @author Iván Torres
 */
public class Ejercicio22 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int longitud;
    
    do {
    System.out.print("Introduzca la longitud de la serpiente: ");
    longitud = Integer.parseInt(s.nextLine());
    if (longitud <= 0) {
      
      System.out.println("No puede ser menor o igual que 0");
    }
    } while (longitud <= 0);
    int espacios = 13;
    int posCuerpo = 0;
    System.out.println(); //Para dejar mas hueco entre la serpiente y el texto
    for (int i = 0; i < longitud; i++) {
      
      for (int j = 0; j < espacios; j++) {
          
          System.out.print(" ");
        }
      if (i == 0) {
        
        System.out.print("@");
      } else {
        
        System.out.print("*");
      }
      posCuerpo = (int) (Math.random() * 3 )- 1 ;
      espacios += posCuerpo;
      System.out.println();
    }
  }
}
