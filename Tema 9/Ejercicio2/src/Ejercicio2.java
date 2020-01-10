
import java.util.Scanner;

public class Ejercicio2 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int opt;
    
    Bici bici = new Bici("000001");
    Bici bici2 = new Bici("000002");
    
    Coche coche1 = new Coche("42342BAJ", "Mercédes");
    Coche coche2 = new Coche("52352EGS", "Seat");
    do {
      
      System.out.println("\nVEHÍCULOS\n========");
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elige una opción (1-8): ");
      opt = Integer.parseInt(s.nextLine());
      switch (opt) {
      
        case 1: 
          mostrarBicis(bici, bici2);
          opt = Integer.parseInt(s.nextLine());
          System.out.print("¿Cuántos km?: ");
          double km = Double.parseDouble(s.nextLine());
          if (opt == 1) {
            
            bici.recorrerKm(km);
          } else if (opt == 2) {
            
            bici2.recorrerKm(km);
          } else {
            
            System.out.println("No existe esa bici!");
          }
          break;
        case 2:
          mostrarBicis(bici, bici2);
          opt = Integer.parseInt(s.nextLine());
          if (opt == 1) {
            
            bici.hacerCaballito();
          } else if (opt == 2) {
            
            bici2.hacerCaballito();
          } else {
            
            System.out.println("No existe esa bici!");
          }
          break;
        case 3:
          mostrarCoches(coche1, coche2);
          opt = Integer.parseInt(s.nextLine());
          System.out.print("¿Cuántos km?: ");
          double km2 = Double.parseDouble(s.nextLine());
          if (opt == 1) {
            
            coche1.recorrerKm(km2);
          } else if (opt == 2) {
            
            coche2.recorrerKm(km2);
          } else {
            
            System.out.println("No existe ese coche!");
          }
          break;
        case 4:
          mostrarCoches(coche1, coche2);
          opt = Integer.parseInt(s.nextLine());
          if (opt == 1) {
            
            coche1.quemarNeumaticos();
            
          } else if (opt == 2) {
            
            coche2.quemarNeumaticos();
          } else {
            
            System.out.println("No existe ese coche!");
          }
          break;
        case 5:
          mostrarBicis(bici, bici2);
          opt = Integer.parseInt(s.nextLine());
          if (opt == 1) {
            
            System.out.println("KM: " + bici.getKmRec());
          } else if (opt == 2) {
            
            System.out.println("KM: " + bici2.getKmRec());
          } else {
            
            System.out.println("No existe esa bici!");
          }
          break;
        case 6:
          mostrarCoches(coche1, coche2);
          opt = Integer.parseInt(s.nextLine());
          if (opt == 1) {
            
            System.out.println("KM: " + coche1.getKmRec());
          } else if (opt == 2) {
            
            System.out.println("KM: " + coche2.getKmRec());
          } else {
            
            System.out.println("No existe ese coche!");
          }
          break;
        case 7:
          System.out.println("Número de vehículos: " + Vehiculo.getNumVehi() + "\nKm: " + Vehiculo.getKmTot());
          break;
        case 8:
          break;
        default:
          
          System.out.println("Número no valido!");
        
      }
    } while (opt != 8);
  }
  
  public static void mostrarBicis(Bici bici, Bici bici2) {
    
    System.out.println("1. " + bici.getNumRef());
    System.out.println("2. " + bici2.getNumRef());
    System.out.print("Qué bicicleta? (1-2): ");
  }
  
  public static void mostrarCoches(Coche coche1, Coche coche2) {
    
    System.out.println("1. " + coche1.getMatr());
    System.out.println("2. " + coche2.getMatr());
    System.out.print("Qué coche? (1-2): ");
  }
}
