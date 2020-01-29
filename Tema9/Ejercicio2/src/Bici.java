
public class Bici extends Vehiculo{

  String numRef;
  
  // To String
  
  public String toString() {
    
    return super.toString() + "\nNúmero Referencia: " + this.getNumRef();
  }
  // Setter
  
  public void setNumRef(String ref) {
    
    this.numRef = ref;
  }
  
  // Getter 
  
  public String getNumRef() {
    
    return this.numRef;
  }
  // Constructor
  
  public Bici (String ref) {
   
    this.setNumRef(ref);
    numVehi++;
  }
  
  public Bici (String ref, float km) {
    
    this.setNumRef(ref);
    this.setKmRec(km);
    numVehi++;
  }
 
  // Métodos
  
  public void hacerCaballito() {
    
    System.out.println("Haces un caballito!");
  }
}
