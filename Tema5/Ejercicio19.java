import java.util.Scanner;

/**
 * Programa que imprime una piramide cuya altura ha sido introducida por teclado
 * @author Iván Torres
 */
public class Ejercicio19 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca el caracter que quiere usar para la pirámide: ");
    char caracter = (s.nextLine()).charAt(0);
    System.out.print("Introduzca la altura: ");
    int altura = Integer.parseInt(s.nextLine());
    for (int i = 0; i <= altura; i++) {
      
      for (int espacios = altura; espacios > i; espacios--) {
        
        System.out.print(" ");
      }
      for (int cantidadCaracteres = 0; cantidadCaracteres < (i * 2); cantidadCaracteres++) {
        
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
