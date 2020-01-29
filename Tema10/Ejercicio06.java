import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio06 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    HashMap<String, String> usuarios = new HashMap<String, String>();
    usuarios.put("administrador", "SwordFish");
    boolean usuarioEncontrado = false;
    int oportunidades = 3;
    do {
      
      System.out.print("Nombre de usuario: ");
      String nom = s.nextLine();
      if(usuarios.containsKey(nom)) {
        
        do {
          
          System.out.print("Contraseña: ");
          String pswd = s.nextLine();
          if(usuarios.get(nom).equalsIgnoreCase(pswd)) {
          
            System.out.println("Acceso garantizado");
            usuarioEncontrado = true;
          } else {
          
            System.out.println("Acceso denegado");
            oportunidades--;
          }
        } while (oportunidades > 0 && !usuarioEncontrado);
      } else {
        
        System.out.println("Este usuario no existe, vuelva a intentarlo");
      }
    } while (!usuarioEncontrado && oportunidades > 0);
    if (oportunidades == 0) {
      
      System.out.println("Se han acabado los intentos, acceso bloqueado");
    }
  }
}
