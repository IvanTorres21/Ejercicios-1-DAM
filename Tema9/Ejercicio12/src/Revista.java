
public class Revista extends Publicacion {

  private int num;
  
  // Getter
  
  public int getNum() {
    
    return this.num;
  }
  
  // Setter
  
  public void setNum(int num) {
    
    this.num = num;
  }
  
  // Constructor
  
  public Revista(String isbn, String titulo, int anio, int num) {
    
    super(isbn, titulo, anio);
    this.num = num;
  }
  
}
