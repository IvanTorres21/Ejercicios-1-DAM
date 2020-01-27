import java.util.Scanner;

public class Array2 {
  public static void main(String[] args) {
    
    Gato[] gato = new Gato[10];
    String[] nombres = {"pepe", "paco", "zacaria", "macaba", "Zercan", "pogi", "hector", "Porqui", "Margarnio", "Mer"};
    Scanner s = new Scanner(System.in);
    
    for (int i = 0; i < 10; i++) {
      int edad = (int) (Math.random() * 20) + 1;
      gato[i] =  new Gato(nombres[i], edad);
    }
    
    //Los mostramos
    
    for (int i = 0; i < 10; i++) {
      
      System.out.println(gato[i]);
    }
  }
}