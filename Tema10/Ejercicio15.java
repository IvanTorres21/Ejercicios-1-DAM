import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Ejercicio15 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    HashMap<String, Double> dicPro = new HashMap<String, Double>();
    dicPro.put("avena", 2.21);
    dicPro.put("garbanzos", 2.39);
    dicPro.put("tomate", 1.59);
    dicPro.put("jengibre", 3.13);
    dicPro.put("quinoa", 4.50);
    dicPro.put("guisantes", 1.60);
    ArrayList<String> fact1 = new ArrayList<String>();
    ArrayList<Integer> fact2 = new ArrayList<Integer>();
    String opt = "";
    System.out.println("Introduzca el nombre de los productos y la cantidad");
    System.out.println("Introduzca 'fin' para salir.");
    do {
      
      System.out.print("Producto: ");
      opt = s.nextLine().toLowerCase();
      if (dicPro.containsKey(opt)) {
        
        System.out.print("Cantidad: ");
        int cant = Integer.parseInt(s.nextLine());
        if (cant <= 0) {
          
          System.out.println("Cantidad no valida");
        } else {
          
          fact1.add(opt);
          fact2.add(cant);
        }
      }
    } while (!opt.equals("fin"));
    System.out.print("Introduzca codigo de descuento (INTRO si no tiene uno): ");
    String CodDesc = s.nextLine();
    //Comprobar valores repetidos en la lista
    
    for (int i = 0; i < fact1.size(); i++) {
      
      for (int j = i+1; j < fact1.size(); j++) {
        
        if (fact1.get(i).equalsIgnoreCase(fact1.get(j))) {
          
          fact2.set(i, fact2.get(i) + fact2.get(j));
          fact1.remove(j);
          fact2.remove(j);
        }
      }
    }
    //Generación de factura
    System.out.printf("Producto Precio Cantidad Subtotal\n");
    System.out.printf("---------------------------------\n");
    double precioFin = 0;
    for (int i = 0; i < fact1.size(); i++) {
      
      System.out.printf("%-8s %6.2f %8d %8.2f\n", fact1.get(i), dicPro.get(fact1.get(i)), fact2.get(i), dicPro.get(fact1.get(i)) * fact2.get(i));
      precioFin += dicPro.get(fact1.get(i)) * fact2.get(i);
    }
    if (CodDesc.equals("ECODTO")) {
      
      System.out.println("---------------------------------");
      System.out.printf("Descuento: %.2f\n", precioFin * 0.1);  
    }
    
    System.out.println("---------------------------------");
    System.out.printf("Total: %.2f\n", precioFin - (precioFin * 0.1));
  }
}
