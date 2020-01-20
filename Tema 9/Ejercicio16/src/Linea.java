
public class Linea {

  private Punto p1;
  private Punto p2;
  
  // Getter
  
  public Punto getP1() {
    
    return this.p1;
  }
  public Punto getP2() {
    
    return this.p2;
  }
  
  // Setter
  public void setP1(Punto p1) {
    
    this.p1 = p1;
  }
  public void setP2(Punto p2) {
    
    this.p2 = p2;
  }
  
  // Constructor
  
  public Linea(Punto p1, Punto p2) {
    
    this.setP1(p1);
    this.setP2(p2);
  }
  
  // Métodos
  
  public String toString() {
    
    return "Linea formada por los puntos " + this.p1 + " y " + this.p2;
  }
}
