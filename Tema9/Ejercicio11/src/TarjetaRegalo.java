import java.text.DecimalFormat;

public class TarjetaRegalo {

  private int numRef;
  private double saldo;
  private DecimalFormat form = new DecimalFormat("#0.00"); //Formato para el saldo
  
  // Getter
  
  public int getNumRef() {
    
    return this.numRef;
  }
  public double getSaldo() {
    
    return this.saldo;
  }
  
  // Setter
  
  public void setNumRef() {
    
    this.numRef = (int) (Math.random() * 89999) + 10000;
  }
  
  public void setSaldo(double saldo) {
    
    this.saldo = saldo;
  }
  
  // Constructor
  
  public TarjetaRegalo(double saldo) {
    
    this.setNumRef();
    this.setSaldo(saldo);
  }
  
  // Métodos
  
  public String toString() {
    
   return "Tarjeta nº " + this.getNumRef() + " - Saldo " + form.format(this.saldo) + "€";
  }
  
  public void gasta(double gasto) {
    
    if (this.saldo >= gasto) {
      
      this.saldo -= gasto;
    } else {
      
      System.out.println("No tiene suficiente saldo para gastar " + form.format(gasto));
    }
  }
  
  public TarjetaRegalo fusionaCon(TarjetaRegalo tr) {
    
    
    TarjetaRegalo tAux =  new TarjetaRegalo(this.saldo + tr.saldo);
    this.saldo = 0;
    tr.saldo = 0;
    return tAux;
  }
}
