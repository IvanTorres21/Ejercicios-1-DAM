import java.util.Scanner;

/**
 * Programa que muestra, cuenta y suma los multiplos de 3 desde n a m
 * @author Iván Torres
 */
public class Ejercicio27 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    System.out.print("Este programa muestra, cuenta y suma multiplos de 3 entre dos números\n");
    System.out.print("Introduzca dos números enteros: ");
    int num1 = s.nextInt();
    int num2 = s.nextInt();
    s.nextLine();
    if (num1 > num2) {
      
      int aux = num2;
      num2 = num1;
      num1 = aux;
    }
    int contMultTres = 0;
    int sumaMultTres = 0;
    for (;num1 <= num2; num1++) {
      
      if (num1 % 3 == 0) {
        System.out.print("\nMultiplo encontrado: " + num1);
        contMultTres++;
        sumaMultTres += num1;
      }
    }
    System.out.println("\nEn total hay: " + contMultTres);
    System.out.println("Y su suma es: " + sumaMultTres);
  }
}
