
public abstract class Vehiculo{
  
  static double kmTotales = 0;
  static int numVehi = 0;
  double kmRecorridos = 0;
  double durNeum = 100; //Durabilidad de los neumaticos
  
  
  // To String
  
  public String toString() {
    
    return "Km Recorridos: " + this.getKmRec() + "\nDuraci�n Neum�ticos: " + this.getDur();
  }
  // Setters
  void setKmRec(double km) {
    
    this.kmRecorridos += km;
    kmTotales += km;
  }
  void setDur (double dur) {
    
    this.durNeum -= dur;
  }
  
  // Getters
  double getDur() {
    
    return this.durNeum;
  }
  
  double getKmRec() {
    
    return this.kmRecorridos;
  }
  
  public static double getKmTot() {
    
    return kmTotales;
  }
  public static int getNumVehi() {
    
    return numVehi;
  }
  
  // M�todos
  public void recorrerKm(double km) {
    
    if (this.getDur() > 0) {
      
      this.setDur(Math.random() * 5);
      System.out.printf("Avanzas un total de %.0fkm\n", km);
      System.out.printf("Duraci�n de los neum�ticos un %.2f%c", this.getDur(), '%');
      this.setKmRec(km);
      if (this.getDur() <= 0) {
        
        System.out.println("\nTe han reventado los neum�ticos!");
      }
    } else {
      
      System.out.println("Tienes los neum�ticos reventados, no puedes avanzar!");
    }
  }
}