
public class Ejercicio5 {
  public static void main(String[] args) {
    
    Pizza p1 = new Pizza(PizzaType.MARGARITA, PizzaSize.MEDIANA);
    Pizza p2 = new Pizza(PizzaType.FUNGHI, PizzaSize.FAMILIAR);
    p2.sirve();
    Pizza p3 = new Pizza(PizzaType.CUATROQUESOS, PizzaSize.MEDIANA);
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    p2.sirve();
    System.out.println("pedidas: " + Pizza.getNumPizzaPed());
    System.out.println("servidas: " + Pizza.getNumPizzaSer());
    }
}
