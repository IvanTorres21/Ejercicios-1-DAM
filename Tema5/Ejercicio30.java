import java.util.Scanner;

/**
 * Programa que dice las horas que han pasado desde la hora de un día a otro.
 * @author Iván Torres
 */
public class Ejercicio30 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa dice las horas que han pasado desde una hora a otra de otro día");
    int horaInicio = 0;
    int diaInicio = 0;
    int horaFinal = 0;
    int diaFinal = 0;
    do {
      System.out.print("Introduzca la primera hora (formato 24h) y el número del día: ");
      horaInicio = s.nextInt();
      diaInicio = s.nextInt();
      s.nextLine();
      System.out.print("Introduzca la segunda hora y día: ");
      horaFinal = s.nextInt();
      diaFinal = s.nextInt();
    } while (horaInicio < 0 || horaFinal < 0 || diaInicio < 1 || diaFinal < 1 || horaInicio > 24 || 
      horaFinal > 24 || diaInicio > 7 || diaFinal > 7 || diaFinal < diaInicio);
      
    int horasPasadas = (diaFinal - diaInicio) * 24;
    horasPasadas = horasPasadas - horaInicio + horaFinal;
    System.out.print("Han pasado: " + horasPasadas + " horas");
  }
}
