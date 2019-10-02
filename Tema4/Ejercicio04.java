import java.util.Scanner;

/**
 * Programa que calcula el sueldo semanal de un trabajador a 12€ la hora ordinaria y a 
 * 16€ la hora extraordinaria.
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca el número de horas trabajado: ");
    int horasTrabajadas = s.nextInt();
    int horasExtra = 0;
    if (horasTrabajadas > 40) {
      
      horasExtra = horasTrabajadas - 40;
      horasTrabajadas = 40;
      
    }
    int sueldoTotal = (horasTrabajadas * 12) + (horasExtra * 16);
    System.out.printf("\nEl sueldo semanal es: %d", sueldoTotal);
  }
}

