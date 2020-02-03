import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio21 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    HashMap<String, String> habitat = new HashMap<String, String>();
    HashMap<String, String> alimentacion = new HashMap<String, String>();
    habitat.put("rana", "En los trópicos y cerca de las zonas húmedas y acuáticas");
    alimentacion.put("rana", "Larvas e insectos");
    habitat.put("salamandra", "Ecosistemas húmedos");
    alimentacion.put("salamandra", "Pequeños crustaceos e insectos");
    habitat.put("sapo", "En cualquier sitio salvo el desierto y la Antartida");
    alimentacion.put("sapo", "Insectos, lombrices y pequeños roedores");
    habitat.put("triton", "America y Africa");
    alimentacion.put("triton", "Insectos");
    
    String opt = "";
    do {
      System.out.print("Introduzca el tipo de anfibio (salir para salir): ");
      opt = s.nextLine().toLowerCase();
      if(habitat.containsKey(opt)) {
        
        System.out.println("Habitat: " + habitat.get(opt));
        System.out.println("Alimentación: " + alimentacion.get(opt));
      } else if (!opt.equalsIgnoreCase("salir")){
        
        System.out.println("Ese tipo de anfibio no existe");
      }
      
    } while (!opt.equalsIgnoreCase("salir"));
  }
}
