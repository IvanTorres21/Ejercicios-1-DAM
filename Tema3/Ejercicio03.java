import java.util.Scanner;

/*
 * Conversor de pesetas a euros, donde las pesetas son introducida por el usuario.
 */
 public class Ejercicio03 {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      double factorConversion = 166.368;
      System.out.print("Introduzca la cantidad de pesetas a convertir: ");
      double pesetas= s.nextDouble();
      System.out.printf("\n %.0f ptas, son: %.2f€", pesetas, (pesetas / factorConversion));
      
   }
}

