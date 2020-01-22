
public class Rectangulo {

  public static int numRec = 0;
  private int altura;
  private int base;
  
  // Getter
  
  public int getAltura() {
    
    return this.altura;
  }
  public int getBase() {
    
    return this.base;
  }
  public static int getRectangulosCreados() {
    
    return numRec;
  }
  
  // Setter
  public void setAltura(int alt) {
    
    this.altura = alt;
  }
  public void setBase(int bas) {
    
    this.base = bas;
  }
  
  // Constructor 
  public Rectangulo(int alt, int bas) {
    
    this.setAltura(alt);
    this.setBase(bas);
    numRec++;
  }
  
  // Métodos
  
  public String toString() {
    
    String rec = "";
    for (int i = 0; i < altura; i++) {
      
      for (int j = 0; j < base; j++) {
        
        rec += "*";
      }
      rec += "\n";
    }
    return rec;
  }
}
