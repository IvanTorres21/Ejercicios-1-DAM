
public class Discos {
  
  private int codigo = 0;
  private String titulo = "";
  private int duracion = 0; //En minutos
  private String autor = "";
  // Getters
  public String getTitulo() {
    
    return this.titulo;
  }
  public String getAutor() {
    
    return this.autor;
  }
  public int getDuracion() {
    
    return this.duracion;
  }
  public int getCodigo() {
    
    return this.codigo;
  }
  // Setters
  public void setTitulo(String tit) {
    
    this.titulo = tit;
  }
  public void setAutor(String aut) {
    
    this.autor = aut;
  }
  public void setDuracion(int dur) {
    
    this.duracion = dur;
  }
  public void setCodigo(int cod) {
    
    this.codigo = cod;
  }
  // Constructor
  
  public Discos(int cod, String tit, String aut, int dur) {
    
    this.codigo = cod;
    this.titulo = tit;
    this.autor = aut;
    this.duracion = dur;
  }
  
  // Métodos
  
  public String toString() {
    
    return "==========================" + "\nNombre: " + this.titulo + "\nAutor: " + this.autor + 
            "\nDuracion: " + this.duracion + "\nCódigo: " + this.codigo + "\n";
  }
}
