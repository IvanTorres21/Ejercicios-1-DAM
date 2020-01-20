
public class Terminal {

  private String numRef;
  private int tiemConv = 0; //Tiempo de conversación
  
  // Getters
  
  public String getNumRef() {
    
    return this.numRef;
  }
  
  public int getTiemConv() {
    
    return this.tiemConv;
  }
  
  // Setters
  
  public void setNumRef(String num) {
    
    this.numRef = num;
  }
  public void setTiemConv(int tim) {
    
    this.tiemConv += tim;
  }
  
  // Constructor
  
  public Terminal(String num) {
    
    this.numRef = num;
  }
  
  // Métodos
  
  public String toString() {
    
    return "Nº " + this.getNumRef() + " - " + this.getTiemConv() + "s de conversación";
  }
  public void llama(Terminal term, int tiempo) {
    
    term.setTiemConv(tiempo);
    this.setTiemConv(tiempo);
  }
}
