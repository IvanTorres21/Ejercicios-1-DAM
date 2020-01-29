
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
  
  public void setVa1(int n) {
    
    this.va1 = n;
  }
  public void setVa2(int n) {
    
    this.va2 = n;
  }
  
  // Constructor
  
  public FichaDomino(int va1, int va2) {
    
    this.setVa1(va1);
    this.setVa2(va2);
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
    
    if (this.va1 == fi.va1 || this.va1 == fi.va2 || this.va2 == fi.va1 || this.va2 == fi.va2) {
      
      return true;
    } else {
      
      return false;
    }
  }
}
