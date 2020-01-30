import java.util.ArrayList;

public class Ejercicio08 {
  public static void main(String[] args) {
    
    ArrayList<Carta> list = new ArrayList<Carta>();
    int num = (int) (Math.random() * 10) +1;
    int palo = (int) (Math.random() * 4) +1;
    list.add(new Carta(num, palo));
    
    for(int i = 0; i < 10; i++) {
      
      boolean repetido;
      do {
        
        repetido = false;
        num = (int) (Math.random() * 10) +1;
        palo = (int) (Math.random() * 4) +1;
        for (int j = 0; j < list.size(); j++) {
          
          if (list.get(j).getNum() == num && list.get(j).getPalo() == palo) {
            
            repetido = true;
          }
        }
      } while(repetido);
      list.add(new Carta(num, palo));
    }
    
    for (Carta c : list) {
      
      System.out.println(c);
    }
  }
}
