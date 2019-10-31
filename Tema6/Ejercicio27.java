import java.util.Scanner;
/**
 * Juego de priedra papel y tijeras contra el ordenador
 * @author Iván Torres
 */
public class Ejercicio27 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    String opcion;
    do {
      System.out.print("Turno del jugador (introduzca piedra, papel o tijeras): ");
      opcion = s.nextLine().toLowerCase();
      if (!(opcion.equals("piedra")) && !(opcion.equals("papel")) && !(opcion.equals("tijeras"))) {
        
        System.out.println("Dato incorrecto.");
      }
    } while (!(opcion.equals("piedra")) && !(opcion.equals("papel")) && !(opcion.equals("tijeras")));
    
    int opcPC = (int) (Math.random() * 3);
    String opcionPC;
    switch (opcPC) {
      
      case 0:
        
        opcionPC = "papel";
        break;
      case 1:
        
        opcionPC = "piedra";
        break;
      case 2:
        
        opcionPC = "tijeras";
        break;
      default:
        opcionPC = "error";
    }
    System.out.println("Turno ordenador: " + opcionPC);
    if (opcion.equals(opcionPC)) {
      
      System.out.println("empate");
    } else if ((opcion.equals("piedra") && opcionPC.equals("tijeras")) || (opcion.equals("papel") &&
                opcionPC.equals("piedra")) || (opcion.equals("tijeras") && opcionPC.equals("papel"))) {
      
      System.out.println("Gana jugador");
    } else {
      
      System.out.println("Gana ordenador");
    }
  }
}
