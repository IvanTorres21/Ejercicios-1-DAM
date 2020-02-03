import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Ejercicio13 {
  
  public static Scanner s = new Scanner(System.in);
  public static DecimalFormat form = new DecimalFormat("#0.00");
  
  public static void main(String[] args) {
    
    
    int opt = 0;
    int cant = 0;
    ArrayList<Articulo> art = new ArrayList<Articulo>();
    art.add(new Articulo("Atún", 20, 2.4, 3.4));
    art.add(new Articulo("Rosada", 50, 4.1, 6.3));
    art.add(new Articulo("Merluza", 20, 4.1, 6.3));
    
    do {
      
      System.out.println("=====================================");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificacion");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Venta");
      System.out.println("7. Salir");
      System.out.println("Que quieres hacer: ");
      opt = Integer.parseInt(s.nextLine());
      
      switch(opt) {
        
        case 1:
          mostrarArticulos(art);
          break;
        case 2:
          incluirArticulo(art);
          break;
        case 3:
          mostrarArticulos(art);
          System.out.print("Cual quieres eliminar: ");
          opt = Integer.parseInt(s.nextLine());
          while (opt <= 0 || opt > Articulo.codAct) {
            
            System.out.println("Valor no valido, vuelva a intentarlo: ");
            opt = Integer.parseInt(s.nextLine());
          }
          eliminarArticulo(art, opt);
          break;
        case 4:
          mostrarArticulos(art);
          System.out.print("Que articulo va a modificar: ");
          opt = Integer.parseInt(s.nextLine());
          while (opt <= 0 || opt > Articulo.codAct) {
            
            System.out.println("Valor no valido, vuelva a intentarlo: ");
            opt = Integer.parseInt(s.nextLine());
          }
          modArticulo(art);
          break;
        case 5:
          mostrarArticulos(art);
          System.out.print("Que articulo a entrado: ");
          opt = Integer.parseInt(s.nextLine());
          while (opt <= 0 || opt > Articulo.codAct) {
            
            System.out.println("Valor no valido, vuelva a intentarlo: ");
            opt = Integer.parseInt(s.nextLine());
          }
          System.out.println("Cuantos van a entrar");
          cant = Integer.parseInt(s.nextLine());
          while (cant <= 0) {
            
            System.out.println("Valor no valido, vuelve a intentarlo");
            cant = Integer.parseInt(s.nextLine());
          }
          entraMercancia(art, opt, cant);
          break;
        case 6:
          ventaArticulo(art);
          break;
        case 7:
          break;
        default:
          System.out.println("Opción no valida!");
      }
      
    } while (opt != 7);
  }
  
  /**
   * Función que muestra todos los elementos de una lista de articulos
   * @param art La lista de articulos
   */
  public static void mostrarArticulos(ArrayList<Articulo> art) {
    
    if (!art.isEmpty()) {
      
      for (Articulo a : art) {
        
        System.out.println(a);
      }
    } else {
      
      System.out.println("No hay articulos disponibles");
    }
  }
  /**
   * Función que elimina un articulo de una lista 
   * @param art Lista de articulos del que se va a eliminar
   * @param cod Codigo del articulo a eliminar
   */
  public static void eliminarArticulo(ArrayList<Articulo> art, int cod) {
    
    boolean existe = false;
    for (Articulo n : art) {
      
      if (n.getCodigo() == cod) {
        
        existe = true;
      }
    }
    if (existe) {
      
      art.removeIf(c -> (c.getCodigo() == cod));
    } else {
      
      System.out.println("No existe el articulo con el código: " + cod);
    }
  }
  /**
   * Función que añade un articulo a una lista
   * @param art Lista de articulos
   */
  public static void incluirArticulo(ArrayList<Articulo> art) {
    
    System.out.println("\nQue articulo es: ");
    String des = s.nextLine();
    System.out.println("Cuantos hay: ");
    int can = Integer.parseInt(s.nextLine());
    System.out.println("Precio de compra: ");
    double precCom = Double.parseDouble(s.nextLine());
    System.out.println("Precio de venta: ");
    double precVen = Double.parseDouble(s.nextLine());
    art.add(new Articulo(des, can, precCom, precVen));
  }
  /**
   * Función que añade más cantidad a un articulo existente
   * @param art Array de articulos
   * @param cod Codigo del articulo
   * @param cant Cantidad a añadir
   */
  public static void entraMercancia(ArrayList<Articulo> art, int cod, int cant) {
    
    int ind = 0;
    for (Articulo n : art) {
      
      if(n.getCodigo() == cod) {
        
        ind = art.indexOf(n);
      }
    }
    art.get(ind).setCantidad(art.get(ind).getCantidad() + cant);
  }
  /**
   * Función que elimina cantidad a un articulo existente
   * @param art Lista de articulos
   * @param cod Codigo del articulo
   * @param cant Cantidad a eliminar
   */
  public static void ventaArticulo(ArrayList<Articulo> art) {
    
    mostrarArticulos(art);
    String fact = "";
    double precioFinal = 0;
    int cod = 0;
    do {
    System.out.println("===========================================\n" + fact + "===========================================\n");
    System.out.println("Introduce el codigo de los articulos que quieras comprar (introduce -1 para salir).");
    cod = Integer.parseInt(s.nextLine());
    if (cod != -1) {
      
      int ind = 0;
      for (Articulo n : art) { //Comprobamos la posición del articulo en lista para conseguir su posición
        
        if (n.getCodigo() == cod) { //Por algun motivo que desconozco no reconoce el codigo 1
          
          ind = art.indexOf(n);
        }
      }
      
      if (ind != 0) {
        int cant = 0;
        System.out.print("Que cantidad (Disponible: " + art.get(ind).getCantidad() + "): ");
        cant = Integer.parseInt(s.nextLine());
        while (cant > art.get(ind).getCantidad() && cant <= 0) {
          
          System.out.print("Cantidad no valida, intentalo de nuevo (Disponible: " + art.get(ind).getCantidad() + "):");
          cant = Integer.parseInt(s.nextLine());
        }
        art.get(ind).setCantidad(art.get(ind).getCantidad() - cant);
        fact += art.get(ind).getDescripcion() + "   " + cant + "   " + form.format(((art.get(ind).getPrecioVen()*1.21) * cant))+ "€\n";
       
        precioFinal += ((art.get(ind).getPrecioVen()*1.21) * cant);
        
      } else {
        
        System.out.println("Codigo de articulo no valido");
      }
    }
    } while (cod != -1);
    System.out.println("Factura final: ");
    fact += "Precio final:  " + form.format(precioFinal) +"\n"; 
    System.out.println("===========================================\n" + fact + "===========================================\n");
  } 
  public static void modArticulo(ArrayList<Articulo> art) {
    
    mostrarArticulos(art);
    System.out.print("Introduce el código del articulo que quieres modificar: ");
    int opt = Integer.parseInt(s.nextLine());
    int ind = 0;
    for (Articulo n : art) {
      
      if (n.getCodigo() == opt) {
        
        ind = art.indexOf(n);
      }
    }
    if (ind != 0) {
      System.out.println("1. Descripcion");
      System.out.println("2. Cantidad");
      System.out.println("3. Precio compra");
      System.out.println("4. Precio venta");
      System.out.println("5. Nada");
      System.out.print("Qué quieres modificar: ");
      opt = Integer.parseInt(s.nextLine());
      switch (opt) {
        
        case 1:
          System.out.print("Nueva descripción: ");
          art.get(ind).setDescripcion(s.nextLine());
          break;
        case 2:
          System.out.print("Nueva cantidad: ");
          art.get(ind).setCantidad(Integer.parseInt(s.nextLine()));
          break;
        case 3:
          System.out.print("Nuevo precio compra: ");
          art.get(ind).setPrecioCom(Double.parseDouble(s.nextLine()));
          break;
        case 4:
          System.out.print("Nuevo precio venta: ");
          art.get(ind).setPrecioVen(Double.parseDouble(s.nextLine()));
          break;
        default:
      }
   } else {
     
     System.out.println("Codigo no valido");
   }
  }
}
