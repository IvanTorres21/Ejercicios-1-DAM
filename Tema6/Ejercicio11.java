
/**
 * Programa que muestra 20 notas aleatorias como suspenso, suficiente, ...
 * Al final muestra la cantida de cada uno.
 * @author Iván Torres
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    
    int cantSus = 0;
    int cantSuf = 0;
    int cantBien = 0;
    int cantNot = 0;
    int cantSob = 0;
    
    for (int i = 0; i < 20; i++) {
      
      double num = (Math.random() * 11);
      if (num < 5) {
        
        System.out.printf("Nota %d: suspenso\n", i);
        cantSus++;
      } else if (num >= 5 && num < 6) {
        
        System.out.printf("Nota %d: suficiente\n", i);
        cantSuf++;
      } else if (num >= 6 && num < 7) {
        
        System.out.printf("Nota %d: bien\n", i);
        cantBien++;
      } else if (num >= 7 && num < 9) {
        
        System.out.printf("Nota %d: notable\n", i);
        cantNot++;
      } else if (num >= 9) {
        
        System.out.printf("Nota %d: sobresaliente\n", i);
        cantSob++;
      }
    }
    System.out.println("Número suspensos: " + cantSus);
    System.out.println("Número suficientes: " + cantSuf);
    System.out.println("Número bienes: " + cantBien);
    System.out.println("Número notables: " + cantNot);
    System.out.println("Número sobresalientes: " + cantSob);
  }
}
