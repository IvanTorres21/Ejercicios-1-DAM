
import java.util.Scanner;

/**
 * Programa que pide 10 números y luego cambia la posición de un número, rotando el resto una
 * posición superior.
 *
 * @author Iván Torres
 */
public class Ejercicio12 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Introduzca 10 números enteros. ");
    int[] num = new int[10];
    for (int i = 0; i < 10; i++) {

      System.out.print((i+1) + "º número: ");
      num[i] = Integer.parseInt(s.nextLine());
    }
    //Mostrar array original
    System.out.print("\nIndice: ");
    for (int i = 0; i < 10; i++) {

      System.out.print("    " + i);
    }
    System.out.print("\nValor:  ");
    for (int i = 0; i < 10; i++) {

      System.out.print("    " + num[i]);
    }
    //Pedir posicion a modificar.
    System.out.println("\nIntroduzca la posición que quiere de mover de sitio, y su nueva posición: ");
    int posIni = s.nextInt();
    int posFin = s.nextInt();
    while (posIni >= posFin || posIni < 0 || posFin > 9) {
      s.nextLine();
      System.out.println("Los datos son incorrectos, tienen que ser entre 0 y 9 y el primero más pequeño.");
      posIni = s.nextInt();
      posFin = s.nextInt();
    }
    
    //Modificar array
    int aux;
    int aux2;
    aux = num[posFin];
    num[posFin] = num[posIni];
    for (int i = posFin+1; i < 10; i++) {//Primera modificación
      
      aux2 = num[i];
      num[i] = aux;
      aux = aux2;
    }
    for (int i = 0; i <= posIni; i++) { //Segunda modificación
      
      aux2 = num[i];
      num[i] = aux;
      aux = aux2;
    }
    //Mostrar array modificado
    System.out.print("\nIndice: ");
    for (int i = 0; i < 10; i++) {

      System.out.printf("%5d", i);
    }
    System.out.print("\nValor:  ");
    for (int i = 0; i < 10; i++) {

      System.out.printf("%5d", num[i]);
    }
  }
}
