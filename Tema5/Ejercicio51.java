
/**
 * Programa que elimina los 0 y 8 de un número introducido por teclado.
 *
 * @author Iván Torres
 */
import java.util.Scanner;

public class Ejercicio51 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número mayor que 0: ");
    long num = Long.parseLong(s.nextLine());

    int cantDig = 0;
    int potencia = 1;
    boolean finContarDig = false;
    do {

      if (num / (long) Math.pow(10, potencia) == 0) {

        finContarDig = true;
      } else {
        cantDig++;
      }
      potencia++;
    } while (!finContarDig);
    long nuevoNum = 0;
    long aux = 0;
    int digAct = 0;
    boolean gusanoComido = false;
    potencia = 1; //Reutilizamos la variable para no declarar una nueva.
    do {

       aux = num / (long) Math.pow(10, potencia);
       aux = num - (aux * (long) Math.pow(10, potencia));
       aux = aux - nuevoNum;
       aux = aux / (long) Math.pow(10, potencia - 1);
       if (aux != 0 && aux != 8) {
      
         nuevoNum += (aux * (long) Math.pow(10, digAct));
         digAct++;
        
       } else {
          gusanoComido = true;
       }
       potencia++;
    } while (potencia <= cantDig+1);
    
    if (gusanoComido) {
      
      System.out.print("\nEl gusano ha comido, el número es: " + nuevoNum + "\n");
    } else {
      
      System.out.print("\nEl gusano no ha comido...\n");
    }
  }
}
