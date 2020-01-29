
public class Incidencia {

  private static int incAct = 0; // Número de la incidencia actual
  private static int numPen = 0;
  private int numRef;
  private int puesto;
  private String problema = "";
  private boolean resuelto = false;
  private String solucion = "";
  
  // Getters
  public int getNumRef() {
    
    return this.numRef;
  }
  public int getPuesto() {
    
    return this.puesto;
  }
  public String getProblema() {
    
    return this.problema;
  }
  public String isResuelto() {
    
    if (this.resuelto) {
      
      return "resuelto";
    } else {
      
      return "pendiente";
    }
  }
  public String getSolucion() {
    
    return this.solucion;
  }
  public static int getPendientes() {
    
    return numPen;
  }
  
  // Setters
  public void setNumRef() {
    
    incAct++;
    this.numRef = incAct; 
  }
  public void setPuesto(int puesto) {
    
    this.puesto = puesto;
  }
  public void setProblema(String prob) {
    
    this.problema = prob;
  }
  public void isResuelto(boolean res) {
    
    this.resuelto = res;
  }
  public void setSolucion(String sol) {
    
    this.solucion = " - " + sol;
  }
  
  // Constructor
  
  public Incidencia(int puesto, String prob) {
    
    this.setNumRef();
    this.setPuesto(puesto);
    this.setProblema(prob);
    numPen++;
  }
  
  // Métodos
  
  public String toString() {
    
    return "Incidencia " + this.numRef + " - Puesto: " + this.puesto + " - " + this.problema + " - "+ this.isResuelto() + this.solucion;
  }
  
  public void resuelve(String sol) {
    
    this.setSolucion(sol);
    this.isResuelto(true);
    numPen--;
  }
}
