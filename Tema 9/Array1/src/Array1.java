import java.util.Scanner;

public class Array1 {
  public static void main(String[] args) {
    
    Gato[] gato = new Gato[4];
    Scanner s = new Scanner(System.in);
    
    for (int i = 0; i < 4; i++) {
      
      System.out.print("Como se llama el gato: ");
      String nom = s.nextLine();
      System.out.print("Cuantos años tiene: ");
      int edad = Integer.parseInt(s.nextLine());
      gato[i] = new Gato(nom, edad);
    }
    
    //Los mostramos
    
    for (int i = 0; i < 4; i++) {
      
      System.out.println(gato[i]);
    }
  }
}
