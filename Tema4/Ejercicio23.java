import java.util.Scanner;

/**
 * Programa que hace una factura a partir de la base imponible, el iva y una promocion
 * @author Iván Torres
 */
public class Ejercicio23 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la base imponible: ");
    double baseImp = s.nextDouble();
    s.nextLine();
    System.out.print("Introduzca el tipo de iva (general,reducido,superreducido): ");
    String tipoIva = (s.nextLine()).toLowerCase();
    System.out.print("Introduzca el descuento (nopro, mitad, meno5, 5porc): ");
    String tipoDesc = (s.nextLine()).toLowerCase();
    double iva = 0;
    switch (tipoIva) {
      
      case "general":
        
        iva = baseImp * 0.21;
        break;
      case "reducido":
        
        iva = baseImp * 0.1;
        break;
      case "superreducido": 
        
        iva = baseImp * 0.04;
        break;
    }
    double precioFinal = baseImp + iva;
    double desc = 0;
    switch (tipoDesc) {
      
      case "nopro":
        
        desc = 0;
        break;
      case "mitad":
        
        desc = - (precioFinal / 2);
        break;
      case "meno5":
        
        desc = -5;
        break;
      case "5porc":
        
        desc = - (precioFinal * 0.05);
        break;
    }
    precioFinal = precioFinal + desc;
    
    System.out.printf("\nBase imponible: %.2f", baseImp);
    System.out.printf("\nIva:            %.2f", iva);
    System.out.printf("\nDescuento:      %.2f", desc);
    System.out.printf("\n--------------------");
    System.out.printf("\nPrecio final:   %.2f", precioFinal);
        
  }
}
