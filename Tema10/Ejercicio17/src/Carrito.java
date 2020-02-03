import java.util.ArrayList;

public class Carrito {

  private ArrayList<Elemento> elementos = new ArrayList<Elemento>();
  
  // Getter
  public String getElementos() {
    
    String str = "";
    for (Elemento e : elementos) {
      
      str += e + "\n";
    }
    return str;
  }
  public int numeroDeElementos() {
    
    return this.elementos.size();
  }
  
  // Métodos
  
  @Override
  public String toString() {
    
    return this.getElementos();
  }
  
  public void agrega(Elemento e) {
    
    this.elementos.add(e);
  }
  public double importeTotal() {
    
    double precio = 0;
    for (Elemento e : elementos) {
      
      precio += (e.getPrecio() * e.getCantidad());
    }
    return precio;
  }
}
