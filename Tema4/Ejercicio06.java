import java.util.Scanner;

/**
 * Programa que calcula el tiempo que tardará en caer un objeto.
 * @author Iván Torres
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura desde la que cae el objeto en metros: ");
    double altura = s.nextDouble();
    double interiorRaiz = (2 * altura) / 9.18;
    if (interiorRaiz < 0) {
      
      System.out.printf("\nEl resultado de la raiz es imaginario, por lo que no tiene solución");
      
    } else {
      
      double resultadoFinal = Math.pow(interiorRaiz, -2);
      System.out.printf("\nTardará en caer: %.2f segundos", resultadoFinal);
      
    }
  }
}
