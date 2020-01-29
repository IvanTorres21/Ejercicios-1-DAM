import java.util.Scanner;

public class Array5 {
  
  public static Scanner s = new Scanner(System.in);
  
  public static void main(String[] args) {
    
    final int N = 50;
    int opt = 0;
    int cant = 0;
    Articulo[] art = new Articulo[N];
    art[0] = new Articulo("Atún", 20, 2.4, 3.4);
    art[1] = new Articulo("Rosada", 50, 4.1, 6.3);
    art[2] = new Articulo("Merluza", 20, 4.1, 6.3);
    
    do {
      
      System.out.println("=====================================");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificacion");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Salida de mercancía");
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
          modArticulo(art, opt);
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
          mostrarArticulos(art);
          System.out.print("Que articulo a salido: ");
          opt = Integer.parseInt(s.nextLine());
          while (opt <= 0 || opt > Articulo.codAct) {
            
            System.out.println("Valor no valido, vuelva a intentarlo: ");
            opt = Integer.parseInt(s.nextLine());
          }
          System.out.println("Cuantos van a salir");
          cant = Integer.parseInt(s.nextLine());
          while (cant <= 0 || cant > art[opt-1].getCantidad()) {
            
            System.out.println("Valor no valido, vuelve a intentarlo");
            cant = Integer.parseInt(s.nextLine());
          }
          saleMercancia(art, opt, cant);
          break;
        case 7:
          break;
        default:
          System.out.println("Opción no valida!");
      }
      
    } while (opt != 7);
  }
  
  /**
   * Función que muestra todos los elementos de un array de articulos
   * @param art El array de articulos que se va a mostrar
   */
  public static void mostrarArticulos(Articulo[] art) {
    
    if (Articulo.codAct > 0) {
      
      for (int i = 0; i < Articulo.codAct - 1; i++) {
        
        System.out.println(art[i]);
      }
    } else {
      
      System.out.println("No hay ningún articulo");
    }
  }
  /**
   * Función que elimina un articulo de un array y los reordena
   * @param art Array de articulos del que se va a eliminar
   * @param cod Posición en el array del articulo a eliminar (empezando desde 1)
   */
  public static void eliminarArticulo(Articulo[] art, int cod) {
    
    cod--; // Reajustamos el valor de cod para moverse por el array
    for (int i = cod;i < Articulo.codAct - 2; i++) { // Reordenamos el array
      
      art[i] = art[i+1];
      art[i].setCodigo(i + 1);
    } 
    art[Articulo.codAct] = null;
    Articulo.codAct--;
  }
  /**
   * Función que añade un articulo a un array
   * @param art Array de articulos
   */
  public static void incluirArticulo(Articulo[] art) {
    
    System.out.println("\nQue articulo es: ");
    String des = s.nextLine();
    System.out.println("Cuantos hay: ");
    int can = Integer.parseInt(s.nextLine());
    System.out.println("Precio de compra: ");
    double precCom = Double.parseDouble(s.nextLine());
    System.out.println("Precio de venta: ");
    double precVen = Double.parseDouble(s.nextLine());
    art[Articulo.codAct - 1] = new Articulo(des, can, precCom, precVen);
  }
  /**
   * Función que añade más cantidad a un articulo existente
   * @param art Array de articulos
   * @param cod Codigo del articulo
   * @param cant Cantidad a añadir
   */
  public static void entraMercancia(Articulo[] art, int cod, int cant) {
    
    cod--;
    art[cod].setCantidad(art[cod].getCantidad() + cant);
  }
  /**
   * Función que elimina cantidad a un articulo existente
   * @param art Array de articulos
   * @param cod Codigo del articulo
   * @param cant Cantidad a eliminar
   */
  public static void saleMercancia(Articulo[] art, int cod, int cant) {
    
    cod--;
    art[cod].setCantidad(art[cod].getCantidad() - cant);
  } 
  public static void modArticulo(Articulo[] art, int cod) {
    
    cod--;
    System.out.println("1. Descripcion");
    System.out.println("2. Cantidad");
    System.out.println("3. Precio compra");
    System.out.println("4. Precio venta");
    System.out.println("5. Nada");
    System.out.print("Qué quieres modificar: ");
    int opt = Integer.parseInt(s.nextLine());
    switch (opt) {
      
      case 1:
        System.out.print("Nueva descripción: ");
        art[cod].setDescripcion(s.nextLine());
        break;
      case 2:
        System.out.print("Nueva cantidad: ");
        art[cod].setCantidad(Integer.parseInt(s.nextLine()));
        break;
      case 3:
        System.out.print("Nuevo precio compra: ");
        art[cod].setPrecioCom(Double.parseDouble(s.nextLine()));
        break;
      case 4:
        System.out.print("Nuevo precio venta: ");
        art[cod].setPrecioVen(Double.parseDouble(s.nextLine()));
        break;
      default:
    }
  }
}
