import java.util.Scanner;

public class Array4 {
  
  public static Scanner s = new Scanner(System.in);
  
  public static void main(String[] args) {
      
    Discos[] discos = new Discos[20];
    discos[0] = new Discos(1, "Margaritas de la noche", "Juan paco", 430, "Rock");
    discos[1] = new Discos(2, "Plomodon", "Megan Caras", 530, "Country");
    int opt = 0;
    do {
      
      System.out.println("Bienvenido a la coleccion de discos.");
      System.out.println("1.Ver discos\n2.Añadir disco\n3.Borrar discos\n4.Salir");
      opt = Integer.parseInt(s.nextLine());
      switch (opt) {
        
        case 1: //Mostrar discos
          System.out.println("1.Todos\n2.Por Genero\n3.Por autor\n4.Por duracion");
          System.out.print("Cuales?");
          int opcion = Integer.parseInt(s.nextLine());
          switch(opcion) {
            
            case 1:
              mostrarDiscos(discos, 1);
              break;
            case 2:
              mostrarDiscos(discos, 2);
              break;
            case 3:
              mostrarDiscos(discos, 3);
              break;
            case 4:
              mostrarDiscos(discos, 4);
              break;
            default:
              System.out.println("Opcion no valida");
          }
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
  public static void mostrarDiscos(Discos[] discos, int opt) {
    
    switch (opt) {
      
      case 1:
        for (int i = 0; i < Discos.numDisc; i++) {
          
          System.out.println("\n" + i + ".\n" + discos[i] + "\n\n");
        }
        break;
      case 2:
        System.out.println("Que genero (rock, pop, ...): ");
        String gen = s.nextLine();
        gen = gen.toLowerCase();
        for (int i = 0; i < Discos.numDisc; i++) {
          
          if (discos[i].getGenero().toLowerCase().equals(gen)) {
            
            System.out.println("\n" + i + ".\n" + discos[i] + "\n\n");
          }
        }
        break;
      case 3:
        System.out.println("Que autor: ");
        String aut = s.nextLine();
        aut = aut.toLowerCase();
        for (int i = 0; i < Discos.numDisc; i++) {
          
          if (discos[i].getAutor().toLowerCase().equals(aut)) {
            
            System.out.println("\n" + i + ".\n" + discos[i] + "\n\n");
          }
        }
        break;
      case 4:
        System.out.println("De que tiempo a que tiempo (Ej: 100 300): ");
        int dur = s.nextInt();
        int dur2 = s.nextInt();
        s.nextLine();
        for (int i = 0; i < Discos.numDisc; i++) {
          
          if (discos[i].getDuracion() >= dur && discos[i].getDuracion() <= dur2) {
            
            System.out.println("\n" + i + ".\n" + discos[i] + "\n\n");
          }
        }
        break;
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
    System.out.print("Genero: ");
    String gen = s.nextLine();
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
    discos[Discos.numDisc] = new Discos(cod, nom, aut, dur, gen);
    System.out.println("Disco creado!");
  }
  /**
   * Funcion que elimina discos y reorganiza el array
   * @param disc Array de discos
   */
  public static void delDisco(Discos[] disc) {
    
    mostrarDiscos(disc, 1);
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
