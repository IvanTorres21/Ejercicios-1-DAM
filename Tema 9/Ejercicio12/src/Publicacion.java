
public abstract class Publicacion {

  private String ISBN;
  private String titulo;
  private int anioPub; //Año de publicación
  
  // Getter
  
  public String getISBN() {
    
    return this.ISBN;
  }
  public String getTitulo() {
    
    return this.titulo;
  }
  public int getAnioPub() {
    
    return this.anioPub;
  }
  
  // Setters
  
  public void setISBN(String isbn) {
    
    this.ISBN = isbn;
  }
  public void setTitulo(String tit) {
    
    this.titulo = tit;
  }
  public void setAnioPub(int anio) {
    
    this.anioPub = anio;
  }
  
  // Constructor
  
  public Publicacion(String isbn, String tit, int anio) {
    
    this.ISBN = isbn;
    this.titulo = tit;
    this.anioPub = anio;
  }
  
  // Métodos
  
  public String toString() {
    
    return "ISBN: " + this.getISBN() + ", titulo: " + this.getTitulo() + ", año publicación: " + this.getAnioPub();
  }
}
