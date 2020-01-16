
public class Canario extends Ave{

  // Constructor

  public Canario(double emb, Sexo sexo, String nom, int edad, String nomCien) {
    
    super(emb, FormaPico.GRANIVORO, sexo, nom, edad, nomCien);
  }
  
  // Métodos
  
  public void piar() {
    
    System.out.println("Pio pio");
  }
  public void serPequeño() {
    
    System.out.println("Soy pequeño");
  }
}
