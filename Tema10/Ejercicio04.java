import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04 {
  public static void main(String[] args) {
    
    ArrayList<String> list = new ArrayList<String>();
    Scanner s = new Scanner(System.in);
    System.out.println("Programa que ordena palabras en orden alfabético");
    int i = 1;
    do{
      
      System.out.print("Introduzca la " + i + "ª palabra (pon 1 para terminar): ");
      list.add(s.nextLine());
      i++;
    } while (!list.contains("1"));
    list.remove(list.size() - 1);
    // Ordenamos la lista
    
    for (int j = 0; j < list.size() - 1; j++) {
      for (int k = 0; k < list.size() - 1; k++) {
        
        String aux = list.get(k+1);
        String aux2 = list.get(k);
        boolean cambiado = false;
        int cont = 0;
        do {
          if (aux2.charAt(cont) > aux.charAt(cont)) {
          
            list.set(k+1, list.get(k));
            list.set(k, aux);
            cambiado = true;
          } else if (aux2.charAt(cont) == aux.charAt(cont)){
            
            cont++;
          } else {
            
            cambiado = true;
          }
        } while (!cambiado && (aux.length() > cont || aux2.length() > cont));
      }
    }
    
    // Mostramos la lista
    
    for (String n : list) {
      
      System.out.print(n + " ");
    }
  }
}
