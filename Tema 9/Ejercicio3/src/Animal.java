
public abstract class Animal {

  private int edad;
  private Sexo sexo;
  private String nombre;
  private String nombreCientifico;
  private boolean envenenado = false;
  // Getters
  
  public int getEdad() {
    
    return this.edad;
  }
  public String getSexo() {
    
    return this.sexo.toString();
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
  public void setSexo(Sexo sexo) {
    
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
  
  public Animal(Sexo sexo, String nom, int edad, String nomCien) {
    
    this.nombre = nom;
    this.edad = edad;
    this.sexo = sexo;
    this.nombreCientifico = nomCien;
  }
  // toString
  public String toString() {
    
    return "Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nGenero: " + sexo.toString().toLowerCase() + "\nEnvenenado?: " + this.isEnvenenado();
  }
}
