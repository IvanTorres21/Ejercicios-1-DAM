
public class Moneda {

  private int valor;
  private String lado;
  
  // Getters
  public int getValor() {
    
    return valor;
  }
  public String getLado() {
    
    return lado;
  }
  
  // Setters
  public void setValor(int i) {
    
    this.valor = i;
  }
  public void setLado(String lado) {
    
    this.lado = lado;
  }
  
  // Constructor
  
  public Moneda() { //Constructor para la primera moneda
    
    int[] valor = {1, 2, 5, 10, 20, 100, 200};
    this.valor = valor[(int) (Math.random() * 7)];
    String[] lado = {"Cara", "Cruz"};
    this.lado = lado[(int) (Math.random()*2)];
  }
  public Moneda(Moneda anterior) { //Constructor en base a la moneda anteriormente creada
    
    if(Math.random() > 0.5) {
      
      this.lado = anterior.lado;
      int[] valor = {1, 2, 5, 10, 20, 100, 200};
      this.valor = valor[(int) (Math.random() * 7)];
    } else {
      
      this.valor = anterior.valor;
      String[] lado = {"Cara", "Cruz"};
      this.lado = lado[(int) (Math.random()*2)];
    }
  }
  
  // Métodos
  public String toString() {

    String moneda = "[";
    if (this.valor >= 100) {
      
      moneda += this.valor/100 + " euros]";
    } else {
      
      moneda += this.valor + " centimos]";
    }
    moneda += " (" + this.lado + ")";
    return moneda;
  }
}
