/*
* Ejercicio 6, programa que hace una factura a partir de la base imponible
*/
public class Ejercicio06 {
  public static void main(String[] args){
    float baseImponible = (float) 345.40;
    float precioFinal = baseImponible * (float) 0.21 + baseImponible;
    System.out.println("Base imponible: " + baseImponible + "\nFactura final: " + precioFinal);
  }
}
