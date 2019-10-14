import java.util.Scanner;

/**
 * Programa que pide dos números por teclado y separa los pares de los impares en dos números nuevos.
 * @author Iván Torres
 */
public class Ejercicio34 {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    int[] numPar = new int[10];
    int[] numImp = new int[10];
    System.out.print("Introduzca un número:   ");
    String num1 = s.nextLine();
    System.out.print("Introduzca otro número: ");
    String num2 = s.nextLine();
    
    //Para evitar que haya signos de positivo o negativo
    int[] numCor1 = new int[10]; 
    int[] numCor2 = new int[10];
    int tamNum1 = 0;
    int tamNum2 = 0;
    if (num1.charAt(0) == '+' || num2.charAt(0) == '-') {
      
      if (num1.charAt(1) == ' ') {
        
        for (int i = 0; i < num1.length()-2; i++) {
          
          numCor1[i] = Character.getNumericValue(num1.charAt(i+2));
        }
        tamNum1 = num1.length()-2;
      } else {
        
        for (int i = 0; i < num1.length()-1; i++) {
            
          numCor1[i] = Character.getNumericValue(num1.charAt(i)+1);
        }
        tamNum1 = num1.length()-1;
      }
    } else if (num2.charAt(0) == '+' || num2.charAt(0) == '-') {
        
        if (num2.charAt(1) == ' ') {
          for (int i = 0; i < num2.length()-2; i++) {
          
            numCor2[i] = Character.getNumericValue(num2.charAt(i)+2);
          }
          tamNum2 = num2.length()-2;
        } else {
          
            for (int i = 0; i < num2.length()-1; i++) {
            
              numCor2[i] = Character.getNumericValue(num2.charAt(i+1));
            }
            tamNum2 = num2.length()-1;
        }
      } else {
        
        for (int i = 0; i < num1.length(); i++) {
            
          numCor1[i] = Character.getNumericValue(num1.charAt(i));
        }
        for (int i = 0; i < num2.length(); i++) {
            
          numCor2[i] = Character.getNumericValue(num2.charAt(i));
        }
        tamNum1 = num1.length();
        tamNum2 = num2.length();
      }
    //Separar los pares de impares
    int posAct = 0;
    for (int i = 0; i < 10; i++) {
      
      if (i < tamNum1) {
        if (numCor1[i] % 2 == 0) {
        
          numPar[posAct] = numCor1[i];
          posAct++;
        } 
      }
      if (i < tamNum2) {
        if (numCor2[i] % 2 == 0) {
        
          numPar[posAct] = numCor2[i];
          posAct++;
        }
      }
    }
    int tamPar = posAct;
    posAct = 0;
    for (int i = 0; i < 10; i++) {
      
      if (i < tamNum1) {
        if (numCor1[i] % 2 != 0) {
        
          numImp[posAct] = numCor1[i];
          posAct++;
        }
      }
      if (i < tamNum2) {
        if (numCor2[i] % 2 != 0) {
        
          numImp[posAct] = numCor2[i];
          posAct++;

        }
      }
    }
    int tamImp = posAct;
    //Imprimir los números por pantalla.
    System.out.print("El número par es: ");
    for (int i = 0; i < tamPar; i++) {
      
      System.out.print(numPar[i]);
    }
    System.out.print("\nEl número impar es: ");
    for (int i = 0; i < tamImp; i++) {
      
      System.out.print(numImp[i]);
    }
  }
}
