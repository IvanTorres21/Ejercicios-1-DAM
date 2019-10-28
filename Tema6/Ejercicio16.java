
/**
 * Simulador de máquina tragaperras simplificada.
 * Las figuras son: corazón, diamante, herradura, campana y limón.
 *
 * @author Iván Torres
 */
import java.util.Scanner;

public class Ejercicio16 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int fig;
    int fig2;
    int fig3;
    int cantIg = 0;
    int monedasAct = 3;
    String opc;
    do {
      System.out.println("Monedas actuales: " + monedasAct);
      System.out.print("¿Quiere insertar una moneda? (Si/No): ");
      opc = s.nextLine().toLowerCase();
      System.out.println();
      if (opc.equals("si") || opc.equals("sí")) {
        monedasAct--;

        fig = (int) (Math.random() * 5 + 1);
        fig2 = (int) (Math.random() * 5 + 1);
        fig3 = (int) (Math.random() * 5 + 1);

        switch (fig) {

          case 1:
            System.out.print("♥"); //corazón
            break;
          case 2:
            System.out.print("♦"); //diamante
            break;
          case 3:
            System.out.print("♝"); //campana
            break;
          case 4:
            System.out.print("☋"); //heradura
            break;
          case 5:
            System.out.print("⚈"); //limón
            break;
        }
        switch (fig2) {

          case 1:
            System.out.print("♥"); //corazón
            break;
          case 2:
            System.out.print("♦"); //diamante
            break;
          case 3:
            System.out.print("♝"); //campana
            break;
          case 4:
            System.out.print("☋"); //heradura
            break;
          case 5:
            System.out.print("⚈"); //limón
            break;
        }
        switch (fig3) {

          case 1:
            System.out.print("♥"); //corazón
            break;
          case 2:
            System.out.print("♦"); //diamante
            break;
          case 3:
            System.out.print("♝"); //campana
            break;
          case 4:
            System.out.print("☋"); //heradura
            break;
          case 5:
            System.out.print("⚈"); //limón
            break;
        }
        
        if (fig == fig2 && fig == fig3) {
          
          cantIg = 2;
        } else if (fig == fig2 || fig2 == fig3 || fig == fig3) {
          
          cantIg = 1;
        } else {
          
          cantIg = 0;
        }
        switch (cantIg) {

          case 0:
            System.out.println("\nLo siento, ha perdido.");
            break;
          case 1:
            System.out.println("\nHa recuperado su moneda!");
            monedasAct++;
            break;
          case 2:
            System.out.println("\nHa ganado diez monedas!");
            monedasAct += 10;
        }
      }

    } while (monedasAct > 0 && (opc.equals("sí") || opc.equals("si")));
  }
}
