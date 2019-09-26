import java.util.Scanner;

/*
 * Programa que calcula el volumen de un cono con la fórmula V = 1/3*pi*r²*h
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el radio y la altura (en cm) separadas por un espacio: ");
    double radio = s.nextDouble();
    double altura = s.nextDouble();
    double volumenCono = (3.14 * (radio * radio) * altura) / 3;
    System.out.printf("\nEl volumen del cono es: %f", volumenCono);
  }
}

