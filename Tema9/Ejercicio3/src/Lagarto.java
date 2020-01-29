
public class Lagarto extends Animal{

  private boolean venenoso = false;
  // Getter
  public String isVenenoso() {
    
    if (this.venenoso) {
      
      return "Sí";
    } else {
      
      return "No";
    }
  }
  public void setVenenoso(boolean ven) {
    
    this.venenoso = ven;
  }
  // Constructor
  public Lagarto(Sexo sexo, String nom, int edad, String nomCien, boolean ven) {
    
    super(sexo, nom, edad, nomCien);
    this.venenoso = ven;
  }
  // Métodos
  public void conseguirCalor() {
    
    System.out.println("Que calorcito hace en esta roca");
  }
  
  public void hacerRuido() {
    
    System.out.println("*Inserte ruido de lagarto*");
  }
  public void envenenar(Animal animal) {
    
    if (this.venenoso) {
      
      System.out.println("he envenenado a " + animal.getNombre());
      animal.setEnvenenado(true);
    } else {
      
      System.out.println("Yo no soy venenoso");
    }
  }
}
