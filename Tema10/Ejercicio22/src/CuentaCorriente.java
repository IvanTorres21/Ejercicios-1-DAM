import java.util.ArrayList;
import java.text.DecimalFormat;

public class CuentaCorriente {
  
  private String numRef = ""; //numero de refencia de 10 digitos
  private double saldo = 0;
  private ArrayList<String> movimientos = new ArrayList<String>();
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
public CuentaCorriente(int saldo) {
    
    this.setNumRef();
    this.setSaldo(saldo);
  }
  
  // Métodos
  
  public String toString() {
    
    return "Número de cta: " + this.getNumRef() + " Saldo: " + form.format(this.getSaldo()) + " €";

  }
  public void ingreso(double ing) {
    
    this.saldo += ing;
    this.movimientos.add("Ingreso de " + form.format(ing) + " | Saldo: " + this.saldo);
  }
  
  public void cargo(double gas) {
    
    this.saldo -= gas;
    this.movimientos.add("Cargo de " + form.format(gas) + " | Saldo: " + this.saldo);
  }
  
  public void transferencia(CuentaCorriente cc, double tran) {
    
    this.saldo -= tran;
    this.movimientos.add("Transf emitida de " + form.format(tran) + " a la cuenta: " + cc.numRef + " | Saldo: " + this.saldo);
    cc.saldo += tran;
    cc.movimientos.add("Transf recibida de " + form.format(tran) + " de la cuenta: " + this.numRef + " | Saldo: " + cc.saldo);
  }
  public void movimientos() {
    
    for (String mov : this.movimientos) {
     
      System.out.println(mov);
    }
  }
}
