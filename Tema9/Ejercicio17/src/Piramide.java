
public class Piramide {

  public static int numPir = 0; //Número de piramides creadas
  private int altura;
  
  // Getter
  
  public int getAltura() {
    
    return this.altura;
  }
  public static int getPiramidesCreadas() {
    
    return numPir;
  }
  
  // Setter
  
  public void setAltura(int y) {
    
    this.altura = y;
  }
  public void setNumPir(int num) {
    
    numPir = num;
  }
  
  // Constructor
  
  public Piramide (int y) {
    
    this.setAltura(y);
    numPir++;
  }
  
  // Métodos
  
  public String toString() {
    
    String pir = "";
    int espacios = this.altura - 1;
    int asteriscos = 1;
    for(int i = 0; i < this.altura; i++) {
      
      // Imprime espacios
      for (int j = espacios; j > 0; j--) {
        
        pir += " ";
      }
      
      // Imprime asteriscos
      for (int j = 0; j < asteriscos; j++) {
        
        pir += "*";
      }
      
      pir += "\n";
      espacios--;
      asteriscos += 2;
    }
    return pir;
  }
}
