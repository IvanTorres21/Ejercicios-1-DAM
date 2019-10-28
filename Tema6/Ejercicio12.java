
/**
 * Programa que muestra en la pantalla caracteres aleatorios "a lo matrix"
 * @author Iván Torres
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    
    while(true) {
      
      for (int i = 0; i < 45; i++){
      int numCar = (int) (Math.random() * 96 + 30);
      char car = (char) numCar;
      System.out.print("\033[032m" + car);
      }
      System.out.println();
    }
  }
}
