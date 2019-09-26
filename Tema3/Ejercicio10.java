import java.util.Scanner;

/*
 * Conversor de Mb a Kb
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca los Mb: ");
    int megaBytes = s.nextInt();
    System.out.printf("\n%d Mb son %d Kb", megaBytes, megaBytes * 1000); // 1 Mb son 1000 Kb
  }
}
