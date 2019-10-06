import java.util.Scanner;

/**
 * Programa que calcula el precio de un desayuno
 * @author Iván Torres
 */
public class Ejercicio29 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    System.out.print("¿Que ha tomado para comer? (palmera, donut o pitufo): ");
    String comida = (s.nextLine()).toLowerCase();
    if (comida.equals("pitufo")) {
      
      System.out.print("¿De aceite o tortilla? ");
      comida = (s.nextLine()).toLowerCase();
    }
    System.out.print("¿Qué ha tomado de beber? (zumo o cafe): ");
    String bebida = (s.nextLine()).toLowerCase();
    
    double precio = 0;
    switch (comida) {
      
      case "palmera":
      
        precio = 1.4;
        break;
      case "donut":
      case "dónut":
        
        precio = 1;
        break;
      case "aceite":
        
        precio = 1.2;
        comida = "pitufo aceite";
        break;
      case "tortilla":
        
        precio = 1.6;
        comida = "pitufo tortilla";
        break;
    }
    
    double precioBebida = 0;
    switch (bebida) {
      
      case "zumo":
        
        precioBebida = 1.5;
        break;
      case "cafe":
      case "café":
      
        precioBebida = 1.2;
        break;
    }
    
    System.out.printf("\n%s: %.2f €", comida, precio);
    System.out.printf("\n%s: %.2f €", bebida, precioBebida);
    System.out.printf("\nTotal: %.2f €", precio + precioBebida);
  }
}
