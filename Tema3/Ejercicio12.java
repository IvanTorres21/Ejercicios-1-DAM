import java.util.Scanner;

/*
 * Programa que calcula que nota necesitas sacar en el segundo examen de la asignatura 
 * programación en base a la primera nota y la nota que quieres en el trimestre.
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la nota del primer examen de programación: ");
    double primerExamen = Double.parseDouble(s.nextLine());
    System.out.print("\nIntroduzca la nota que quieres sacar en el trimestre: ");
    double notaDeseada = Double.parseDouble(s.nextLine());
    double notaNecesaria = (notaDeseada - primerExamen * 0.4) / 0.6;
    System.out.printf("\nPara sacar un %.2f necesitas sacar un %.2f", notaDeseada, notaNecesaria);
  }
}

