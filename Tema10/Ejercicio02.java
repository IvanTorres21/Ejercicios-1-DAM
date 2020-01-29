import java.util.ArrayList;

public class Ejercicio02 {
  public static void main(String[] args) {
    
    ArrayList<Integer> a = new ArrayList<Integer>();
    int cant = (int) (Math.random() * 11) + 10;
    for (int i = 0; i < cant; i++) {
      
      a.add((int) (Math.random() * 101));
    }
    double media = 0;
    int max = -1;
    int min = 101;
    for (int num : a) {
      
      media += num;
      if (num > max) {
        
        max = num;
      }
      if (num < min) {
        
        min = num;
      }
    }
    System.out.println("Máximo: " + max);
    System.out.println("Mínimo: " + min);
    System.out.println("Media: " + media / a.size());
  }
}
