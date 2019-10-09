import java.util.Scanner;

/**
 * Programa que imprime una piramide hueca cuya altura ha sido introducida por teclado
 * @author Iván Torres
 */
public class Ejercicio20 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca el caracter que quiere usar para la pirámide: ");
    char caracter = (s.nextLine()).charAt(0);
    System.out.print("Introduzca la altura: ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.println();
    for (int i = 1; i < altura; i++) {
      
      for (int espacios = altura; espacios > i; espacios--) {
        
        System.out.print(" ");
      }
      System.out.print(caracter);
      for (int espacios = 0; espacios < i; espacios++) {
        
        System.out.print("  ");
      }
      System.out.print(caracter + "\n");
    }
    for (int i = -1; i <= (altura * 2); i++) {
      
      System.out.print(caracter);
    }
  }
}

/*
       for (int espacios = altura; espacios > i; espacios--) {
        
        System.out.print(" ");
      }
      System.out.print(caracter);
      for (int j = (i+1)*2; j > 0; j--) {
        
        System.out.print(" ");
      }
      System.out.print(caracter + "\n");
      if (i == altura) {
        
        for (int j = 0; j < (altura * 2); j++) {
          
          System.out.print(caracter);
        }
      }
*/
