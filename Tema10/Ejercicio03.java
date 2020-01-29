import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    ArrayList<Integer> a = new ArrayList<Integer>();
    
    System.out.println("Programa que ordena 10 numeros.");
    for (int i = 0; i < 10; i++) {
      
      System.out.print("Introduzca el " + (i+1) + "º número: ");
      a.add(Integer.parseInt(s.nextLine()));
    }
    for (int i = 0; i < a.size() - 1; i++) {
      
      for (int j = 0; j < a.size()- 1; j++) {
        
        int aux = a.get(j+1);
        if (a.get(j) > aux) {
          
          a.set(j+1, a.get(j));
          a.set(j, aux);
        }
      }
    }
    for (int num : a) {
      
      System.out.print(" " + num);
    }
  }
}
