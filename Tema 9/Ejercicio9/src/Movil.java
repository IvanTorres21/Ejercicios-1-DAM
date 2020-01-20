import java.text.DecimalFormat;

public class Movil extends Terminal{

  private String tarifa;
  private double aPagar = 0;
  private DecimalFormat form = new DecimalFormat("#0.00");
  // Getter
  
  public String getTarifa() {
    
    return this.tarifa;
  }
  
  public double getAPagar() {
    
    return this.aPagar;
  }
  
  // Setters
  
  public void setTarifa(String tarifa) {
    
    this.tarifa = tarifa;
  }
  public void setAPagar(double coste) {
    
    this.aPagar += coste; 
  }
  
  // Constructor 
  
  public Movil(String numRef, String tarifa) {
    
    super(numRef);
    this.tarifa = tarifa.toLowerCase();
  }
  
  // Métodos
  
  public String toString() {

    return "Nº " + this.getNumRef() + " - " + this.getTiemConv() + "s de conversación - tarificado " + form.format(this.aPagar) + " euros";
  }
  
  // Métodos
  public void llama(Movil mov, int tiempo) {
    
    mov.setTiemConv(tiempo);
    this.setTiemConv(tiempo);
    double pag = 0;
    if (this.tarifa.equals("rata")) {
      
      pag = 0.06;
    } else if (this.tarifa.equals("mono")) {
      
      pag = 0.12;
    } else if (this.tarifa.equals("bisonte")) {
      
      pag = 0.3;
    }
    pag = pag * ((double) tiempo / (double) 60);
    this.setAPagar(pag);
  }
}
