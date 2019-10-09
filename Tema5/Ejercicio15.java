import java.util.Scanner;


/**
* Programa que muestra todos las potencias de n^1 hasta n^m
* @author Iván Torres
*/
public class Ejercicio15 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la base y el exponente separado por un espacio: ");
    int base = s.nextInt();
    int exponente = s.nextInt();
    s.nextLine();
    int potenciaActual = 1;
    for (int i = 1; i <= exponente; i++) {
      
      potenciaActual = potenciaActual * base;
      System.out.print(base + " elevado a " + i + " es: " + potenciaActual + "\n");
    }
  }
}
