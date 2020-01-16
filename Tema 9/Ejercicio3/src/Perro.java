
public class Perro extends Mamifero{

  public Perro(Sexo sexo, String nom, int edad, String nomCien) {
    
    super(FormasCaminar.DIGITIGRADOS, sexo, nom, edad, nomCien);
  }
  
  public void ladrar() {
    
    System.out.println("Guau!");
  }
  
  public void perseguirArdillas() {
    
    System.out.println(this.getNombre() + " se va corriendo en la distancia a perseguir ardillas");
  }
  
  public void hacerCosasPerros() {
    
    System.out.println(this.getNombre() + " se pone a hacer cosas de perros"); 
  }
}
