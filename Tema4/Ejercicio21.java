import java.util.Scanner;

/**
 * Programa que calcula la media de un alumno de programacion
 * @author Iván Torres.
 */
public class Ejercicio21 {
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce tus notas de los examenes de programación separadas por un espacio: \n");
    double nota1 = s.nextDouble();
    double nota2 = s.nextDouble();
    s.nextLine();
    double media = (nota1 + nota2) / 2;
    if (media < 5) {
      
      System.out.print("\n¿Que ha sido el resultado de la recuperación?(apto/no apto): ");
      String resultadoRecup = s.nextLine();
      if (resultadoRecup.equals("apto")) {
        
        System.out.print("\nTu nota del trimestre es 5");
      } else {
        
        System.out.printf("\nTu nota del trimestre es %.2f", media);
      }
    } else {
      
      System.out.printf("\nTu nota del trimestre es %.2f", media);
    }
  }
}
