import java.util.Scanner;

/**
 * Programa que calcula la media de tres notas.
 * @author Iván Torres
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
   
    System.out.print("Introduzca las tres notas separadas por un espacio: ");
    double Nota1 = s.nextDouble();
    double Nota2 = s.nextDouble();
    double Nota3 = s.nextDouble();
    if(Nota1 < 0 || Nota2 < 0 || Nota3 < 0 || Nota1 > 10 || Nota2 > 10 || Nota3 > 10) {
      
        System.out.printf("\nLas notas tienen que estar entre 0 y 10");  
          
      } else {
        double media = (Nota1 + Nota2 + Nota3)/3;
        System.out.printf("\nTu media es: %.2f", media); 
        String valorBoletin = "";
        if(media < 5) {
          
          valorBoletin = "insuficiente";
          
        } else if (media >= 5 && media < 6) {
          
          valorBoletin = "suficiente";
          
        } else if (media >= 5 && media < 7) {
          
          valorBoletin = "bien";
          
        } else if (media >= 7 && media < 9) {
          
          valorBoletin = "notable";
          
        } else {
          
          valorBoletin = "sobresaliente";
          
        }
        
        System.out.printf("\nTu nota del boletín es: %s", valorBoletin);
      }
    
  }
}
