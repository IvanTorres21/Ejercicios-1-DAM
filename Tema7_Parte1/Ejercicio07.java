import java.util.Scanner;
/**
 * Programa que genera 20 numeros aleatorios entre 0 y 100 y luego sustituye uno de esos números
 * por otro introducido por teclado.
 * @author Iván Torres
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Eliga un valor que se encuentre en el siguiente array y luego escriba por que valor quiere sustituirlo");
    
    int[] num = new int[20];
    
    for (int i = 0; i < 20; i++) {
      
      num[i] = (int) (Math.random() * 20);
      System.out.print(" " + num[i]);
    }
    System.out.print("\nElecciones: ");
    int numEl = s.nextInt();
    int numCam = s.nextInt();
    s.nextLine();
    for (int i = 0; i < 20; i++) {
      
      if (num[i] == numEl) {
        
        num[i] = numCam;
        System.out.print(" \"" + num[i] + "\"");
      } else {
        
        System.out.print(" " + num[i]);
      }
      
    }
  }
}
