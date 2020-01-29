/**
 * Clase Caballo
 * @author Iván Torres
 *
 */
public class Caballo {
	
	String numRef;
	String nombre;
	int color;
	char sexo; // H o M
	int edad;
	double altura;
	double peso;
	boolean herrado  = false;
	double velocidad;
	String[] colores = {"Marrón", "Negro", "Marrón Oscuro", "Blanco", "Marrón Claro", "Gris"};
	// Getters
	
	String getNumRef() {
	  
	  return this.numRef;
	}
	String getNombre() {
	  
	  return this.nombre;
	}
	String getColor() {
	  
	  return this.colores[this.color];
	}
	int getEdad() {
	  
	  return this.edad;
	}
	double getAltura() {
	  
	  return this.altura;
	}
	double getPeso() {
	  
	  return this.peso;
	}
	String getSexo() {
	  
	  if (this.sexo == 'H') {
	    
	    return "Hombre";
	  } else  {
	    
	    return "Mujer";
	  }
	}
	String isHerrado() {
	  
	 if (this.herrado) {
	   
	   return "Sí";
	 } else {
	   
	   return "No";
	 }
	}
	
	double getVelocidad() {
	  
	  return this.velocidad;
	}
	//Setters
	
	void setSexo(char s) {
	  
	  this.sexo = s;
	}
	void setNumRef (String numRef) {
	  
	  this.numRef = numRef;
	}
	void setNombre (String nombre) {
	  
	  this.nombre = nombre;
	}
	void setColor(int color) { //Se usa el indice del array de colores, se empieza por 1
	  color--;
	  this.color = color;
	}
	void setEdad(int edad) {
	  
	  this.edad = edad;
	}
	void setAltura(double altura) {
	  
	  this.altura = altura;
	}
	void setPeso(double peso) {
	  
	  this.peso = peso;
	}
	void setVelocidad() { //Usa la altura y peso para asignarle una velocidad máxima
	  double aux;
	  if (peso < 570) {
	    
	    aux = 1;
	  } else if (peso > 700) {
	    
	    aux = 2;
	  } else {
	    
	    aux = 0.5;
	  }
	  if (altura < 1.5) {
	    
	    aux += 1;
	  } else if (altura > 1.7) {
	    
	    aux += 1;
	  }
	  this.velocidad = (Math.random()*((this.peso / 6) / (this.altura * aux))) + 30;
	}
	void setHerradura(char s) {
	  
	  if (s == 's') {
	    
	    this.herrado = true;
	  } else {
	    
	    this.herrado = false;
	  }
	}
	// Métodos
	public void relinchar() {
		
		System.out.print("*inserte sonido de caballo*");
	}
	
	public String correr(Caballo contrincante) {
		
		if (this.velocidad > contrincante.velocidad) {
			
			return this.nombre;
		} else {
			
			return contrincante.nombre;
		}
	}
	
	public void aparear(Caballo pareja, Caballo hijo) {
	  
	    if ((int) Math.random() * 100 > 50) {
	      
	      hijo.setSexo('H');
	    } else {
	      
	      hijo.setSexo('M');
	    }
	    hijo.altura = (Math.random() * 1) + 0.7;
	    hijo.peso = (Math.random() * 100) + 50;
	    hijo.edad = 0;
	    hijo.color = (int) (Math.random() * 6);
	    hijo.setVelocidad();
	}
	
}
