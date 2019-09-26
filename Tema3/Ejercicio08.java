import java.util.Scanner;

/*
 * Calcular el salario semanal de un empleado que cobra 12€ la hora.
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca las horas que ha trabajado esta semana: ");
    int horasTrabajadas = s.nextInt();
    double salarioSemanal = horasTrabajadas * 12; //Cobra 12 euros la hora 
    System.out.printf("\nEl salario de esta semana es: %.2f", salarioSemanal);
  }
}
