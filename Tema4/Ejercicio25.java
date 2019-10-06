import java.util.Scanner;

/**
 * Programa que calcula el precio de una bandera en base a su area.
 * @author Iván Torres.
 */
public class Ejercicio25 {
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura y el ancho en cm: ");
    double altura = s.nextDouble();
    double ancho = s.nextDouble();
    s.nextLine();
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    char escudo = (s.next().charAt(0));
    double area = altura * ancho;
    double precioFinal = area * 0.01;
    System.out.print("\nGracias. Aquí tiene le desglose de su compra.");
    System.out.printf("\nBandera de %.2f cm2: %.2f", area, precioFinal);
    if (escudo == 's' || escudo == 'S') {
      
      System.out.printf("\nCon escudo:       2.50");
      precioFinal += 2.5;
    } else {
      
      System.out.printf("\nSin escudo:            0 ");
    }
    System.out.printf("\nGastos de envio:       3.25");
    precioFinal += 3.25;
    System.out.printf("\nTotal:                %.2f", precioFinal); 
    
  }
}
