
public class Ameba {

  private int peso = 3; //En microgramos
  
  // Getters
  
  public int getPeso() {
    
    return this.peso;
  }
  
  // Setters 
  public void setPeso(int pes) {
    
    this.peso = pes;
  }
  
  // Métodos
  
  public String toString() {
    
    return "Soy una ameba y peso " + this.getPeso() + " microgramos";
  }
  /**
   * Método que hace que una ameba coma una particula
   * @param x Peso de la particula
   */
  public void come(int x) {
    
    this.peso += x - 1;
  }
  /**
   * Método que hace que una ameba coma otra ameba
   * @param a Ameba que va a fagocitar
   */
  public void come(Ameba a) {
    
    this.peso += a.getPeso() -1;
    a.setPeso(0);
  }
}
