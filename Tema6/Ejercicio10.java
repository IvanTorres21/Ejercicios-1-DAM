
/**
 * Programa que pinta diez lineas de hasta 40 carácteres aleatorios entre: *, -, =, ., |, @.
 * @author Iván Torres
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    
    for (int i = 0; i < 10; i++) {
      
      int caracter = (int) (Math.random() * 6 +1);
      char caracterElegido;
      switch (caracter) {
        
        case 1:
          caracterElegido = '*';
          break;
        case 2:
          caracterElegido = '-';
          break;
        case 3:
          caracterElegido = '=';
          break;
        case 4:
          caracterElegido = '.';
          break;
        case 5:
          caracterElegido = '|';
          break;
        case 6:
          caracterElegido = '@';
          break;
        default:
          caracterElegido = 'X';
          break;
      }
      int cantCar = (int) (Math.random() * 40 + 1);
      for (int j = 0; j < cantCar; j++) {
        
        System.out.print(caracterElegido);
      }
      System.out.println();
    }
  }
}
