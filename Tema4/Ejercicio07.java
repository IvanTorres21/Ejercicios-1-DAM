import java.util.Scanner;

/**
 * Programa que calcula la media de tres notas.
 * @author Iván Torres
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    
   Scanner s = new Scanner(System.in);
   
   System.out.print("Introduzca las tres notas separadas por un espacio: ");
   double Nota1 = s.nextDouble();
   double Nota2 = s.nextDouble();
   double Nota3 = s.nextDouble();
   if(Nota1 < 0 || Nota2 < 0 || Nota3 < 0 || Nota1 > 10 || Nota2 > 10 || Nota3 > 10) {
      
      System.out.printf("\nLas notas tienen que estar entre 0 y 10");  
          
    } else {
      
      System.out.printf("\nTu media es: %.2f", (Nota1 + Nota2 + Nota3)/3); 
      
    } 
  }
}
