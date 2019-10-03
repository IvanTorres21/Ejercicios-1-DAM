import java.util.Scanner;

/**
 * Programa que ordena tres numeros enteros introducidos por teclado.
 * @author Iván Torres
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce tres números enteros distintos separados por un espacio: ");
    int num1 = s.nextInt();
    int num2 = s.nextInt();
    int num3 = s.nextInt();
    s.nextLine();
    
    if (num1 > num2 && num1 > num3 && num2 > num3) {
      
      System.out.printf("\nEn orden de mayor a menor: %d, %d, %d", num1, num2, num3);
      
    } else if (num1 > num2 && num1 > num3 && num3 > num2) {
        
      System.out.printf("\nEn orden de mayor a menor: %d, %d, %d", num1, num3, num2);
      
    } else if (num2 > num1 && num2 > num3 && num3 > num1) {
      
      System.out.printf("\nEn orden de mayor a menor: %d, %d, %d", num2, num3, num1);
      
    } else if (num2 > num1 && num2 > num3 && num1 > num3) {
      
      System.out.printf("\nEn orden de mayor a menor: %d, %d, %d", num2, num1, num3);
      
    } else if (num3 > num1 && num3 > num2 && num2 > num1) {
      
      System.out.printf("\nEn orden de mayor a menor: %d, %d, %d", num3, num2, num1);
      
    } else if (num3 > num1 && num3 > num2 && num1 > num2) {
      
      System.out.printf("\nEn orden de mayor a menor: %d, %d, %d", num3, num1, num2);
      
    } else {
      
      System.out.printf("\nHay número iguales");
    }
  }
}
