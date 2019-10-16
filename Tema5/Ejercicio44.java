/**
 * Programa que añade un dígito a un número en una posicion definida por el usuarip-
 * @author Iván Torres
 */
import java.util.Scanner;

public class Ejercicio44 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca el número: ");
    long num = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el digito en el que quieres meter un número (1, 2, 3, ...): ");
    int dig = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el número a introducir: ");
    int numIntroducir = Integer.parseInt(s.nextLine());
    
    long division = 0;
    int cantidadDig = 0;
    int potencia = 1;
    do {
      
      
      division = num / (long) (Math.pow(10, potencia));
      potencia++;
      cantidadDig++;
    } while (division > 0);
    
    cantidadDig++;
    long nuevoNum1 = num / (long) (Math.pow(10, cantidadDig-dig));
    long nuevoNum2 = -(nuevoNum1 * (long) Math.pow(10, cantidadDig-(dig)) - num);
    long numFinal = (nuevoNum1 * (long) Math.pow(10, cantidadDig-(dig-1))); //Separado por ser muy largo
    numFinal += + (numIntroducir * Math.pow(10, cantidadDig-(dig)));
    numFinal += nuevoNum2;
    System.out.println("El número es: " + numFinal);
  }
}
