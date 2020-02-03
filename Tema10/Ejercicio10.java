import java.util.Scanner;
import java.util.HashMap;

public class Ejercicio10 {
  public static void main(String[] args) {
    
    HashMap<String, String> dic = new HashMap<String, String>();
    Scanner s = new Scanner(System.in);
    dic.put("coche", "car");
    dic.put("casa", "house");
    dic.put("tren", "tren");
    dic.put("ordenador", "computer");
    dic.put("telefono", "phone");
    dic.put("hogar","home");
    dic.put("saltar", "jump");
    dic.put("coche", "car");
    dic.put("codigo", "code");
    dic.put("red", "net"); // 10
    dic.put("objeto", "object");
    dic.put("cosa", "thing");
    dic.put("mapa", "map");
    dic.put("pez", "fish");
    dic.put("teclado", "keyboard");
    dic.put("raton", "mouse");
    dic.put("rata", "rat");
    dic.put("ciudad", "city");
    dic.put("liga", "league");
    dic.put("fecha", "date"); // 20
    String opt = "";
    do {
      
      System.out.println("Introduce la palabra en español que quieras traducir(-1 para salir): ");
      opt = s.nextLine().toLowerCase();
      if(dic.containsKey(opt)) {
        
        System.out.println("La traducción de " + opt + " es: " + dic.get(opt));
      } else if (!opt.equals("-1")){
        
        System.out.println("Esa palabra no se encuentra en el diccionario.");
      }
    }while(!opt.equalsIgnoreCase("-1"));
  }
}
