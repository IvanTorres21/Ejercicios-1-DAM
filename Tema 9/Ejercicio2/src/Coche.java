 public class Coche extends Vehiculo{
    
    
    String matricula;
    String marca;
    
    // To String
    
    public String toString() {
      
      return super.toString() + "\nMatrícula: " + this.getMatr() + "\nMarca: " + this.getMarca();
    }
    // Getters
    
    String getMatr() {
      
      return this.matricula;
    }
    
    String getMarca() {
      
      return this.marca;
    }
    
    //Setters
    
   
    void setMat(String mat) {
      
      this.matricula = mat;
    }
    void setMar(String mar) {
      
      this.marca = mar;
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
    
    // Métodos
    
    public void quemarNeumaticos() {
      
     if(this.getDur() > 0) {
       
       this.setDur(((Math.random() * 10) + 5));
       System.out.println("Te pones a quemar neumáticos, reduciendo la vida de los mismos");
       System.out.printf("Durabilidad actual: %.2f%c", this.getDur(), '%');
     } else {
       
       System.out.println("Tienes los neumáticos reventados!");
     }
    }
    

  }