import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    Fraccion frac1 = new Fraccion(6, 8);
    Fraccion frac2 = new Fraccion(4, 3);
    int opt = 0;
    do {
      
      System.out.println("1.- Invertir fraccion ");
      System.out.println("2.- Simplificar fracción");
      System.out.println("3.- multiplicar fracción");
      System.out.println("4.- dividir fracción");
      System.out.println("5.- Salir");
      System.out.println("¿Que quieres hacer?: ");
      opt = Integer.parseInt(s.nextLine());
      
      switch(opt) {
      
        case 1:
          mostrarFracciones(frac1, frac2);
          System.out.println("Que fraccion?");
          opt = Integer.parseInt(s.nextLine());
          if (opt == 1) {
            
            frac1.invertir();
          } else {
            
            frac2.invertir();
          }
          break;
        case 2:
          mostrarFracciones(frac1, frac2);
          System.out.println("Que fraccion?");
          opt = Integer.parseInt(s.nextLine());
          if (opt == 1) {
            
            frac1.simplificar();
          } else {
            
            frac2.simplificar();
          }
          break;
        case 3:
          mostrarFracciones(frac1, frac2);
          System.out.println("Quien es la primera en multiplicar?: ");
          opt = Integer.parseInt(s.nextLine());
          if (opt == 1) {
            
            frac1.multiplicar(frac2);
          } else {
            
            frac2.multiplicar(frac1);
          }
          break;
        case 4:
          mostrarFracciones(frac1, frac2);
          System.out.println("Quien es la primera en dividir?: ");
          opt = Integer.parseInt(s.nextLine());
          if (opt == 1) {
            
            frac1.dividir(frac2);
          } else {
            
            frac2.dividir(frac1);
          }
          break;
        case 5:
          break;
        default:
          
          System.out.println("Opcion no valida!");
      }
    } while (opt != 5);
  }
  
  public static void mostrarFracciones(Fraccion frac1, Fraccion frac2) {
    
    System.out.println("Las fracciones son: ");
    System.out.println("1.- " + frac1.toString());
    System.out.println("2.- " + frac2.toString());
  }
}
