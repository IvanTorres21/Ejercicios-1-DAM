import java.util.Scanner;
import matematicas.Varias;
/**
 * Programa que pasa un número en binario a decimal
 * @author Iván Torres
 */
public class Ejercicio17 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número en binario: ");
    long num = Long.parseLong(s.nextLine());
    System.out.println("Su valor en decimal es: " + matematicas.Varias.binarioDecimal(num));
    int n = s.nextInt();
    s.nextLine();
    System.out.println("Dígito: " + matematicas.Varias.digitoN(num, n));
  }
}
