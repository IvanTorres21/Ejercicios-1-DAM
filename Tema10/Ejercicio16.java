import java.util.HashMap;
import java.util.Scanner;
import com.sun.xml.internal.ws.util.StringUtils;

public class Ejercicio16 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    HashMap<String, String> dicCap = new HashMap<String, String>();
    dicCap.put("España", "Madrid");
    dicCap.put("Portugal", "Lisboa");
    dicCap.put("Francia", "Paris");
    String opt = "";
    do {
      
      System.out.print("Escribe el nombre de un país y te dire su capital: ");
      opt = StringUtils.capitalize(s.nextLine().toLowerCase());
      if(dicCap.containsKey(opt)) {
        
        System.out.println("La capital de " + opt + " es " + dicCap.get(opt));
      } else if (!opt.equalsIgnoreCase("salir")){
        
        System.out.print("No conozco esa capital, porfavor introduzcala: ");
        String cap = StringUtils.capitalize(s.nextLine().toLowerCase());
        dicCap.put(opt, cap);
      }
    }while(!opt.equalsIgnoreCase("salir"));
  }
}
