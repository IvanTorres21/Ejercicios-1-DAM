
public class Carta {

  private int num;
  private int palo; //1 - bastos, 2 - espada, 3 - copas, 4 - oro
  
  // Getters
  public int getNum() {
    
    return this.num;
  }
  public int getPalo() {
    
    return this.palo;
  }
  // Setters
  public void setNum(int num) {
    
    this.num = num;
  }
  public void setPalo(int pal) {
    
    this.palo = pal;
  }
  
  // Constructor
  public Carta(int num, int palo) {
    
    this.num = num;
    this.palo = palo;
  }
  
  // Métodos
  public String toString() {
    
    String g = "";
    switch(this.num) {
      
      case 1:
        g += "As";
        break;
      case 8:
        g += "Sota";
        break;
      case 9:
        g += "Caballo";
        break;
      case 10:
        g += "Rey";
        break;
      default:
        g += this.num;
    }
    switch(this.palo) {
      
      case 1:
        g += " de bastos";
        break;
      case 2:
        g += " de espadas";
        break;
      case 3:
        g += " de copas";
        break;
      case 4:
        g += " de oro";
        break;
    }
    return g;
  }
}
