/**
 * Programa que parte un úmero por donde el usuario diga y muestra ambos números.
 * @author Iván Torres
 */
import java.util.Scanner;

public class Ejercicio43 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca el número de dos o más digitos: ");
    long num = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el digito por el que quieres partir (1, 2, 3, ...): ");
    int dig = Integer.parseInt(s.nextLine());
    
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
    long nuevoNum2 = -(nuevoNum1 * (long) Math.pow(10, cantidadDig-dig) - num);
    
    System.out.println("Los números son: ");
    System.out.print(nuevoNum1 + " / " + nuevoNum2);
  }
}
