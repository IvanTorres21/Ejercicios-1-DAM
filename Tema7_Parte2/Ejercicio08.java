import java.util.Scanner;
/**
 * Programa que pide la posicón del alfiler y luego muestra a cuales puede colocarse.
 * @author Iván Torres
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    //Mostramos una guia visual para el usuario
    System.out.print(" ");
    for (int j = 0; j < 8; j++) {
        
      char let = (char) (97 + j);
      System.out.print(" " + let);
    }
    System.out.println();
    for (int i = 1; i <= 8; i++) {
      
      System.out.println(i);
    }
    
    //Pedimos la posición del alfil.
    String input;
    System.out.print("Introduzca del posición del alfil (EJ: b3): ");
    input = s.nextLine();
    int posX = input.charAt(0) - 97;
    int posY = Character.getNumericValue(input.charAt(1)) -1;
    //Rellenamos el array de espacios en blanco para imprimir el array correctamente
    char[][] tablero = new char[8][8];
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        
        tablero[i][j] = ' ';
      }
    }

    tablero[posY][posX] = '♝'; //Colocamos el alfil
    //Comprobamos las posiciones en las que puede ser colocado
    //Diagonal superior izquierda
    int posActX = posX;
    int posActY = posY;
    System.out.print("Posiciones: ");
    while(posActX >= 0 && posActY >= 0) {
      
      
      posActX--;
      posActY--;
      if (posActX >= 0 && posActY >= 0) {
        
        tablero[posActY][posActX] = 'X';
        char let = (char) (97 + posActX);
        System.out.print(" " + let + (posActY+1));
      }
    }
    //Diagonal superior derecha
    posActX = posX;
    posActY = posY;
    while(posActX < 8 && posActY >= 0) {
      
      
      posActX++;
      posActY--;
      if (posActX < 8 && posActY >= 0) {
        
        tablero[posActY][posActX] = 'X';
        char let = (char) (97 + posActX);
        System.out.print(" " + let + (posActY+1));
      }
    }
    //Diagonal inferior izquierda
    posActX = posX;
    posActY = posY;
    while(posActX >= 0 && posActY < 8) {
      
      
      posActX--;
      posActY++;
      if (posActX >= 0 && posActY < 8) {
        
        tablero[posActY][posActX] = 'X';
        char let = (char) (97 + posActX);
        System.out.print(" " + let + (posActY+1));
      }
    }
    //Diagonal inferior derecha
    posActX = posX;
    posActY = posY;
    while(posActX > 8 && posActY > 8) {
      
      
      posActX++;
      posActY++;
      if (posActX > 8 && posActY > 8) {
        
        tablero[posActY][posActX] = 'X';
        char let = (char) (97 + posActX);
        System.out.print(" " + let + (posActY+1));
      }
    }
    //Imprimimos el tablero 
    System.out.println();
    System.out.print(" ");
    for (int j = 0; j < 8; j++) { //Las letras por separado
        
      char let = (char) (97 + j);
      System.out.print(" " + let);
    }
    System.out.println();
    for (int i = 0; i < 8; i++) {
      
      System.out.print((i+1));
      for (int j = 0; j < 8; j++) {
        
        System.out.print(" " + tablero[i][j]);
      }
      System.out.println();
    }
  }
}
