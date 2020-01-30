import java.util.ArrayList;

public class Ejercicio07 {
  public static void main(String[] args) throws InterruptedException{
    
    ArrayList<Moneda> monedas = new ArrayList<Moneda>();
    monedas.add(new Moneda());
    for (int i = 1; i < 6; i++) {
      
      Thread.sleep(500); // Si no le digo que se espere un poco lo hace tan rápido que todos son casi iguales
      monedas.add(new Moneda(monedas.get(i-1)));
    }
    for (Moneda m : monedas) {
      
      System.out.println(m);
    }
  }
}
