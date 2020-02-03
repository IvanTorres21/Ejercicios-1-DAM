import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    HashMap<String, String> dic = new HashMap<String, String>();
    dic.put("caliente", "hot");
    dic.put("rojo", "red");
    dic.put("ardiente", "hot");
    dic.put("verde", "green");
    dic.put("agujetas", "stiff");
    dic.put("abrasador", "hot");
    dic.put("hierro", "iron");
    dic.put("grande", "big");
    String opt = "";
    do {
      
      System.out.print("Introduzca una palabra y le daré los sinónimos: ");
      opt = s.nextLine().toLowerCase();
      if (dic.containsKey(opt)) {
        String res = "";
        for (Map.Entry palabra : dic.entrySet()) {
          
          if(dic.get(opt).equalsIgnoreCase((String) palabra.getValue()) && !palabra.getKey().equals(opt)) {
            
            res += palabra.getKey() + ", ";
          }
        }
        if (!res.equalsIgnoreCase("")) {
          
          System.out.println("Sinonimos de " + opt + ": " + res);
        } else {
          
          System.out.println("No conozco sinónimos de esa palabra");
          System.out.print("¿Quieres añadir un sinónimo? (Y/N): ");
          char dec = (s.nextLine().toLowerCase()).charAt(0);
          if (dec == 'y') {
            
            System.out.print("Introduzca el sinónimo: ");
            String sin = s.nextLine().toLowerCase();
            dic.put(sin, dic.get(opt));
          }
        }
      } else if (!opt.equalsIgnoreCase("salir")){
        
        System.out.println("No conozco esa palabra");
        System.out.print("¿Quieres añadir la palabra? (Y/N): ");
        char dec = (s.nextLine().toLowerCase()).charAt(0);
        if (dec == 'y') {
          
          System.out.print("Introduzca la traduccion: ");
          String sin = s.nextLine().toLowerCase();
          dic.put(opt, sin);
        }
      }
    } while (!opt.equalsIgnoreCase("salir"));
  }
}
