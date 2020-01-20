import java.text.DecimalFormat;

public class CuentaCorriente {
  
  private String numRef = ""; //numero de refencia de 10 digitos
  private double saldo = 0;
  DecimalFormat form = new DecimalFormat("#0.00");
  // Getter
  public String getNumRef() {
    
    return this.numRef;
  }
  public double getSaldo() {
    
    return this.saldo;
  }
  
  // Setter
  
  public void setNumRef() {
    
    for (int i = 0; i < 10; i++) {
      
      this.numRef += ((int) (Math.random() * 10));
    }
  }
  
  public void setSaldo(double saldo) {
    
    this.saldo = saldo;
  }
  
  // Constructor
  
  public CuentaCorriente() {
    
    this.setNumRef();
  }
  public CuentaCorriente(double saldo) {
    
    this.setNumRef();
    this.setSaldo(saldo);
  }
  
  // Métodos
  
  public String toString() {
    
    return "Número de cta: " + this.getNumRef() + " Saldo: " + form.format(this.getSaldo()) + " €";

  }
  
  public void ingreso(double ing) {
    
    this.saldo += ing;
  }
  
  public void cargo(double gas) {
    
    this.saldo -= gas;
  }
  
  public void transferencia(CuentaCorriente cc, double tran) {
    
    this.saldo -= tran;
    cc.saldo += tran;
  }
}
