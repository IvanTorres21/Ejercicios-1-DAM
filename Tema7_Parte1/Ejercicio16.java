import java.util.Scanner;
/**
 * Programa que muestra 20 números aleatorios entre 0 y 400 y pregunta al usuario si quiere
 * resaltar los multiplo de 5 o 7.
 * @author Iván Torres
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int[] array = new int[20];
    
    for (int i = 0; i < 20; i++) { //Asignamos valores al array
      
      array[i] = (int) (Math.random() * 401);
    }
    for (int i = 0; i < 20; i++) { //Mostramos el array.
      
      System.out.print(" " + array[i]);
    }
    
    System.out.print("\n¿Quieres resaltar los multiplos de 5 o 7? ");
    int opc = Integer.parseInt(s.nextLine());
    while (opc != 5 && opc != 7) {
      
      System.out.print("Datos incorrectos, intentelo de nuevo: ");
      opc = Integer.parseInt(s.nextLine());
    }
    
    for (int i = 0; i < 20; i++) {
      
      if (array[i] % opc == 0) {
        
        System.out.print("[" + array[i] + "] ");
      } else {
        
        System.out.print(array[i] + " ");
      }
    }
  }
}
