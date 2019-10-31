import java.util.Scanner;
/**
 * Programa que dice al azar un dígito de un número introducido por teclado
 * @author Iván Torres
 */
public class Ejercicio24 {
  public static void main(String[] args) {
    
   Scanner s = new Scanner(System.in);
   
   System.out.print("Introduzca un número entero positivo y te diré un dígito aleatorio del mismo: ");
   long num = Long.parseLong(s.nextLine());
   
   int dig = 1;
   do {
     
     if (num / (long) Math.pow(10, dig) != 0) {
       
       dig++;
     }
   } while (num / (long) Math.pow(10, dig) != 0);
   int digEl = (int) (Math.random() * dig) + 1;
   
   long resDig = (long) num / (long) Math.pow(10, dig -digEl);
   resDig = resDig - (( (long) num / (long) Math.pow(10, dig - digEl +1)) * 10);
   System.out.println("El digito elegido es: " + digEl + " y su valor es: " + resDig);
   
  }
}
