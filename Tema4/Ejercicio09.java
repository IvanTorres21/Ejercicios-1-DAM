import java.util.Scanner;

/**
* Programa que resuelve una ecuación de segundo grado
* @author Iván Torres
*/
public class Ejercicio09 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo: ax²+bx+c");
    System.out.print("Introduzca el valor de a, b y c separados por un espacio: ");
    double a = s.nextDouble();
    double b = s.nextDouble();
    double c = s.nextDouble();
    double interiorRaiz = Math.pow(b,2) + (-4 * a * c);
    if (interiorRaiz < 0) {
      
      System.out.printf("\nEsta ecuación no tiene solucion real");
      
    } else {
      
      double resultado1 = (-b + interiorRaiz) / (2 * a);
      double resultado2 = (-b - interiorRaiz) / (2 * a);
      if (resultado1 == resultado2) {
        
        System.out.printf("\nTiene resultado único: %.2f", resultado1);
        
      } else {
        
        System.out.printf("\nLos resultados son: %.2f y %.2f", resultado1, resultado2);
      
      }
    }
  }
}
    
