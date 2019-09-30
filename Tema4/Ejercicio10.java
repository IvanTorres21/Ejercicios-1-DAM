import java.util.Scanner;

/**
 * Programa que dice tu horoscopo en base al día y mes en el que naciste
 * @author Iván Torres
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Dime el día y el número del mes en el que naciste separado por un espacio: ");
    int dia = s.nextInt();
    int mes = s.nextInt();
    boolean datosCorrectos = false; //Para evitar escribir dos veces el código del horóscopo
    if (mes <= 0 || mes >= 13) {
      
      System.out.print("\nEl mes tiene que ser entre 1 y 12");
    } else if (dia < 0 || dia > 31) {
      
      System.out.print("\nNo existe ese día");
      
    } else if (mes == 2 && dia > 29) {
      
      System.out.print("\nFebrero no tiene más de 29 días como mucho");
      
    } else if (dia == 31) {
      
      switch (mes) {
        
        case 4:
        case 6:
        case 9:
        case 11:
        
          System.out.printf("El mes %d no tiene 31 días", mes);
          break;
          
        default:
        
          break;
      }
    } else if (dia == 30) {
      
      switch (mes) {
        
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        
          System.out.printf("El mes %d no tiene 30 días", mes);
          break;
          
        default:
        
          break;
      }
    } else {
      
      datosCorrectos = true;
      
    }
    if (datosCorrectos == true) {
      
      String horoscopo = "";
      switch (mes) {
        
        case 1:
        
          if (dia < 21) {
            
            horoscopo = "Capricornio";
          
          } else {
          
            horoscopo = "Acuario";
          
          }
          break;
      
        case 2:
      
          if (dia < 19) {
          
            horoscopo = "Acuario";
          
          } else {
          
            horoscopo = "Piscis";
          
          }
          break;
        
        case 3:
      
          if(dia < 21) {
          
            horoscopo = "Piscis";
          
          } else {
          
            horoscopo = "Aries";
          
          }
          break;
        
        case 4:
        
          if (dia < 21) {
          
            horoscopo = "Aries";
          
          } else {
          
            horoscopo = "Tauro";
          
          }
          break;
        
        case 5:
      
          if (dia < 21) {
          
            horoscopo = "Tauro";
          
          } else {
          
            horoscopo = "Géminis";
          
          }
          break;
        
        case 6:
      
          if (dia < 21) {
          
            horoscopo = "Géminis";
          
          } else {
          
            horoscopo = "Cáncer";
          
          } 
          break;
        
        case 7:
      
          if (dia < 23) {
          
            horoscopo = "Cáncer";
          
          } else {
          
            horoscopo = "Leo";
          
          }
          break;
        
        case 8:
      
          if (dia < 24) {
          
            horoscopo = "Leo";
          
          } else {
          
            horoscopo = "Virgo";
          
          }
          break;
        
        case 9:
        
            if (dia < 24) {
            
              horoscopo = "Virgo";
            
            } else {
            
              horoscopo = "Libra";
            
            }
            break;
        
        case 10:
        
          if (dia < 23) {
          
            horoscopo = "Libra";
          
          } else {
          
            horoscopo = "Escorpio";
          
          }
          break;
        
        case 11:
      
          if (dia < 22) {
            
            horoscopo = "Escorpio";
          
          } else {
          
            horoscopo = "Sagitario";
          
          }
          break;
        
        case 12:
      
          if (dia < 23) {
          
            horoscopo = "Sagitario";
          
          } else {
          
            horoscopo = "Capricornio";
          
          }
          break;
      }
      
      System.out.printf("\nTu signo del horóscopo es: %s", horoscopo);
    }
  }
}
