import java.util.Scanner;

/**
 * Programa que lee todos los números introducidos hasta llegar a un negativo.
 * Nos dice cuantos números se han introducido.
 * Muestra la media de los impares y el mayor de los pares.
 * @author Iván Torres
 */
public class Ejercicio21 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    double mayor = 0;
    double media = 0;
    int cantImpar = 0;
    int totalNumIntroducidos = 0;
    boolean hayPar = false;
    double num;
    do {
      
      System.out.print("Introduce un número positivo, para parar introduce un negativo: ");
      num = Double.parseDouble(s.nextLine());
      if (num > 0) {
        
        if (num % 2 == 0) {
        
          hayPar = true;
          if (num > mayor) {
          
            mayor = num;
          }
          totalNumIntroducidos++;
        } else if (num % 2 != 0) {
        
          media += num;
          cantImpar++;
          totalNumIntroducidos++;
        }
      }
    } while (num > 0);
    
    System.out.println("Has introducido: " + totalNumIntroducidos + " números");
    if (cantImpar != 0) {
    System.out.println("La media de los impares es: " + media / cantImpar);
    }
    if (hayPar) {
    System.out.println("El mayor de los pares es: " + mayor); 
    }
  }
}
