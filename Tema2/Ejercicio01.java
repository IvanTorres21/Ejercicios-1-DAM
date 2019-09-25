/*
* Ejercicio 1, declaramos dos variables que sumamos, restamos, multiplicamos y dividimos.
*/
public class Ejercicio01 {
  public static void main(String[] args) {
    int x = 144;
    int y = 999;
    System.out.println("El valor de x es: " + x);
    System.out.println("El valor de e es: " + y);
    int suma = x + y;
    System.out.println("La suma es: " + suma);
    int resta = x - y;
    System.out.println("La resta es: " + resta);
    int multiplicacion = x * y;
    System.out.println("La multiplicación es: " + multiplicacion);
    double division = (double) x / (double) y;
    System.out.println("La división es: " + division);    
  }
}
