import java.util.Scanner;

/**
 * Programa que dice cuanto tiempo queda hasta el fin de semana.
 * @author Iván Torres
 */
public class Ejercicio22 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("¿Que día de la semana es? (Lunes-Viernes): ");
    String dia = s.nextLine();
    System.out.print("\nIntroduce la hora y los minutos (formato 24h) separadas por un espacio: ");
    int hora = s.nextInt();
    int minutos = s.nextInt();
    s.nextLine();
    dia = dia.toLowerCase();
    int numDia = 0;
    switch (dia) {
      
      case "lunes":
        numDia = 0;
        break;
      case "martes":
        numDia = 1;
        break;
      case "miercoles":
        numDia = 2;
        break;
      case "jueves":
        numDia = 3;
        break;
      case "viernes":
        numDia = 4;
        break;
    }
    int minutosTotales = (numDia * 24 * 60) + (hora * 60) + (minutos); 
    //Desde el lunes hasta el viernes a las 15 hay 8100 minutos
    int minutosRestantes = 8100 - minutosTotales; 
    System.out.print("\nQuedan " + minutosRestantes + " minutos");
  }
}
