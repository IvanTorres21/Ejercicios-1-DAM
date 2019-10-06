import java.util.Scanner;

/**
 * Programa que hace presupuestos de tartas.
 * @author Iván Torres.
 */
public class Ejercicio27 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
    String sabor = (s.nextLine()).toLowerCase();
    if (sabor.equals("chocolate")) {
      
      System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
      sabor = (s.nextLine()).toLowerCase();
    }
    System.out.print("¿Quiere nata? (si o no): ");
    String nata = (s.nextLine()).toLowerCase();
    System.out.print("¿Quieres ponerle un nombre? (si o no): ");
    String nombre = (s.nextLine()).toLowerCase();
    System.out.print("\n");
    double precio = 0;
    switch (sabor) {
      
      case "manzana":
        
        precio = 18;
        System.out.printf("Tarta de manzana: %.2f €", precio);
        break;
      case "fresa":
      
        precio = 16;
        System.out.printf("Tarta de fresa: %.2f €", precio);
        break;
      case "negro":
        
        precio = 14;
        System.out.printf("Tarta de chocolate negro: %.2f €", precio);
        break;
      case "blanco":
      
        precio = 15;
        System.out.printf("Tarta de chocolate blanco: %.2f €", precio);
        break;
    }
    if (nata.equals("si") || nata.equals("sí")) {
      
      System.out.print("\nCon nata: 2.50 €");
      precio += 2.5;
    }
    if (nombre.equals("si") || nombre.equals("sí")) {
      
      System.out.print("\nCon nombre: 2.75 €");
      precio += 2.75;
    }
    
    System.out.printf("\nTotal: %.2f", precio);
  }
}
