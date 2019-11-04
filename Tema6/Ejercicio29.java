import java.util.Scanner;
/**
 * Programa que muestra la temperatura de mañana en malaga en base a la estación actual.
 * @author Iván Torres
 */
public class Ejercicio29 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("1.Verano\n2.Primavera\n3.Invierno\n4.Otoño");
    System.out.print("\nQue estación es (1-4): ");
    int estacion = Integer.parseInt(s.nextLine());
    
    int temperaturaMax = 0;
    int temperaturaMin = 0;
    String tiempo = "";
    switch (estacion) {
      
      case 1:
        
        temperaturaMax = (int) (Math.random() * 20 + 25);
        temperaturaMin = (int)(Math.random() * (temperaturaMax - 25) + 25);
        if (Math.random() <= 0.8) {
          
          tiempo = "soleado";
        } else {
          
          tiempo = "nublado";
        }
        break;
      case 2:
        
        temperaturaMax = (int) (Math.random() * 15 + 15);
        temperaturaMin = (int) (Math.random() * (temperaturaMax - 15) + 15);
        if (Math.random() <= 0.6) {
          
          tiempo = "soleado";
        } else {
          
          tiempo = "nublado";
        }
        break;
      case 3:
        
        temperaturaMax = (int) (Math.random() * 26);
        temperaturaMin = (int) (Math.random() * (temperaturaMax));
        if (Math.random() <= 0.2) {
          
          tiempo = "soleado";
        } else {
          
          tiempo = "nublado";
        }
        break;
      case 4:
        
        temperaturaMax = (int) (Math.random() * 10 + 20);
        temperaturaMin = (int) (Math.random() * (temperaturaMax - 20) + 20);
        if (Math.random() <= 0.4) {
          
          tiempo = "soleado";
        } else {
          
          tiempo = "nublado";
        }
        break;
       
      default:
    }
    System.out.printf("Temperatura máxima: %4d\n", temperaturaMax);
    System.out.printf("Temperatura mínima: %4d\n", temperaturaMin);
    System.out.println("Tiempo: " + tiempo);
  }
}
