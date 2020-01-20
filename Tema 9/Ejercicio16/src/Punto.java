import java.text.DecimalFormat;

public class Punto {

  private double x;
  private double y;
  private DecimalFormat form = new DecimalFormat("#0.00");
  // Getters
   
  public double getX() {
    
    return this.x;
  }
  public double getY() {
    
    return this.y;
  }
  
  // Setters
  
  public void setX(double x) {
    
    this.x = x;
  }
  public void setY(double y) {
    
    this.y = y;
  }
  
  // Constructor
  
  public Punto(double x, double y) {
    
    this.setX(x);
    this.setY(y);
  }
  // Métodos
  
  public String toString() {
    
    return "(" + form.format(this.x) + ", " + form.format(this.y) + ")";
  }
}
