
/**
 * Programa que genera 20 numeros aleatorios y muestra sus cubos y cuadrados
 * @author Iván Torres
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    
    int[] num = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    for (int i = 0; i < 20; i++) {
      
      num[i] = (int) (Math.random() * 101);
      cuadrado[i] = (int) Math.pow(num[i], 2);
      cubo[i] = (int) Math.pow(num[i], 3);
    }
    System.out.printf("|%2sNúmero%2s| Cuadrado |%3sCubo%3s|\n", "", "", "", "");
    for (int i = 0; i < 20; i++) {
      
      System.out.printf("|%10d|%10d|%10d|\n", num[i], cuadrado[i], cubo[i]);
    }
  }
}
