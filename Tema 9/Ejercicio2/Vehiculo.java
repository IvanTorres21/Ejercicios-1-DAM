
public abstract class Veh�culo {
  
  static double kmTotales = 0;
  static int numVehi = 0;
  
  public class Coche {
    
    double kmRecorridos = 0;
    String matricula;
    String marca;
    double durNeum = 100; //Durabilidad de los neum�ticos
    // Getters
    double getKmRec() {
      
      return this.kmRecorridos;
    }
    
    String getMatr() {
      
      return this.matricula;
    }
    
    String getMarca() {
      
      return this.marca;
    }
    
    double getDur() {
      
      return this.durNeum;
    }
    //Setters
    
    void setKmRec(double km) {
      
      this.kmRecorridos += km;
      kmTotales += km;
    }
    void setMat(String mat) {
      
      this.matricula = mat;
    }
    void setMar(String mar) {
      
      this.marca = mar;
    }
    void setDur (double dur) {
      
      this.durNeum -= dur;
    }
    //Constructor
    
    public Coche (String mat, String mar) {
      
      this.setMat(mat);
      this.setMar(mar);
      numVehi++;
    }
    
    public Coche (String mat, String mar, float km) {
      
      this.setMat(mat);
      this.setMar(mar);
      this.setKmRec(km);
      numVehi++;
    }
    
    // M�todos
    
    public void quemarNeumaticos() {
      
     this.setDur(((Math.random() * 10) + 5));
     System.out.println("Te pones a quemar neum�ticos, reduciendo la vida de los mismos");
     System.out.printf("Durabilidad actual: %.2f%", this.getDur());
    }
    
    public void recorrerKm(double km) {
      
      this.setDur(Math.random() * 5);
      System.out.printf("Avanzas por la carretera %.0fkm\n", km);
      System.out.printf("Has desgastado los neum�ticos un %.2f", this.getDur());
      this.setKmRec(km);
    }
  }
  
  public class Bici {
    
    float kmRecorridos = 0;
    String marca;
    String numRef;
  }
}
