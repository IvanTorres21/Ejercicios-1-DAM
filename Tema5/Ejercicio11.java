import java.util.Scanner;

/**
 * Progrmaa que muestra el cuadro y el cubo de los cinco primeros numeros desde un
 * número introducido por teclado.
 * @author Iván Torres
 */
public class Ejercicio11 {
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(s.nextLine());
    for (int i = 0; i < 5; i++) {
      
      System.out.printf("| %d | %d | %d |\n", num, num * num, num * num * num);
      num++;
    }
  }
}
