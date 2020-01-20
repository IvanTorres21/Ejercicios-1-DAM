
public class Libro extends Publicacion implements Prestable{

  private boolean prestado = false;
  
  // Getter
  
  public String isPrestado() {
    
    if (this.prestado) {
      
      return "(prestado)";
    } else {
      
      return "(no prestado)";
    }
  }
  
  // Setter
  
  public void setPrestado(boolean pres) {
    
    this.prestado = pres;
  }
  
  // Constructor
  
  public Libro (String isbn, String tit, int anio) {
    
    super(isbn, tit, anio);
  }
  
  // Métodos
  public String toString() {
    
    return "ISBN: " + this.getISBN() + ", titulo: " + this.getTitulo() + ", año publicación: " + this.getAnioPub() +
        ", " + this.isPrestado();
  }
  public void presta() {
    
    if (this.prestado) {
      
      System.out.println("Lo siento, este libro ya esta prestado");
    } else {
      
      this.setPrestado(true);
    }
  }
  
  public void devuelve() {
    
    if (!this.prestado) {
      
      System.out.println("Este libro no esta prestado");
    } else {
      
      this.setPrestado(false);
    }
  }
  public boolean estaPrestado() {
    
    return this.prestado;
  }
}
