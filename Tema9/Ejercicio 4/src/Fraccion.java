
public class Fraccion {

  long num;
  long den;
  
  
  // Getters
  public void setNum(long num) {
    
    this.num = num;
  }
  public void setDen(long den) {
    
    this.den = den;
  }
  // Setters
  
  public long getNum() {
    
    return this.num;
  }
  
  public long getDen() {
    
    return this.den;
  }
  // Constructor
  public Fraccion(long num, long den) {
    
    this.setNum(num);
    this.setDen(den);
  }
  // toString
  
  public String toString() {
    
    return this.getNum() + "/" + this.getDen();
  }
  // Métodos
  public void invertir() {
    
    long aux = this.getNum();
    this.setNum(this.getDen());
    this.setDen(aux);
    System.out.println(this);
  }
  public void simplificar() {
    
    int numSim = 2;
    boolean encontrado = false;
    
    for (int i = 2;(i <= this.num || i <= this.den) && !encontrado; i++) {
      
      if (this.getDen()%i == 0 && this.getNum() % i == 0) {
        
        numSim = i;
        encontrado = true;
      }
    }
    if (encontrado) {
      
      this.setNum(this.getNum()/numSim);
      this.setDen(this.getDen()/numSim);
      System.out.println(this);
    } else {
      
      System.out.println("Esta fracción no se puede simplificar");
    }
  }
  public void multiplicar(Fraccion frac) {
    
    long num = this.getNum() * frac.getNum();
    long den = this.getDen() * frac.getDen();
    System.out.println("Resultado: " + num + "/" + den);
  }
  public void dividir(Fraccion frac) {
    
    long num = this.getNum() * frac.getDen();
    long den = this.getDen() * frac.getNum();
    System.out.println("Resultado: " + num + "/" + den);
  }
}

