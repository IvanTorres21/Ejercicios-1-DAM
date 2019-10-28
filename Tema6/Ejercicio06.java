
/**
 * Programa que crea un número aleatorio entre 0 y 100 y pregunta al usuario cual es.
 * Si falla cinco veces pierde, cada vez que falla se le dice si es mayor o menor.
 * @author Iván Torres
 */
import java.util.Scanner;

public class Ejercicio06 {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Inteta adivinar el número, es entre 0 y 100.");
    int num = (int) (Math.random() * 101);
    int intentoUsuario = -1;
    for (int i = 5; i > 0 && intentoUsuario != num; i--) {
      
      System.out.printf("Tienes (%d) intentos: ", i);
      intentoUsuario = Integer.parseInt(s.nextLine());
      if (intentoUsuario > num) {
        
        System.out.println("El número es más pequeño");
      } else if (intentoUsuario < num) {
        
        System.out.println("El número es más grande");
      }
    }
    if (num == intentoUsuario) {
      
      System.out.println("Has acertado!");
    } else {
      
      System.out.println("Has fallado... el número era: " + num);
    }
  }
}
