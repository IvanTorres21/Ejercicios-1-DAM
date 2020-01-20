import java.util.Scanner;

public class Ejercicio7 {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int opt = 0;
    Zona prin = new Zona(1000);
    Zona com = new Zona(200);
    Zona vip = new Zona(25);
    do {
      
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      System.out.println("¿Qué quieres hacer?: ");
      opt = Integer.parseInt(s.nextLine());
      switch(opt) {
        
        case 1:
          
          System.out.println("Entradas libres: ");
          System.out.println("Principal:" + prin);
          System.out.println("Compra-venta:" + com);
          System.out.println("VIP:" + vip);
          break;
        case 2:
          System.out.println("1. Principal");
          System.out.println("2. Compra-venta");
          System.out.println("3. VIP");
          System.out.println("Que zona?");
          int zon = Integer.parseInt(s.nextLine());
          System.out.println("Cuantas entradas?");
          int n = Integer.parseInt(s.nextLine());
          switch(zon) {
            
            case 1:
              
              prin.vender(n);
              break;
            case 2:
              
              com.vender(n);
              break;
            case 3:
              vip.vender(n);
              break;
            default:
              
              System.out.println("Esa zona no existe!");
          }
          default:
      }
    } while(opt != 3);
  }
}
