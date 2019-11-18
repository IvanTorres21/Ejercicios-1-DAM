import java.util.Scanner;
/**
 * Programa que consiste en encontrar un tesoro, en caso de estar cerca de una mina te avisará.
 * @author Iván Torres
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    char[][] map = new char[5][5];
    //Asignamos espacios vacios al array para que este alineado.
    for (int i = 0; i < 5; i++) {
      
      for (int j = 0; j < 5; j++) {
        
        map[i][j] = ' ';
      }
    }
    //Ponemos posición a la bomba y el tesoro
    int posTesX = (int) (Math.random()*5);
    int posTesY = (int) (Math.random()*5);
    int posBomX = (int) (Math.random()*5);
    int posBomY = (int) (Math.random()*5);
    int estado = 0; // 0 == jugando, 1 == ganado, -1 == perdido
    do {
    //Mostramos el mapa (Sin poner las posiciones del tesoro o la bomba)
    System.out.print(" ");
    for (int i = 0; i < 5; i++) {
      
      System.out.print((i+1) + " ");
    }
    System.out.println();
    for (int i = 0; i < 5; i++) {
      
      System.out.print((i+1));
      for (int j = 0; j < 5; j++) {
        
        System.out.print(map[i][j] + " ");
      }
      System.out.println();
    }
    //Pedimos datos y comprobamos ques sean validos
    System.out.print("Introduzca la posicion del mapa (x,y)");
    int opcX = s.nextInt();
    int opcY = s.nextInt();
    s.nextLine();
    while (!(opcX > 0 && opcX < 6) && !(opcY > 0 && opcY < 6)) { //En caso de que no sean numeros validos se vuelve a pedir
    
      System.out.print("Valores no validos, vuelva a intentarlo.");
      opcX = s.nextInt();
      opcY = s.nextInt();
      s.nextLine();
    }
    opcX--;
    opcY--;
    if (opcX == posTesX && opcY == posTesY) {
      
      map[opcY][opcX] = '€';
      map[posBomY][posBomX] = '*';
      estado = 1; //Ponemos estado en ganado
    } else if (opcX == posBomX && opcY == posBomY) {
      
      map[opcY][opcX] = '*';
      map[posTesY][posTesY] = '€';
      estado = -1; //Ponemos estado en perdido
    } else {
      
      map[opcY][opcX] = 'X';
      if ( (((opcY-1) == posBomY) || ((opcY+1) == posBomY) || (opcY == posBomY)) && 
              (((opcX-1) == posBomX) || ((opcX+1) == posBomX) || (opcX == posBomX))) {
        
        System.out.print("Cuidado! Estás cerca de una bomba!\n");
      }
    }
    } while (estado == 0);
    
    //Mostramos el mapa si ha perdido o ganado.
    System.out.print(" ");
    for (int i = 0; i < 5; i++) {
      
      System.out.print((i+1) + " ");
    }
    System.out.println();
    for (int i = 0; i < 5; i++) {
      
      System.out.print((i+1));
      for (int j = 0; j < 5; j++) {
        
        System.out.print(map[i][j] + " ");
      }
      System.out.println();
    }
    if (estado == 1) {
      
      System.out.print("\n\nHas Ganado!");
    } else {
      
      System.out.print("Has perdido...");
    }
  }
}
