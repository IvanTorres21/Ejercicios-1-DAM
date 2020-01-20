
public class Tiempo {
  
  private int hora;
  private int min;
  private int sec;
  
  // Getters
  
  public int getHora() {
    
    return this.hora;
  }
  public int getMin() {
    
    return this.min;
  }
  public int getSec() {
    
    return this.sec;
  }
  
  // Setters
  
  public void setHora(int hora) {
    
    this.hora = hora;
  }
  public void setMin(int min) {
    
    this.min = min;
    this.minToHor();
  }
  public void setSec(int sec) {
    
    this.sec = sec;
    this.secToMin();
  }
  
  // Constructor
  
  public Tiempo(int hora, int min, int sec) {
    
    this.hora = hora;
    this.min = min;
    this.sec = sec;
    this.secToMin();
    this.minToHor();
  }
  
  // Métodos
  
  public String toString() {
    
    return this.hora + "h " + this.min + "m " + this.sec + "s";
  }
  public void secToMin() { //Convierte los segundos extras a minutos
    
    if (this.sec >= 60) {
      
      this.min += this.sec/60;
      this.sec = this.sec%60;
      this.minToHor();
    } else if (this.sec < 0) {
      
      if (this.min <= 0 && this.hora <= 0) { // Si los segundos son negativos y el resto de horas son 0 se pone todo a 0
        
        this.sec = 0;
      } else if (this.min > 0) { //En caso de haya minutos
        
        do {
          
          this.min--;
          this.sec += 60;
        } while (this.sec < 0 && this.min > 0);
        if (this.sec < 0) {
          
          this.sec = 0;
        }
      } else if (this.hora > 0) { //En caso de que no haya minutos pero si horas
        
        this.hora--;
        this.min += 60;
        do {
          
          this.min--;
          this.sec += 60;
        }while (this.min > 0 && this.sec < 0);
      }
    }
  }
  public void minToHor() { //Convierte los minutos extras en horas
    
    if(this.min >= 60) {
      
      this.hora += this.min/60;
      this.min = this.min%60;
    } else if (this.min < 0) {
      
      if (this.hora <= 0) {
        
        this.sec = this.sec - (this.min * -60);
        this.min = 0;
        this.secToMin();
      } else { // En caso de que haya horas libres las convertimos a minutos
        
        do {
          
          this.hora--;
          this.min += 60;
          
        } while(this.min < 0 && this.hora > 0);
        
        if (this.min < 0) { // Si se han acabado las horas libres pero todavia hay minutos negativos
          
          this.sec = this.sec - (this.min * -60);
          this.min = 0;
          this.secToMin();
        }
      }
    }
  }
  public void horToMin() { //En caso de que haya horas negativas
    
    if (this.hora < 0) {
      
      this.min = this.min - (this.hora * -60);
      this.hora = 0;
      this.minToHor();
    }
  }
  
  public void sum(int hora, int min, int sec) {
    
    this.hora += hora;
    this.min += min;
    this.sec += sec;
    this.secToMin();
  }
  public void res(int hora, int min, int sec) {
    
    this.hora -= hora;
    this.min -= min;
    this.sec -= sec;
    this.horToMin();
    this.minToHor();
    this.secToMin();  
  } 
}
