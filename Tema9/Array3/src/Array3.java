import java.util.Scanner;

public class Array3 {
  
  public static Scanner s = new Scanner(System.in);
  
  public static void main(String[] args) {
      
    Discos[] discos = new Discos[20];
    discos[0] = new Discos(1, "Margaritas de la noche", "Juan paco", 430);
    discos[1] = new Discos(2, "Plomodon", "Megan Caras", 530);
    int opt = 0;
    do {
      
      System.out.println("Bienvenido a la coleccion de discos.");
      System.out.println("1.Ver discos\n2.Añadir disco\nBorrar discos\n4.Salir");
      opt = Integer.parseInt(s.nextLine());
      switch (opt) {
        
        case 1: //Mostrar discos
          mostrarDiscos(discos);
          break;
        case 2: //Añadir disco
          if (Discos.numDisc < 20) {
            
            addDisco(discos);
          } else {
            
            System.out.println("Ya no se pueden añadir más discos!");
          }
          break;
        case 3: //Borrar disco
          if (Discos.numDisc != 0) {
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
  public static void mostrarDiscos(Discos[] discos) {
    
    for (int i = 0; i < Discos.numDisc; i++) {
      
      System.out.println("\n" + i + ".\n" + discos[i] + "\n\n");
    }
  }
  /**
   * Funcion que añade un disco a un array de discos
   * @param discos Array de discos
   */
  public static void addDisco(Discos[] discos) {
    
    System.out.print("Titulo: ");
    String nom = s.nextLine();
    System.out.print("Autor: ");
    String aut = s.nextLine();
    System.out.print("Duracion (segundos): ");
    int dur = Integer.parseInt(s.nextLine());
    System.out.print("Codigo (1, 2, 3, ...) (no se puede repetir)");
    int cod;
    boolean repetido = false;
    do {
      repetido = false;
      cod = Integer.parseInt(s.nextLine());
      for (int i = 0; i < Discos.numDisc && !repetido; i++) {
        
        if (cod == discos[i].getCodigo()) {
          
          repetido = true;
          System.out.print("Codigo no valido! Vuelve a intentarlo: ");
        }
      }
    } while (repetido);
    discos[Discos.numDisc] = new Discos(cod, nom, aut, dur);
    System.out.println("Disco creado!");
  }
  /**
   * Funcion que elimina discos y reorganiza el array
   * @param disc Array de discos
   */
  public static void delDisco(Discos[] disc) {
    
    mostrarDiscos(disc);
    System.out.print("Cual quieres borrar (introduce el numero): ");
    int opt = Integer.parseInt(s.nextLine());
    if (opt <= Discos.numDisc && opt >= 0) {
        for (int i = opt; i < Discos.numDisc; i++) {
        
          disc[i] = disc[i+1];
        }
        Discos.numDisc--;
      }
    }
}
