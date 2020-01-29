
public class Pinguino extends Ave{

  // Constructores
 public Pinguino(double emb, Sexo sexo, String nom, int edad, String nomCien) {
    
    super(emb, sexo, nom, edad, nomCien);
  }
  public Pinguino(double emb, FormaPico form, Sexo sexo, String nom, int edad, String nomCien) {
    
    super(emb, form, sexo, nom, edad, nomCien);
  }
  
  public void hacerRuido() {
    
    System.out.println("*Insertar sonido de pingüino");
  }
  @Override
  public void volar() {
    
    System.out.println("No puedo volar");
  }
}
