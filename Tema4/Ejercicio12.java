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
    String siguiente = "";
    
    System.out.println("Este cuestionario tipo test tiene 10 preguntas, cada acierto es un punto");
    System.out.println("Para elegir la respuesta pon el número que tiene asociado a la izquierda");
    System.out.println("Empezemos con las preguntas:");
    //Pregunta 1
    System.out.println("¿Cuál de estas sentencias condicionales está bien escrita según Google?");
    System.out.print("  1.-if() {\n  2.-IF();\n  3.-if () {\n  4.-si () {\n");
    respuesta = Integer.parseInt(s.nextLine());
    
    if (respuesta == 3) {
      
      System.out.printf("\033[92m     ¡Respuesta Correcta! \033[37m\n\nPresiona enter...");
      puntuacion++;
      
    } else {
      
      System.out.printf("\033[31m     Respuesta Incorrecta... \033[37m \nLa correcta era la 3\n\nPresiona enter...");
    }
    siguiente = s.nextLine();
    System.out.print("\033\143");
    //Pregunta 2
    System.out.println("¿Cuál de los siguientes no es un lenguaje de programación interpretado?");
    System.out.print("  1.-PHP\n  2.-JavaScript\n  3.-Ruby\n  4.-C\n");
    respuesta = Integer.parseInt(s.nextLine());
    
    if (respuesta == 4) {
      
      System.out.printf("\033[92m     ¡Respuesta Correcta! \033[37m\n\nPresiona enter...");
      puntuacion++;
      
    } else {
      
      System.out.printf("\033[31m     Respuesta Incorrecta... \033[37m \nLa correcta era la 4\n\nPresiona enter...");
    }
    siguiente = s.nextLine();
    System.out.print("\033\143");
    //Pregunta 3
    System.out.println("¿Cuál es el ciclo general de vida del software\n");
    System.out.print("   1.- Anilisis - Codificación - Pruebas - Mantenimiento\n");
    System.out.print("   2.- Diseño - Codificicación - Analisis - Pruebas - Mantenimiento\n");
    System.out.print("   3.- Analisis - Diseño - Codificación - Pruebas - Mantenimiento\n");
    System.out.print("   4.- Diseño - Analisis - Codificación - Mantenimiento\n");
    respuesta = Integer.parseInt(s.nextLine());
    
    if (respuesta == 3) {
      
      System.out.printf("\033[92m     ¡Respuesta Correcta! \033[37m\n\nPresiona enter...");
      puntuacion++;
      
    } else {
      
      System.out.printf("\033[31m     Respuesta Incorrecta... \033[37m \nLa correcta era la 3\n\nPresiona enter...");
    }
    siguiente = s.nextLine();
    System.out.print("\033\143");
    //Pregunta 4
    System.out.println("Completa el código HTML/CSS: <p ______ \"color: aquamarine\">");
    System.out.print("  1.-style=\n  2.-Style:\n  3.-style:\n  4.-Style=\n");
    respuesta = Integer.parseInt(s.nextLine());
    
    if (respuesta == 1) {
      
      System.out.printf("\033[92m     ¡Respuesta Correcta! \033[37m\n\nPresiona enter...");
      puntuacion++;
      
    } else {
      
      System.out.printf("\033[31m     Respuesta Incorrecta... \033[37m \nLa correcta era la 1\n\nPresiona enter...");
    }
    siguiente = s.nextLine();
    System.out.print("\033\143");
    //Pregunta 5
    System.out.println("¿Cuál de los siguientes no es hardware:");
    System.out.print("  1.-SO\n  2.-SAI\n  3.-SSD\n  4.-CD\n");
    respuesta = Integer.parseInt(s.nextLine());
    
    if (respuesta == 1) {
      
      System.out.printf("\033[92m     ¡Respuesta Correcta! \033[37m\n\nPresiona enter...");
      puntuacion++;
      
    } else {
      
      System.out.printf("\033[31m     Respuesta Incorrecta... \033[37m \nLa correcta era la 1\n\nPresiona enter...");
    }
    siguiente = s.nextLine();
    System.out.print("\033\143");
    //Pregunta 6
    System.out.println("Cual de las siguientes opciones pone el encabezado más grande en HTML:");
    System.out.print("  1.-<p>\n  2.-<h7>\n  3.-<h1>\n  4.-<p style=\"BIG\"\n");
    respuesta = Integer.parseInt(s.nextLine());
    
    if (respuesta == 3) {
      
      System.out.printf("\033[92m     ¡Respuesta Correcta! \033[37m\n\nPresiona enter...");
      puntuacion++;
      
    } else {
      
      System.out.printf("\033[31m     Respuesta Incorrecta... \033[37m \nLa correcta era la 3\n\nPresiona enter...");
    }
    siguiente = s.nextLine();
    System.out.print("\033\143");
    //Pregunta 7
    System.out.printf("Cuáles es el orden de los pasos para crear una base de datos");
    System.out.print("   1.- Diseño conceptual - Diseño avanzado - Diseño físico\n");
    System.out.print("   2.- Diseño lógico - Diseño conceptual - Diseño físico\n");
    System.out.print("   3.- Diseño Conceptual - Diseño Lógico - Codificación\n");
    System.out.print("   4.- Diseño Conceptual - Diseño Lógico - Díseño físico\n");
    respuesta = Integer.parseInt(s.nextLine());
    
    if (respuesta == 4) {
      
      System.out.printf("\033[92m     ¡Respuesta Correcta! \033[37m\n\nPresiona enter...");
      puntuacion++;
      
    } else {
      
      System.out.printf("\033[31m     Respuesta Incorrecta... \033[37m \nLa correcta era la 4\n\nPresiona enter...");
    }
    siguiente = s.nextLine();
    System.out.print("\033\143");
    //Pregunta 8
    System.out.println("¿Qué es la regla de integridad de la entidad?");
    System.out.print("   1.-Una clave primaria no puede repetirse\n");
    System.out.print("   2.-Una clave foranea no puede tener un valor nulo\n");
    System.out.print("   3.-Una clave foranea no puede no tener concordancia\n");
    System.out.print("   4.-Una clave primaria no puede ser nula\n");
    respuesta = Integer.parseInt(s.nextLine());
    
    if (respuesta == 4) {
      
      System.out.printf("\033[92m     ¡Respuesta Correcta! \033[37m\n\nPresiona enter...");
      puntuacion++;
      
    } else {
      
      System.out.printf("\033[31m     Respuesta Incorrecta... \033[37m \nLa correcta era la 4\n\nPresiona enter...");
    }
    siguiente = s.nextLine();
    System.out.print("\033\143");
    //Pregunta 9
    System.out.println("¿Qué es la regla de integridad referencial?");
    System.out.print("   1.-Una clave primaria no puede repetirse\n");
    System.out.print("   2.-Una clave foranea no puede tener un valor nulo\n");
    System.out.print("   3.-Una clave foranea no puede no tener concordancia\n");
    System.out.print("   4.-Una clave primaria no puede ser nula\n");
    respuesta = Integer.parseInt(s.nextLine());
    
    if (respuesta == 3) {
      
      System.out.printf("\033[92m     ¡Respuesta Correcta! \033[37m\n\nPresiona enter...");
      puntuacion++;
      
    } else {
      
      System.out.printf("\033[31m     Respuesta Incorrecta... \033[37m \nLa correcta era la 3\n\nPresiona enter...");
    }
    siguiente = s.nextLine();
    System.out.print("\033\143");
    //Pregunta 10
    System.out.println("¿Cuál de los siguientes tiene que compararse de manera distinta en un if()?");
    System.out.print("   1.-String\n");
    System.out.print("   2.-int\n");
    System.out.print("   3.-boolean\n");
    System.out.print("   4.-long\n");
    respuesta = Integer.parseInt(s.nextLine());
    
    if (respuesta == 1) {
      
      System.out.printf("\033[92m     ¡Respuesta Correcta! \033[37m\n\nPresiona enter...");
      puntuacion++;
      
    } else {
      
      System.out.printf("\033[31m     Respuesta Incorrecta... \033[37m \nLa correcta era la 1\n\nPresiona enter...");
    }
    siguiente = s.nextLine();
    System.out.print("\033\143");
    System.out.println("Has conseguido... " + puntuacion + "puntos");
    if(puntuacion == 10) {
      
      System.out.print("¡Increible, puntuación perfecta!\n");
      
    } else if (puntuacion <= 9 && puntuacion >= 7){
      
      System.out.print("Buena puntuación, pero puedes conseguir más\n");
      
    } else if (puntuacion == 6 || puntuacion == 5) {
      
      System.out.print("Deberías esforzarte un poco más...\n");
      
    } else {
      
      System.out.print("Vaya... esto es... bueno, al menos lo has intentando\n");
    }
    
  }
}
