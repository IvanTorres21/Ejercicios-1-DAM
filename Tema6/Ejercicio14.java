
/**
 * Programa que intenta adivinar en que numero estaba pensando el usuario.
 * @author Iván Torres
 */
import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("\033[37mVoy a intentar adivinar en un número en el que estes pensando");
    System.out.println("\033[37mPiensa en un número entre 0 y 100. Solo tengo 5 intentos");
    boolean acertado = false;
    int max = 100;
    int min = 0;
    int num;
    int i;
    for (i = 0; i < 5 && !acertado; i++) {
      
      do {
        
        num = (int) (Math.random() * 101 + 0);
      } while (num < min || num > max);
      System.out.println("Es el \033[33m" + num + "\033[37m el número en el que estabas pensando? (S/N)");
      String opc = s.nextLine().toLowerCase();
      if (opc.equals("s")) {
        
        acertado = true;
      } else if (i != 4){
        
        System.out.println("Tú numero, ¿Es mayor o menor que el mío?");
        opc = s.nextLine().toLowerCase();
        if (opc.equals("mayor")) {
          
          min = num;
        } else {
          
          max = num;
        }
      }
    }
    if (acertado) {
      switch(i){
        case 1:
          
          System.out.print("\033[37mPonlo más difícil la próxima vez");
          break;
        case 2:
        case 3:
          
          System.out.print("\033[37mBastante fácil");
          break;
        case 4:
          
          System.out.print("\033[37mPensabas que no iba a conseguirlo?");
          break;
        case 5:
          
          System.out.print("\033[37mVaya... Eres duro, pero yo lo soy más");
          break;
        default:
          
          break;
      }
    } else {
      
      System.out.print("\033[37mVaya, que raro. Suelo acertar.");
    }
  }
}
