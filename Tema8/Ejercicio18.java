import java.util.Scanner;
import matematicas.Varias;
/**
 * Programa que pasa un número decimal a uno binario
 * @author Iván Torres
 */
public class Ejercicio18 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número en decimal: ");
    long num = Long.parseLong(s.nextLine());
    System.out.println("Su valor en decimal es: " + matematicas.Varias.decimalBinario(num));
    
  }
}
