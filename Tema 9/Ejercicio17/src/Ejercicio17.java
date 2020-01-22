
public class Ejercicio17 {
  public static void main(String[] args) {
    
    Piramide p = new Piramide(8);
    Rectangulo r1 = new Rectangulo(4, 10);
    Rectangulo r2 = new Rectangulo(6, 3);
    System.out.println(p);
    System.out.println(r1);
    System.out.println(r2);
    System.out.println("Pirámides creadas: " + Piramide.getPiramidesCreadas());
    System.out.println("Rectángulos creados: " + Rectangulo.getRectangulosCreados());
  }
}
