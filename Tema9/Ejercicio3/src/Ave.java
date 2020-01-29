
public abstract class Ave extends Animal{

  private double embergadura;
  private FormaPico formaPico;
  
  // Getter
  
  public double getEmbergadura() {
    
    return this.embergadura;
  }
  
  public String getFormaPico() {
    
    return this.formaPico.toString();
  }
  
  // Setter
  
  public void setEmbergadura(double emb) {
    
    this.embergadura = emb;
  }
  
  public void setFormaPico(FormaPico form) {
    
    this.formaPico = form;
  }
  
  // Constructor
  
  public Ave(double emb, Sexo sexo, String nom, int edad, String nomCien) {
    
    super(sexo, nom, edad, nomCien);
    this.embergadura = emb;
    this.formaPico = formaPico.GENERALISTA;
  }
  public Ave(double emb, FormaPico form, Sexo sexo, String nom, int edad, String nomCien) {
    
    super(sexo, nom, edad, nomCien);
    this.embergadura = emb;
    this.formaPico = form;
  }
  
  // M�todos
  
  public void comer(String comida) {
    
    switch(this.formaPico) {
    
      case GENERALISTA:
        
        System.out.println("�Que rico!");
        break;
      case INSECTIVORO:
        if (comida.equals("insectos")) {
          
          System.out.println("�Que rico!");
        } else {
          
          System.out.println("Yo no como eso!");
        }
        break;
      case GRANIVORO:
        if (comida.equals("grano")) {
          
          System.out.println("�Que rico!");
        } else {
          
          System.out.println("Yo no como eso!");
        }
        break;
      case NECTARIVORO:
        if (comida.equals("nectar")) {
          
          System.out.println("�Que rico!");
        } else {
          
          System.out.println("Yo no como eso!");
        }
        break;
      case FRUGIVORO:
        if (comida.equals("fruta")) {
          
          System.out.println("�Que rico!");
        } else {
          
          System.out.println("Yo no como eso!");
        }
        break;
      default:
    }
  }
  public void volar() {
    
    System.out.println(this.getNombre() + " se va volando");
  }
}
