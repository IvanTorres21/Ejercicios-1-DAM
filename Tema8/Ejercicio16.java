import matematicas.Varias;
/**
 * Programa que muestra los números capicua entre 1 y 99999;
 * @author Iván Torres
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    
    long num = 1;
    do {
      
      if (matematicas.Varias.esCapicua(num)) {
        
        System.out.println(num);
      }
      num++;
    }while(num <= 99999);
  }
}
