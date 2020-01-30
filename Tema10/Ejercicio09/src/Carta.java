
public class Carta implements Comparable<Carta>{

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
  public int compareTo(Carta g) {
    
    if (this.palo == g.palo ) {
      
      if (this.num > g.num) {
        
        return 1;
      } else if (this.num < g.num){
        
        return -1;
      } else {
        
        return 0; // Estado que no debería alcanzar nunca
      }
    } else if (this.palo > g.palo) {
      
      return 1;
    } else {
      
      return -1;
    }
  }
  public boolean equals(Carta g) {
    
    if (this.num == g.num && this.palo == g.palo) {
      
      return true;
    } else {
      
      return false;
    }
  }
}
