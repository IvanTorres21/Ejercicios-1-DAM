import java.util.Scanner;
/**
 * Tres en raya
 * @author Iván Torres
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    char[][] tab = new char[3][3];
    int[] posUsed = new int[9]; //Para guardar las posiciones que ya han sido usadas.
    
    //Introducimos números del 1 al 9 para mostrar el tablero y sus coordenadas
    int num = 1;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        
        tab[i][j] = (char)(48+num);
        num++;
      }
    }
    //Iniciamos el bucle del juego
    boolean fin = false;
    int turno = 0;
    do {
      
      //Mostramos la tabla
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          
          System.out.printf("|%s", tab[i][j]);
        }
        System.out.println("|");
      }
      System.out.print("Turno del jugador " + ((int) turno%2+1)+ ": ");
      boolean puesto = false;
      int pos;
      do { //Comprobamos si la posición ya ha sido usada
        
        puesto = false;
        pos = Integer.parseInt(s.nextLine());
        for (int i = 0; i <= turno && !puesto; i++) {
          
          if (posUsed[i] == pos) {
            
            puesto = true;
          }
        }
        if (!puesto) {
          
          posUsed[turno] = pos;
          
        } else {
          
          System.out.print("Posición ya usada! Pon otra: ");
        }
      } while (puesto);
      if (turno == 0) { //En caso de que sea el primer turno se elimina la guía númerica
        
        for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
            
            tab[i][j] = ' ';
          }
        }
      }
      //Ponemos la Cruz o Círculo dependiendo del turno actual
      if (turno % 2 != 0) {
        
        switch (pos) {
          
          case 1:
            
            tab[0][0] = 'X';
            break;
          case 2:
            
            tab[0][1] = 'X';
            break;
          case 3:
            
            tab[0][2] = 'X';
            break;
          case 4:
            
            tab[1][0] = 'X';
            break;
          case 5:
            
            tab[1][1] = 'X';
            break;
          case 6:
            
            tab[1][2] = 'X';
            break;
          case 7:
            
            tab[2][0] = 'X';
            break;
          case 8:
            
            tab[2][1] = 'X';
            break;
          case 9:
            
            tab[2][2] = 'X';
            break;
        }
      } else {
        
        switch (pos) {
          
          case 1:
            
            tab[0][0] = 'O';
            break;
          case 2:
            
            tab[0][1] = 'O';
            break;
          case 3:
            
            tab[0][2] = 'O';
            break;
          case 4:
            
            tab[1][0] = 'O';
            break;
          case 5:
            
            tab[1][1] = 'O';
            break;
          case 6:
            
            tab[1][2] = 'O';
            break;
          case 7:
            
            tab[2][0] = 'O';
            break;
          case 8:
            
            tab[2][1] = 'O';
            break;
          case 9:
            
            tab[2][2] = 'O';
            break;
        }
      }
      //Comprobamos si hay victoria 
      if ((tab[0][0] == 'X' && tab[0][1] == 'X' && tab[0][2] == 'X') || 
              (tab[1][0] == 'X' && tab[1][1] == 'X' && tab[1][2] == 'X') ||
              (tab[2][0] == 'X' && tab[2][1] == 'X' && tab[2][2] == 'X') ||
              (tab[0][0] == 'X' && tab[1][0] == 'X' && tab[2][0] == 'X') ||
              (tab[0][1] == 'X' && tab[1][1] == 'X' && tab[2][1] == 'X') ||
              (tab[0][2] == 'X' && tab[1][2] == 'X' && tab[2][2] == 'X') ||
              (tab[0][0] == 'X' && tab[1][1] == 'X' && tab[2][2] == 'X') ||
              (tab[0][2] == 'X' && tab[1][1] == 'X' && tab[2][0] == 'X')) {
        fin = true;
        System.out.print("\n\033[92m GANA JUGADOR 1");
      } else if ((tab[0][0] == 'O' && tab[0][1] == 'O' && tab[0][2] == 'O') || 
              (tab[1][0] == 'O' && tab[1][1] == 'O' && tab[1][2] == 'O') ||
              (tab[2][0] == 'O' && tab[2][1] == 'O' && tab[2][2] == 'O') ||
              (tab[0][0] == 'O' && tab[1][0] == 'O' && tab[2][0] == 'O') ||
              (tab[0][1] == 'O' && tab[1][1] == 'O' && tab[2][1] == 'O') ||
              (tab[0][2] == 'O' && tab[1][2] == 'O' && tab[2][2] == 'O') ||
              (tab[0][0] == 'O' && tab[1][1] == 'O' && tab[2][2] == 'O') ||
              (tab[0][2] == 'O' && tab[1][1] == 'O' && tab[2][0] == 'O')) {
        fin = true;
        System.out.println("\n\033[92m GANA JUGADOR 2");
      }
      turno++;
    } while(!fin && turno != 9);
  }
}
