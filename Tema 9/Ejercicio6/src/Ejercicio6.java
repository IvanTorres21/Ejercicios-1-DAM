import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    Tiempo tim = new Tiempo(3, 20, 10);
    int hora;
    int min;
    int sec;
    int opt;
    do {
      System.out.println("Tiempo actual: " + tim);
      System.out.println("1 - Añadir tiempo");
      System.out.println("2 - Quitar tiempo");
      System.out.println("3 - Salir");
      opt = Integer.parseInt(s.nextLine());
      switch (opt) {
        
        case 1:
          
          System.out.println("Introduce los datos separados por espacios (num num num).");
          System.out.println("Datos: ");
          hora = s.nextInt();
          min = s.nextInt();
          sec = s.nextInt();
          s.nextLine();
          tim.sum(hora, min, sec);
          break;
        case 2:
          
          System.out.println("Introduce los datos separados por espacios (num num num).");
          System.out.println("Datos: ");
          hora = s.nextInt();
          min = s.nextInt();
          sec = s.nextInt();
          s.nextLine();
          tim.res(hora, min, sec);
        default:
      }
    } while (opt != 3);
  }
}
