import java.text.DecimalFormat;

public class Articulo {

  static int codAct = 1;
  private int codigo;
  private String descripcion;
  private int cantidad;
  private double precioCom;
  private double precioVen;
  private DecimalFormat form = new DecimalFormat("#0.00");
  
  // Getters
  public int getCodigo() {
    
    return this.codigo;
  }
  public String getDescripcion() {
    
    return this.descripcion;
  }
  public int getCantidad() {
    
    return this.cantidad;
  }
  public double getPrecioCom() {
    
    return this.precioCom;
  }
  public double getPrecioVen() {
    
    return this.precioVen;
  }  
  
  // Setters
  public void setCodigo(int cod) {
    
    this.codigo = cod;
  }
  public void setDescripcion(String des) {
    
    this.descripcion = des;
  }
  public void setCantidad(int cant) {
    
    if (cant < 0) {
      
      this.cantidad = 0;
    } else {
      
      this.cantidad = cant;
    }
  }
  public void setPrecioCom(double pre) {
    
    if (pre < 0) {
      
      this.precioCom = 0;
    } else {
      
      this.precioCom = pre;
    }
  }
  public void setPrecioVen(double pre) {
    
    if (pre < 0) {
      
      this.precioVen = 0;
    } else {
      
      this.precioCom = pre;
    }
  }
  
  // Constructor

   public Articulo(String des, int cant, double preC, double preV) {
     
     this.codigo = codAct;
     this.descripcion = des;
     this.cantidad = cant;
     this.precioCom = preC;
     this.precioVen = preV;
     codAct++;
   }
   public Articulo() {
     
     this.codigo = codAct;
     codAct++;
   }
   
   // Métodos
   
   public String toString() {
     
     String str = "====================================="; 
     str += "\nCódigo: " + this.codigo + "\nDescripcion: " + this.descripcion + "\nCantidad: " + this.cantidad;
     str += "\nPrecio Compra: " + form.format(this.precioCom) + "\nPrecio Venta: " + form.format(this.precioVen);
     return str;
   }

}
