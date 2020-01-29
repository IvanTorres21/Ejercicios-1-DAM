import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio05 {
  
  public static Scanner s = new Scanner(System.in);
  
  
  public static void main(String[] args) {
      
    ArrayList<Discos> discos = new ArrayList<Discos>();
    discos.add(new Discos(1, "Margaritas de la noche", "Juan paco", 430));
    discos.add(new Discos(2, "Plomodon", "Megan Caras", 530));
    int opt = 0;
    do {
      
      System.out.println("Bienvenido a la coleccion de discos.");
      System.out.println("1.Ver discos\n2.Añadir disco\n3.Borrar discos\n4.Salir");
      opt = Integer.parseInt(s.nextLine());
      switch (opt) {
        
        case 1: //Mostrar discos
          mostrarDiscos(discos);
          break;
        case 2: //Añadir disco
            
            addDisco(discos);
          break;
        case 3: //Borrar disco
          if (discos.size() != 0) {
            delDisco(discos);
          } else {
            
            System.out.println("No hay discos que borrar!");
          }
          break;
        case 4: //Salir
          break; 
         default:
      }
    } while (opt != 4);
  }
  
  /**
   * Funcion que muestra todos los discos de un array
   * @param discos El array de discos
   */
  public static void mostrarDiscos(ArrayList<Discos> discos) {
    
    for (int i = 0; i < discos.size() ; i++) {
      
      System.out.println(discos.get(i));
    }
  }
  /**
   * Funcion que añade un disco a un array de discos
   * @param discos Array de discos
   */
  public static void addDisco(ArrayList<Discos> discos) {
    
    System.out.print("Titulo: ");
    String nom = s.nextLine();
    System.out.print("Autor: ");
    String aut = s.nextLine();
    System.out.print("Duracion (minutos): ");
    int dur = Integer.parseInt(s.nextLine());
    System.out.print("Codigo (1, 2, 3, ...) (no se puede repetir)");
    int cod;
    boolean repetido = false;
    do {
      repetido = false;
      cod = Integer.parseInt(s.nextLine());
      for (int i = 0; i < discos.size() && !repetido; i++) {
        
        if (cod == discos.get(i).getCodigo()) {
          
          repetido = true;
          System.out.print("Codigo no valido! Vuelve a intentarlo: ");
        }
      }
    } while (repetido);
    discos.add(new Discos(cod, nom, aut, dur));
    System.out.println("Disco creado!");
  }
  /**
   * Funcion que elimina discos y reorganiza el array
   * @param disc Array de discos
   */
  public static void delDisco(ArrayList<Discos> discos) {
    
    mostrarDiscos(discos);
    System.out.print("Cual quieres borrar (introduce el codigo): ");
    int opt = Integer.parseInt(s.nextLine());
    boolean eliminado = false;
    for (int i = 0; i < discos.size() && !eliminado; i++) {
      
      if (discos.get(i).getCodigo() == opt) {
        
        discos.remove(i);
        eliminado = true;
      }
    }
    if (!eliminado) {
      
      System.out.println("No se ha encontrado el disco");
    }
  }
}
