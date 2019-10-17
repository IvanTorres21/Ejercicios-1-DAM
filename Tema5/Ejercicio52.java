
/**
 * Programa que mueve todos los dígitos de un número introducido a la derecha.
 * @author Iván Torres
 */
import java.util.Scanner;

public class Ejercicio52 {
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    long num;
    do {
    System.out.print("Introduzca un número entero positivo: ");
    num = Long.parseLong(s.nextLine());
    
    } while (num < 0);
    
    //Contar dígitos del número
    int cont = 1;
    do {
      
      if (num / (long) Math.pow(10, cont) != 0) {
        
        cont++;
      }
    } while (num / (long) Math.pow(10, cont) != 0);
    if (cont > 1) {
      
      long aux = (num / (long) Math.pow(10, cont-1)) * (long) Math.pow(10, cont-1);
      long nuevoNum = (num - aux) * 10;
      nuevoNum += (aux / (long) Math.pow(10, cont-1));
      System.out.println("El nuevo número es: " + nuevoNum);
    } else {
    
    System.out.println("El número es de un dígito: " + num);
  }
  }
}
