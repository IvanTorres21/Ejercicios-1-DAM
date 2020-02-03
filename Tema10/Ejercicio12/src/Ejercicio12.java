import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class Ejercicio12 {
  public static void main(String[] args) {
    
    HashMap<Integer, Integer> dicVal = new HashMap<Integer, Integer>();
    dicVal.put(1, 11);
    dicVal.put(3, 10);
    dicVal.put(8, 2);
    dicVal.put(9, 3);
    dicVal.put(10, 4);
    ArrayList<Carta> cartas = new ArrayList<Carta>();
    while (cartas.size() != 5) {
      
      int num = (int) (Math.random() * 10) +1;
      int palo = (int) (Math.random() * 4) +1;
      Carta aux = new Carta(num, palo);
      cartas.removeIf(carta -> carta.equals(aux));
      cartas.add(aux);
    }
    int puntos = 0;
    for (Carta carta : cartas) {
    
        for (Map.Entry valor : dicVal.entrySet()) {
        
            if (carta.getNum() == (int) valor.getKey()) {
                
                puntos += (int) valor.getValue();
            }
        }
    }
    for (Carta carta : cartas) {
        
        System.out.println(carta);
    }
    System.out.println("Has conseguido " + puntos + " puntos");
  }
}
