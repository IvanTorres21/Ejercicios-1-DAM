
public class Gato extends Mamifero{
  
  
  private int vidas = 7;
  
  // Getter
  
  public int getVidas() {
    
    return this.vidas;
  }
  
  // Setter
  
  public void setVidas(int vidas) {
    
    this.vidas = vidas;
  }
  // Constructor
  public Gato (Sexo sexo, String nom, int edad, String nomCien) {
    
    super(FormasCaminar.DIGITIGRADOS, sexo, nom, edad, nomCien);
  }

  // Métodos
  public void Maullar() {
    
    System.out.println("Miau");
  }
  public void perderVidas() {
    
    System.out.println("Hay que me he matao");
    this.vidas--;
    
  }
  public void Arañar(Animal animal) {
    
    System.out.println("Vaya arañazo le acabo de meter a " + animal.getNombre());
  }
}
