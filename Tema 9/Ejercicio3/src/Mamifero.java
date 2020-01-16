
public abstract class Mamifero extends Animal{

  private FormasCaminar formaCaminar;
  
  // Getters
  public String getFormaCaminar() {
    
    return formaCaminar.toString();
  }
  // Setters
  public void setFormaCaminar(FormasCaminar form) {
    
    this.formaCaminar = form;
  }
  // Constructor
  
  public Mamifero(FormasCaminar form, Sexo sexo, String nom, int edad, String nomCien) {
    
    super(sexo, nom, edad, nomCien);
    this.formaCaminar = form;
  }
}
