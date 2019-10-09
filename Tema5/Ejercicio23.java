import java.util.Scanner;

/**
 * Programa que permite introducir numeros mientras que su suma no supere 10000
 * Cuando eso ocurre muestra la suma y la cantidad de numeros introducidos.
 * @author Iván Torres.
 */
public class Ejercicio23 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    System.out.println("En este programa puedes introducir numeros hasta que la suma de todos sea 10000");
    double suma = 0;
    int cantNum = 0;
    do {
      
      System.out.print("Introduce un número: ");
      double num = Double.parseDouble(s.nextLine());
      suma += num;
      if(suma > 10000) {
        
        suma -= num;
        break;
      }
      cantNum++;
    } while (suma <= 10000);
    
    System.out.println("Has conseguido llegar a: " + suma);
    System.out.println("Has introducido " + cantNum + " numeros");
  }
}
