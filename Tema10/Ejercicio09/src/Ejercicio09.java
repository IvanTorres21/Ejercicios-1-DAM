import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio09 {
  public static void main(String[] args) {
    
    ArrayList<Carta> list = new ArrayList<Carta>();
    int num = (int) (Math.random() * 10) +1;
    int palo = (int) (Math.random() * 4) +1;
    list.add(new Carta(num, palo));
    while (list.size() != 10) {
      
      num = (int) (Math.random() * 10) +1;
      palo = (int) (Math.random() * 4) +1;
      Carta aux = new Carta(num, palo);
      list.removeIf(carta -> carta.equals(aux));
      list.add(aux);
    }
    Collections.sort(list);
    for (Carta c : list) {
      
      System.out.println(c);
    }
  }
}
