/**
 * -- Ejercicio 1
 * Crea la clase caballo y incluye metodos a la misma
 * @author Iván Torres
 */
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
	  Scanner s = new Scanner(System.in);
	  int opt;
	  int cab1;
	  int cab2;
	  Caballo[] a = new Caballo[30];
	  int ref = 0; //Caballo actual
	  do {  
  		System.out.println("¿Qué quieres hacer? (1,2,3,4)");
  		System.out.println("1- Dar de alta a un caballo (max 30)");
  		System.out.println("2- Ver datos de un caballo");
  		System.out.println("3- Aparear a dos caballos");
  		System.out.println("4- Hacer una carrera");
  		opt = Integer.parseInt(s.nextLine());
  		switch (opt) {
  		  case 1:
  		    if (ref < 30) {
  		      
  		      darAltaCaballo(a, ref, s);
  		      ref++;
  		    } else {
  		      
  		      System.out.println("No se puede dar de alta a más Caballos!");
  		    }
  		    break;
  		  case 2:
  		    
  		    if (ref > 0) {
  		      
  		      mostrarCaballos(a, ref);
  		      System.out.print("¿De que caballo? (1, 2 ,3, ...): ");
  		      opt = Integer.parseInt(s.nextLine());
  		      opt--;
  		      if (opt <= ref) {
  		        mostrarDatosCaballo(a, opt);
  		      } else {
  		        
  		        System.out.println("Caballo no valido!");
  		      }
  		    } else {
  		      
  		      System.out.println("No hay caballos dados de alta!");
  		    }
  		    break;
  		  case 3:
  		    mostrarCaballos(a, ref);
  		    System.out.print("¿Que caballos? (separa su número por un espacio Ej: 2 1): ");
  		    cab1 = s.nextInt();
  		    cab2 = s.nextInt();
  		    s.nextLine();
  		    cab1--;
  		    cab2--;
  		    if (cab1 < ref && cab2 < ref && cab1 != cab2 && a[cab1].sexo != a[cab2].sexo) {
  		      
  		      a[ref] = new Caballo();
  		      aparearCaballos(a, cab1, cab2, ref, s);
  		      ref++;
  		      
  		    } else {
  		      
  		      System.out.println("Caballos no validos!");
  		    }
  		    break;
  		  case 4:
  		    mostrarCaballos(a, ref);
          System.out.print("¿Que caballos? (separa su número por un espacio Ej: 2 1): ");
          cab1 = s.nextInt();
          cab2 = s.nextInt();
          s.nextLine();
          cab1--;
          cab2--;
          if (cab1 < ref && cab2 < ref && cab1 != cab2) {
            
            System.out.println("¡Ha ganado " + a[cab1].correr(a[cab2]) + "!");
            
          } else {
            
            System.out.println("Caballos no validos!");
          }

  		  case 5:
  		    break;
  		  default:
  		    
  		    System.out.println("Opción no valida, intentalo de nuevo");
  		    break;
  		}
	  } while(opt != 5);
	}
	
	public static void darAltaCaballo(Caballo[] a, int ref, Scanner s) {
	  
	  a[ref] = new Caballo();
	  System.out.print("Como quieres que se llame: ");
	  a[ref].setNombre(s.nextLine());
	  System.out.print("¿Cuanto mide?: ");
	  a[ref].setAltura(Double.parseDouble(s.nextLine()));
	  System.out.print("¿Cuanto pesa?: ");
	  a[ref].setPeso(Double.parseDouble(s.nextLine()));
	  System.out.println("¿Que color es? (1, 2, 3 ,4, ...)");
	  for (int i = 0; i < 6; i++) {
	    
	    System.out.println((i+1) + "- " + a[ref].colores[i]);
	  }
	  a[ref].setColor(Integer.parseInt(s.nextLine()));
	  System.out.print("¿Tiene herradura? (s/n)");
	  a[ref].setHerradura((s.nextLine().toLowerCase()).charAt(0));;
	  System.out.print("¿Cuántos años tiene?: ");
	  a[ref].setEdad(Integer.parseInt(s.nextLine()));
	  System.out.print("Cual es su numero de referencia (Ej: 00001, 00002, 0003): ");
	  a[ref].setNumRef(s.nextLine());
	  System.out.print("Es hombre (H) o mujer (M)?: ");
	  a[ref].setSexo((s.nextLine().toUpperCase()).charAt(0));;
	  a[ref].setVelocidad();
	}
	
	public static void mostrarDatosCaballo(Caballo[] a, int ref) {
	  
	  System.out.println("Datos de " + a[ref].getNombre());
	  System.out.println("Número de ref: " + a[ref].getNumRef());
	  System.out.println("Edad: " + a[ref].getEdad());
	  System.out.println("Genero: " + a[ref].getSexo());
	  System.out.printf("Altura: %.2f\n", a[ref].getAltura());
	  System.out.printf("Peso: %.2f\n", a[ref].getPeso());
	  System.out.printf("Velocidad: %.2f\n", a[ref].getVelocidad());
	  System.out.println("Color: " + a[ref].getColor());
	}
	
	public static void mostrarCaballos(Caballo[] a, int ref) {
	  
	  System.out.println("REFERENCIA: " + ref);
	  for (int i = 0; i < ref; i++) {
	    
	    System.out.println((i+1) + "- " + a[i].getNombre());
	  }
	}
	public static void aparearCaballos(Caballo[] a, int cab1, int cab2, int ref, Scanner s) {
	  
	    System.out.print("¿Como quieres que se llame el hijo?: ");
	    a[ref].setNombre(s.nextLine());
	    System.out.print("¿Cuál va a ser su número de referencia?: ");
	    a[ref].setNumRef(s.nextLine());
	    a[cab1].aparear(a[cab2], a[ref]);
	  }
}
