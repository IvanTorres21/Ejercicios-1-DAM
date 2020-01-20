public class FichaDomino {
  
  private int va1; //Primer valor de la ficha
  private int va2; //Valor de la otra cara
  
  // Getter
  
  public int getVa1() {
    
   return this.va1; 
  }
  public int getVa2() {
    
    return this.va2; 
  }
  
  // Setter
  
  public void setVa1() {
    
    this.va1 = (int) (Math.random()*7);
  }
  public void setVa2() {
    
    this.va2 = (int) (Math.random()*7);
  }
  
  // Constructor
  
  public FichaDomino() {
    
    this.setVa1();
    this.setVa2();
  }
  
  // Métodos
  
  public String toString() {
    
    return "[" + this.va1 + "|" + this.va2 + "]";
  }
  public String voltea() {
    
    int aux = this.va1;
    this.va1 = this.va2;
    this.va2 = aux;
    return this.toString();
  }
  
  public boolean encaja(FichaDomino fi) {
    
    if (this.va2 == fi.va1 || this.va2 == fi.va2) {
      
      if(this.va2 == fi.va2) {
        
        fi.voltea();
      }
      return true;
    } else {
   
      return false;
    }
  }
}
