
public class Pizza {

  static int numPizPed = 0;
  static int numPizSer = 0;
  private PizzaSize size;
  private PizzaType type;
  boolean currentState = false; //false ----> pedida // true ----> servida
  
  // Constructor
  public Pizza (PizzaType type, PizzaSize size) {
    
    this.size = size;
    this.type = type;
    Pizza.numPizPed++;
  }
  
  // Getters
  
  public String getType() {
    
    return this.type.toString().toLowerCase();
  }
  public String getSize() {
    
    return this.size.toString().toLowerCase();
  }
  public String getState() {
    
    if(this.currentState) {
      
      return "servido";
    } else {
      
      return "pedido";
    }
  }
  public static int getNumPizzaPed() {
    
    return Pizza.numPizPed;
  }
  public static int getNumPizzaSer() {
    
    return Pizza.numPizSer;
  }
  
  // Setter
  
  public void setType(PizzaType type) {
    
    this.type = type;
  }
  public void setSize(PizzaSize size) {
    
    this.size = size;
  }
  public void setState(boolean state) {
    
    this.currentState = state;
  }
  
  // Métodos
  public String toString() {
    
    return "Pizza " + this.getType() + " " + this.getSize() + ", " + this.getState();
  }
  public void sirve() {
    
    if (this.currentState) {
      
      System.out.println("Esa pizza ya se ha servido");
    } else {
      
      this.currentState = true;
      Pizza.numPizSer++;
    }
  }
}
