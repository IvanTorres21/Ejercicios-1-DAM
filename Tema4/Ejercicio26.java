import java.util.Scanner;
import java.lang.Object;

/**
 * Programa que calcula el precio de unas entradas.
 * @author Iván Torres.
 */
public class Ejercicio26 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Venta de entrada CineCampa");
    System.out.print("Número de entradas: ");
    int numEntradas = Integer.parseInt(s.nextLine());
    System.out.print("Día de la semana: ");
    String dia = (s.nextLine()).toLowerCase();
    System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
    char tarjeta = s.next().charAt(0);
    
    System.out.print("\nAquí tiene sus entradas. Gracias por su compra.");
    double precioEntradas = 0;
    double precioEntradasPar = 0;
    int entradasIndividuales = 0; //Para separar las entradas los jueves
    int entradasPareja = 0;
    if (dia.equals("miercoles") || dia.equals("miércoles")) {
     
      entradasIndividuales = numEntradas;
      precioEntradas = entradasIndividuales * 5;
      System.out.printf("\nEntradas individuales:         %d", entradasIndividuales);
      System.out.printf("\nPrecio por entrada individual: 5");
    } else if (dia.equals("jueves")) {
     
      entradasPareja = numEntradas / 2;
      precioEntradasPar = entradasPareja * 11;
      System.out.printf("\nEntradas parejas:              %d", entradasPareja);
      System.out.printf("\nPrecio por entrada pareja:     11");
      if (numEntradas % 2 != 0) {
        
        entradasIndividuales = numEntradas - (entradasPareja * 2);
        precioEntradas = entradasIndividuales * 8;
        System.out.printf("\nEntradas individuales:         %d", entradasIndividuales);
        System.out.printf("\nPrecio por entrada individual: 8");
      }
    } else {
      
        entradasIndividuales = numEntradas;
        precioEntradas = entradasIndividuales * 8;
        System.out.printf("\nEntradas individuales:         %d", entradasIndividuales);
        System.out.printf("\nPrecio por entrada individual: 8");
    }
    
    double precioEntradasTotal = precioEntradasPar + precioEntradas;
    System.out.printf("\nTotal:                         %.2f", precioEntradasTotal);
    double descuento = precioEntradasTotal * 0.1;
    if (tarjeta == 's' || tarjeta == 'S') {
      
      System.out.printf("\nDescuento:                     %.2f", descuento);
    } 
    System.out.printf("\nA pagar:                       %.2f", precioEntradasTotal - descuento);
  }
}
