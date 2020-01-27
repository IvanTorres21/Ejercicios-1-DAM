

public class Gato {

  private int edad;
  private char sexo = 'M';
  private String nombre;
  private String nombreCientifico;
  private boolean envenenado = false;
  // Getters
  
  public int getEdad() {
    
    return this.edad;
  }
  public char getSexo() {
    
    return this.sexo;
  }
  public String getNombre() {
    
    return this.nombre;
  }
  public String getNombreCient() {
    
    return this.nombreCientifico;
  }
  public String isEnvenenado() {
    
    if (this.envenenado) {
      
      return "Sí";
    } else {
      
      return "No";
    }
  }
  // Setter
  
  public void setEdad(int edad) {
    
    this.edad = edad;
  }
  public void setSexo(char sexo) {
    
    this.sexo = sexo;
  }
  public void setNombre(String nom) {
    
    this.nombre = nom;
  }
  public void setNombreCient(String nom) {
    
    this.nombreCientifico = nom;
  }
  public void setEnvenenado(boolean ven) {
    
    this.envenenado = ven;
  }
  // Constructor
  
  public Gato(char sexo, String nom, int edad) {
    
    this.nombre = nom;
    this.edad = edad;
    this.sexo = sexo;
  }
public Gato(String nom, int edad) {
    
    this.nombre = nom;
    this.edad = edad;
  }
  // toString
  public String toString() {
    
    return "Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nGenero: " + this.sexo;
  }
}

