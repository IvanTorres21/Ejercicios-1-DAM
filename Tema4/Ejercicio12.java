import java.util.Scanner;

/**
 * Programa que hace un mini cuestionario de diez preguntas tipo test
 * @author Iván Torres
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int respuesta;
    int puntuacion  = 0;
    
    System.out.println("Este cuestionario tipo test tiene 10 preguntas, cada acierto es un punto");
    System.out.println("Empezemos con las preguntas:");
    System.out.println("¿Cuál de estas sentencias condicionales está bien escrita según Google?");
    System.out.print("  1.-if() {\n  2.-IF();\n  3.-if () {\n  4.-si () {\n");
    respuesta = Integer.parseInt(s.nextLine());
    
    if (respuesta == 3) {
      
      System.out.printf("\033[92m     ¡Respuesta Correcta! \033[37m");
      puntuacion++;
      
    } else {
      
      System.out.printf("\033[31m     Respuesta Incorrecta... \033[37m \nLa correcta era la 3\n");
    }
    
    System.out.printf("
  }
}
