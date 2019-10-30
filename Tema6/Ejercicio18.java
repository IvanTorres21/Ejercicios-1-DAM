
/**
 * Programa que elige tres colores aleatorios para pintar las habitaciones de una casa
 * @author Iván Torres
 */
public class Ejercicio18 {
  public static void main(String[] args) {
    
    int habAct = 1;
    int color;
    int aux = 0; //Para recordar el valor anterior pero no tener que poner tres switch
    int aux2 = 0; //Para recordar el valor anterior pero no tener que poner tres switch
    do {
      
      System.out.print("Habitación " + habAct + ": ");
      do {
        
        color = (int) (Math.random() * 6 + 1);
      } while (color == aux || color == aux2);
      if (habAct == 1) {
        
        aux = color;
      } else if(habAct == 2) {
        
        aux2 = color;
      }
      switch (color) {
        
        case 1:
          
          System.out.println("Rojo");
          break;
        case 2:
          
          System.out.println("Azul");
          break;
        case 3:
          
          System.out.println("Naranja");
          break;
        case 4:
          
          System.out.println("Violeta");
          break;
        case 5:
          
          System.out.println("Amarillo");
          break;
        case 6:
          
          System.out.println("Verde");
          break;
        default:
        
          System.exit(2);
      }
      habAct++;
    } while (habAct <= 3);
  }
}
