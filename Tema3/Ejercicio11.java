import java.util.Scanner;

/*
 * Conversor de Kb a Mb.
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca los Kb: ");
    int kiloBytes = s.nextInt();
    System.out.printf("\n%d Kb son %.2f Mb", kiloBytes, (float) kiloBytes * 0.001); // 1 Mb son 1000 Kb
  }
}
