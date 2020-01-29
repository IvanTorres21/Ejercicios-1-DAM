import java.util.ArrayList;

public class Ejercicio07 {
  public static void main(String[] args) {
    
    ArrayList<Moneda> monedas = new ArrayList<Moneda>();
    monedas.add(new Moneda());
    for (int i = 1; i < 6; i++) {
      
      monedas.add(new Moneda(monedas.get(i-1)));
    }
    for (Moneda m : monedas) {
      
      System.out.println(m);
    }
  }
}
