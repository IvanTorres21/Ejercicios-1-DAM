import java.text.DecimalFormat;

public class Elemento {

  private String nombre = "";
  private double precio;
  private int cantidad;
  private DecimalFormat form = new DecimalFormat("#0.00");
  
  // Getters
  public String getNombre() {
    
    return this.nombre;
  }
  public double getPrecio() {
    
    return this.precio;
  }
  public int getCantidad() {
    
    return this.cantidad;
  }
  
  // Setters
  public void setNombre(String nom) {
    
    this.nombre = nom;
  }
  public void setPrecio(double pre) {
    
    this.precio = pre;
  }
  public void setCantidad(int cant) {
    
    this.cantidad = cant;
  }
  
  // Constructor
  public Elemento(String nom, double pre, int cant) {
    
    this.nombre = nom;
    this.precio = pre;
    this.cantidad = cant;
  }
  
  // Métodos
  
  @Override
  public String toString() {
    
    return this.getNombre() + " PVP: " + this.getPrecio() + " " + this.getCantidad() + " unidades " + "Subtotal: " + 
    form.format((this.cantidad * this.precio)); 
  }
}
