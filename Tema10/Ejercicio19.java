import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio19 {
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
        }
      } else if (!opt.equalsIgnoreCase("salir")){
        
        System.out.println("No conozco esa palabra");
      }
    } while (!opt.equalsIgnoreCase("salir"));
  }
}
