import matematicas.Varias;
/**
 * Programa que muestra todos los números primos entre 1 y 1000
 * @author Iván Torres
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    
    int num = 1;
    do {
      
      if (matematicas.Varias.esPrimo(num)) {
        
        System.out.println(num);
      }
      num++;
    } while (num <= 1000);
  }
}
