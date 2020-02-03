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
    
    boolean repetido = false;
    for (Elemento o : this.elementos) {
      
      if (o.getNombre().equalsIgnoreCase(e.getNombre())) {
        
        o.setCantidad(o.getCantidad()+e.getCantidad());
        repetido = true;
      }
    }
    if (!repetido) {
      
      this.elementos.add(e);
    }
  }
  public double importeTotal() {
    
    double precio = 0;
    for (Elemento e : elementos) {
      
      precio += (e.getPrecio() * e.getCantidad());
    }
    return precio;
  }
}
