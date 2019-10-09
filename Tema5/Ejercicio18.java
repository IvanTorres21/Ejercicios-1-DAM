import java.util.Scanner;

/**
 * Programa que muestra los numeros entre n y m de 7 en 7.
 * @author Iván Torres.
 */
public class Ejercicio18 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    int num1 = 0;
    int num2 = 0;
    do {
      
      System.out.print("introduzca dos numeros enteros distintos: ");
      num1 = s.nextInt();
      num2 = s.nextInt();
      s.nextLine();
    } while (num1 == num2);
    
    if (num1 < num2) {
      
      while (num1 <= num2) {
        
        System.out.println(num1);
        num1 += 7;
      }
      System.out.println(num2);
    } else {
      
      while (num2 <= num1) {
        
        System.out.println(num2);
        num2 += 7;
      }
      System.out.println(num1);
    }
  }
}
