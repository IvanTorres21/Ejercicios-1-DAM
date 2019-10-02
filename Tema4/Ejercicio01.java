import java.util.Scanner;

/**
 * Programa que pide el número de la semana y dice que asignatura hay a primera.
 * @author Iván Torres
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    
   Scanner s = new Scanner(System.in);
   
   System.out.print("Introduzca el NUMERO del día de la semana: ");
   int diaSemana = s.nextInt();
   String asignatura;
   switch(diaSemana) {
     
      case 1:
        asignatura = "Programación";
        break;
        
      case 2:
        asignatura = "Entornos de Desarrollo";
        break;
        
      case 3:
        asignatura = "Programación";
        break;
        
      case 4:
        asignatura = "Programación";
        break;
        
      case 5:
        asignatura = "Sistemas informáticos";
        break;
        
      default:
        asignatura = "Ese número no está asociado a ningún día laboral";
        break;
      }
    if(diaSemana <= 0 || diaSemana >= 6) {
      
      System.out.printf("\n%s", asignatura);
    } else {
      
      System.out.printf("\nEl día %s tienes: %s", diaSemana, asignatura);
    }
  }
}
