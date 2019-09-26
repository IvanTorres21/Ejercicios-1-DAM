import java.util.Scanner;

/*
 * Conversor de euros a pesetas, donde los euros son introducidos por el usuario.
 */
 public class Ejercicio02 {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      double factorConversion = 166.368;
      System.out.print("Introduzca la cantidad de euros a convertir: ");
      double euros = s.nextDouble();
      System.out.printf("\n %.2f€, son: %.0f ptas", euros, (euros * factorConversion));
      
   }
}
