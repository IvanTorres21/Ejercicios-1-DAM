
/**
 * Programa que mueve todos los dígitos de un número introducido a la derecha.
 * @author Iván Torres
 */
import java.util.Scanner;

public class Ejercicio52 {
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    int num;
    do {
    System.out.print("Introduzca un número entero positivo: ");
    num = Integer.parseInt(s.nextLine());
    
    } while (num < 0);
    
    //Contar dígitos del número
    int cont = 1;
    do {
      
      if (num / (int) Math.pow(10, cont) != 0) {
        
        cont++;
      }
    } while (num / (int) Math.pow(10, cont) != 0);
    
    int aux = (num / (int) Math.pow(10, cont-1)) * (int) Math.pow(10, cont-1);
    int nuevoNum = (num - aux) * 10;
    nuevoNum += (aux / (int) Math.pow(10, cont-1));
    System.out.println("El nuevo número es: " + nuevoNum);
    
  }
}
