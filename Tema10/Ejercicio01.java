import java.util.ArrayList;

public class Ejercicio01 {
  public static void main(String[] args) {
    
    ArrayList<String> a = new ArrayList<String>();
    a.add("Paco");
    a.add("Zacarias");
    a.add("Mendoza"); 
    for (String nom : a) {
      
      System.out.println(nom);
    }
  }
}
