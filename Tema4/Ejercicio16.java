import java.util.Scanner;

/**
 * Test de fidelidad, cada verdadero son 3 puntos.
 * @author Iván Torres
 */
 
public class Ejercicio16 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int puntos = 0;
    String respuesta;
    
    System.out.print("A continuación vas a responder a diez preguntas sobre tu pareja");
    System.out.println("(Responde con si o no):");
    System.out.print("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente: ");
    respuesta = s.nextLine();
    if (respuesta.equals("si") || respuesta.equals("SI") || respuesta.equals("sí") ||
    respuesta.equals("Sí") || respuesta.equals("SÍ")) {
       
       puntos = puntos + 3;
       
    }
    System.out.print("\nHa aumentado sus gastos de vestuario: ");
    respuesta = s.nextLine();
    if (respuesta.equals("si") || respuesta.equals("SI") || respuesta.equals("sí") ||
        respuesta.equals("Sí") || respuesta.equals("SÍ")) {
       
       puntos = puntos + 3;
       
    }
    System.out.print("\nHa perdido el interés que mostraba anteriormente por ti: ");
    respuesta = s.nextLine();
    if (respuesta.equals("si") || respuesta.equals("SI") || respuesta.equals("sí") ||
        respuesta.equals("Sí") || respuesta.equals("SÍ")) {
       
       puntos = puntos + 3;
       
    }
    System.out.print("\nAhora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer): ");
    respuesta = s.nextLine();
    if (respuesta.equals("si") || respuesta.equals("SI") || respuesta.equals("sí") ||
        respuesta.equals("Sí") || respuesta.equals("SÍ")) {
       
       puntos = puntos + 3;
       
    }
    System.out.print("\nNo te deja que mires la agenda de su teléfono móvil ");
    respuesta = s.nextLine();
    if (respuesta.equals("si") || respuesta.equals("SI") || respuesta.equals("sí") ||
        respuesta.equals("Sí") || respuesta.equals("SÍ")) {
       
       puntos = puntos + 3;
       
    }
    System.out.print("\nA veces tiene llamadas que dice no querer contestar cuando estás tú delante ");
    respuesta = s.nextLine();
    if (respuesta.equals("si") || respuesta.equals("SI") || respuesta.equals("sí") ||
        respuesta.equals("Sí") || respuesta.equals("SÍ")) {
       
       puntos = puntos + 3;
       
    }
    System.out.print("\nÚltimamente se preocupa más en cuidar la línea y/o estar bronceado/a ");
    respuesta = s.nextLine();
    if (respuesta.equals("si") || respuesta.equals("SI") || respuesta.equals("sí") ||
        respuesta.equals("Sí") || respuesta.equals("SÍ")) {
       
       puntos = puntos + 3;
       
    }
    System.out.print("\nMuchos días viene tarde después de trabajar porque dice tener mucho más trabajo ");
    respuesta = s.nextLine();
    if (respuesta.equals("si") || respuesta.equals("SI") || respuesta.equals("sí") ||
        respuesta.equals("Sí") || respuesta.equals("SÍ")) {
       
       puntos = puntos + 3;
       
    }
    System.out.print("\nHas notado que últimamente se perfuma más ");
    respuesta = s.nextLine();
    if (respuesta.equals("si") || respuesta.equals("SI") || respuesta.equals("sí") ||
        respuesta.equals("Sí") || respuesta.equals("SÍ")) {
       
       puntos = puntos + 3;
       
    }
    System.out.print("\nSe confunde y te dice que ha estado en sitios donde no ha ido contigo ");
    respuesta = s.nextLine();
    if (respuesta.equals("si") || respuesta.equals("SI") || respuesta.equals("sí") ||
        respuesta.equals("Sí") || respuesta.equals("SÍ")) {
       
       puntos = puntos + 3;
       
    }
    
    System.out.print("\033\143");
    
    if (puntos <= 10) {
      
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
      
    } else if (puntos <= 22) {
      
      System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
      
    } else {
      
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
      
    }
  }
}
