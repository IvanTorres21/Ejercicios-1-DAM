import java.util.Scanner;

/**
 * Este programa imprime una piramide en la dirección que el usuario quiera.
 * Además, podrá elegir con que caracter quiere hacerlo: *, +, -, $, &.
 * @author Iván Torres
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("En que dirección quieres que apunte (introduce el número):");
    System.out.println(" 1.-Arriba\n 2.-Derecha\n 3.-Izquierda\n 4.-Abajo\n");
    int direccion = Integer.parseInt(s.nextLine());
    System.out.print("Elige el carácter que quieres (*, +, -, $, &): ");
    char caracter = s.next().charAt(0);
    System.out.println("");
    
    switch (caracter) {
      
      case '*':
        
        switch (direccion) {
          
          case 1:
            
            System.out.printf("%4s *\n", "");
            System.out.printf("%3s ***\n", "");
            System.out.printf("%2s *****\n", "");
            System.out.printf("%1s *******\n", "");
            break;
            
          case 2:
          
            System.out.printf(" *\n");
            System.out.printf(" * *\n");
            System.out.printf(" * * *\n");
            System.out.printf(" * * * *\n");
            System.out.printf(" * * *\n");
            System.out.printf(" * *\n");
            System.out.printf(" *\n");
            break;
            
          case 3:
          
            System.out.printf("      *\n");
            System.out.printf("    * *\n");
            System.out.printf("  * * *\n");
            System.out.printf("* * * *\n");
            System.out.printf("  * * *\n");
            System.out.printf("    * *\n");
            System.out.printf("      *\n");
            break;
          
          case 4:
            
            System.out.printf("%1s *******\n", "");
            System.out.printf("%2s *****\n", "");
            System.out.printf("%3s ***\n", "");
            System.out.printf("%4s *\n", "");
            break;
        }
        break;
      
      case '+':
      
        switch (direccion) {
          
          case 1:
            
            System.out.printf("%4s +\n", "");
            System.out.printf("%3s +++\n", "");
            System.out.printf("%2s +++++\n", "");
            System.out.printf("%1s +++++++\n", "");
            break;
            
          case 2:
          
            System.out.printf(" +\n");
            System.out.printf(" + +\n");
            System.out.printf(" + + +\n");
            System.out.printf(" + + + +\n");
            System.out.printf(" + + +\n");
            System.out.printf(" + +\n");
            System.out.printf(" +\n");
            break;
            
          case 3:
          
            System.out.printf("      +\n");
            System.out.printf("    + +\n");
            System.out.printf("  + + +\n");
            System.out.printf("+ + + +\n");
            System.out.printf("  + + +\n");
            System.out.printf("    + +\n");
            System.out.printf("      +\n");
            break;
          
          case 4:
            
            System.out.printf("%1s +++++++\n", "");
            System.out.printf("%2s +++++\n", "");
            System.out.printf("%3s +++\n", "");
            System.out.printf("%4s +\n", "");
            break;
        }
        break;
    
      case '-':
      
        switch (direccion) {
          
          case 1:
            
            System.out.printf("%4s -\n", "");
            System.out.printf("%3s ---\n", "");
            System.out.printf("%2s -----\n", "");
            System.out.printf("%1s -------\n", "");
            break;
            
          case 2:
          
            System.out.printf(" -\n");
            System.out.printf(" - -\n");
            System.out.printf(" - - -\n");
            System.out.printf(" - - - -\n");
            System.out.printf(" - - -\n");
            System.out.printf(" - -\n");
            System.out.printf(" -\n");
            break;
            
          case 3:
          
            System.out.printf("      -\n");
            System.out.printf("    - -\n");
            System.out.printf("  - - -\n");
            System.out.printf("- - - -\n");
            System.out.printf("  - - -\n");
            System.out.printf("    - -\n");
            System.out.printf("      -\n");
            break;
          
          case 4:
            
            System.out.printf("%1s -------\n", "");
            System.out.printf("%2s -----\n", "");
            System.out.printf("%3s ---\n", "");
            System.out.printf("%4s -\n", "");
            break;
        }
        break;
      
      case '$':
      
        switch (direccion) {
          
          case 1:
            
            System.out.printf("%4s $\n", "");
            System.out.printf("%3s $$$\n", "");
            System.out.printf("%2s $$$$$\n", "");
            System.out.printf("%1s $$$$$$$\n", "");
            break;
            
          case 2:
          
            System.out.printf(" $\n");
            System.out.printf(" $ $\n");
            System.out.printf(" $ $ $\n");
            System.out.printf(" $ $ $ $\n");
            System.out.printf(" $ $ $\n");
            System.out.printf(" $ $\n");
            System.out.printf(" $\n");
            break;
            
          case 3:
          
            System.out.printf("      $\n");
            System.out.printf("    $ $\n");
            System.out.printf("  $ $ $\n");
            System.out.printf("$ $ $ $\n");
            System.out.printf("  $ $ $\n");
            System.out.printf("    $ $\n");
            System.out.printf("      $\n");
            break;
          
          case 4:
            
            System.out.printf("%1s $$$$$$$\n", "");
            System.out.printf("%2s $$$$$\n", "");
            System.out.printf("%3s $$$\n", "");
            System.out.printf("%4s $\n", "");
            break;
        }
        break;
      
      case '&':
      
        switch (direccion) {
          
          case 1:
            
            System.out.printf("%4s &\n", "");
            System.out.printf("%3s &&&\n", "");
            System.out.printf("%2s &&&&&\n", "");
            System.out.printf("%1s &&&&&&&\n", "");
            break;
            
          case 2:
          
            System.out.printf(" &\n");
            System.out.printf(" & &\n");
            System.out.printf(" & & &\n");
            System.out.printf(" & & & &\n");
            System.out.printf(" & & &\n");
            System.out.printf(" & &\n");
            System.out.printf(" &\n");
            break;
            
          case 3:
          
            System.out.printf("      &\n");
            System.out.printf("    & &\n");
            System.out.printf("  & & &\n");
            System.out.printf("& & & &\n");
            System.out.printf("  & & &\n");
            System.out.printf("    & &\n");
            System.out.printf("      &\n");
            break;
          
          case 4:
            
            System.out.printf("%1s &&&&&&&\n", "");
            System.out.printf("%2s &&&&&\n", "");
            System.out.printf("%3s &&&\n", "");
            System.out.printf("%4s &\n", "");
            break;
        }
        break;
        
        default:
          
          System.out.println("Algo ha salido mal, asegurate de haber introducido los datos bien");
          break;
      
    }
  }
}
