import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio11 {
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
    int i = 0;
    int aciertos = 0;
    String[] keys = new String[dic.size()]; //Hay que convertir las key a un array para sacar un valor aleatorio
    int j = 0;
    for (Map.Entry palabra : dic.entrySet() ) {
      
      keys[j] = (String) palabra.getKey();
      j++;
    }
    int[] randNum = new int[5];
    do {
      
      boolean repetido;
      do { //Nos aseguramos de que no se repita la palabra
        
        repetido = false;
        randNum[i] = (int) (Math.random() * dic.size());
        for (int k = 0; k < i; k++) {
          
          if (randNum[i] == randNum[k]) {
            
            repetido = true;
          }
        }
      } while(repetido);
      String actKey = keys[randNum[i]];
      System.out.print("Introduzca la traducción al ingles de " + actKey + ": ");
      String opt = s.nextLine().toLowerCase();
      for (Map.Entry palabra : dic.entrySet()) {
        
        if (palabra.getKey().equals(actKey) && palabra.getValue().equals(opt)) {
          
          aciertos++;
        }
      }
      i++;
    }while (i < 5);
    System.out.println("Has conseguido " + aciertos + "/5 aciertos");
  }
}
