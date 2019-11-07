
/**
 * Programa que muestra los valores de un array de char.
 * @author Iván Torres
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    
    char[] simbolo = new char[10];
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    
    for (char s : simbolo) {
      
      System.out.println("El caracter es: " + s);
      // Por defecto los rellena con ' '.
    }
  }
}
