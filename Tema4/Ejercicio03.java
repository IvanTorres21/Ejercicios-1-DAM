import java.util.Scanner;

/**
 * Programa que dice el día de la semana en base a un número.
 * @author Iván Torres
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    
   Scanner s = new Scanner(System.in);
   
   System.out.print("Introduzca el día de la semana: ");
   int diaSemana = s.nextInt();
   String nombreDia;
   switch(diaSemana) {
     
      case 1:
        nombreDia = "Lunes";
        break;
        
      case 2:
        nombreDia = "Martes";
        break;
        
      case 3:
        nombreDia = "Miércoles";
        break;
        
      case 4:
        nombreDia = "Jueves";
        break;
        
      case 5:
        nombreDia = "Viernes";
        break;
        
      case 6:
        nombreDia = "Sábado";
        break;
        
      case 7:
        nombreDia = "Domingo";
        break;
      
      default:
        nombreDia = "";
        break;
      }
    if(diaSemana <= 0 || diaSemana > 7) {
      
      System.out.printf("\nERROR: %d no corresponde a ningún día de la semana", diaSemana);
      
    } else {
      System.out.printf("\nEL día de la semana %d es el: %s", diaSemana, nombreDia);
    }
  }
}
     
