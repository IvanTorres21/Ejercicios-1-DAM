
import java.util.Scanner;
import matematicas.Varias;

/**
 * Programa que pasa un número a octal, hexadecimal, binario, o decimal.
 *
 * @author Iván Torres
 */
public class Ejercicio19 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    long num;
    boolean baseVal = true;
    
    do {
      System.out.print("Introduzca la base original(2, 8, 10, 16): ");
      int base = Integer.parseInt(s.nextLine());
      switch (base) {

        case 2:
          
          System.out.print("Introduzca el número: ");
          num = Long.parseLong(s.nextLine());
          System.out.print("A que base quiere pasarlo? (8, 10, 16): ");
          base = Integer.parseInt(s.nextLine());
          switch (base) {
            
            case 8:
              num = matematicas.Varias.binarioDecimal(num);
              num = matematicas.Varias.decimalOctal(num);
              System.out.print("El número en octal es: " + num);
              break;
            case 10:
              num = matematicas.Varias.binarioDecimal(num);
              System.out.print("EL número en decimal es: " + num);
              break;
            case 16:
              num = matematicas.Varias.binarioDecimal(num);
              String res = matematicas.Varias.decimalHex(num);
              System.out.print("El número en hexadecimal es: " + res);
              break;
            default:
              System.out.println("Introduzca una base valida.");
              baseVal = false;
              break;
          }
          break;
        case 8:
          
          System.out.print("Introduzca el número: ");
          num = Long.parseLong(s.nextLine());
          System.out.print("A que base quiere pasarlo? (2, 10, 16): ");
          base = Integer.parseInt(s.nextLine());
          switch (base) {
            
            case 2:
              num = matematicas.Varias.octalDecimal(num);
              num = matematicas.Varias.decimalBinario(num);
              System.out.print("El número en binario es: " + num);
              break;
            case 10:
              num = matematicas.Varias.octalDecimal(num);
              System.out.print("EL número en decimal es: " + num);
              break;
            case 16:
              num = matematicas.Varias.octalDecimal(num);
              String res = matematicas.Varias.decimalHex(num);
              System.out.print("El número en hexadecimal es: " + res);
              break;
            default:
              System.out.println("Introduzca una base valida.");
              baseVal = false;
              break;
          }
          break;
        case 10:
          
          System.out.print("Introduzca el número: ");
          num = Long.parseLong(s.nextLine());
          System.out.print("A que base quiere pasarlo? (2, 8, 16): ");
          base = Integer.parseInt(s.nextLine());
          switch (base) {
            
            case 2:
              num = matematicas.Varias.decimalBinario(num);
              System.out.print("El número en binario es: " + num);
              break;
            case 8:
              num = matematicas.Varias.decimalOctal(num);
              System.out.print("EL número en decimal es: " + num);
              break;
            case 16:
              String res = matematicas.Varias.decimalHex(num);
              System.out.print("El número en hexadecimal es: " + res);
              break;
            default:
              System.out.println("Introduzca una base valida.");
              baseVal = false;
              break;
          }
          break;

        case 16:
          System.out.print("Introduzca el número: ");
          String valor = s.nextLine().toUpperCase();
          System.out.print("A que base quiere pasarlo? (2, 8, 10): ");
          base = Integer.parseInt(s.nextLine());
          switch (base) {
            
            case 8:
              num = matematicas.Varias.hexDecimal(valor);
              num = matematicas.Varias.decimalOctal(num);
              System.out.print("El número en octal es: " + num);
              break;
            case 10:
              num = matematicas.Varias.hexDecimal(valor);
              System.out.print("EL número en decimal es: " + num);
              break;
            case 2:
              num = matematicas.Varias.hexDecimal(valor);
              num = matematicas.Varias.decimalBinario(num);
              System.out.print("El número en binario es: " + num);
              break;
            default:
              System.out.println("Introduzca una base valida.");
              baseVal = false;
              break;
          }
          break;

        default:

          System.out.println("Introduzca una base válida.");
          baseVal = false;
          break;
      }
    } while (!baseVal);
  }
}
