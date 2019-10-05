import java.util.Scanner;

/**
 * Programa que calcula el salario de un programador.
 * @author Iván Torres
 */
public class Ejercicio24 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("1 - Programador Junior");
    System.out.println("2 - Prog. Senior");
    System.out.println("3 - Jefe de proyecto");
    System.out.print("Introduzca el cargo del empleado (1-3): ");
    int cargoEmpl = Integer.parseInt(s.nextLine());
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    int diasViaj = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estadoCiv = Integer.parseInt(s.nextLine());
    
    double sueldoBase = 0;
    switch (cargoEmpl) {
      
      case 1:
        
        sueldoBase = 950;
        break;
      case 2:
        
        sueldoBase = 1200;
        break;
      case 3:
      
        sueldoBase = 1600;
        break;
    }
    
    double dietas = diasViaj * 30;
    
    double irpf = 0;
    if (estadoCiv == 1) {
      
      irpf = 25;
    } else {
      
      irpf = 20;
    }
    
    double sueldoBruto = sueldoBase + dietas;
    double irpfAplicado = sueldoBruto * (irpf/100);
    System.out.print("\n---------------------------------");
    System.out.printf("\n| Sueldo base%-12s%.2f", "", sueldoBase);
    System.out.printf("\n| Dietas ( %d viajes)%-7s%.2f", diasViaj, "", dietas);
    System.out.printf("\n|--------------------------------");
    System.out.printf("\n| Sueldo bruto%-11s%.2f", "", sueldoBruto);
    System.out.printf("\n| Retencion IRPF (%.0f)%-5s%.2f", irpf, "", irpfAplicado);
    System.out.printf("\n|--------------------------------");
    System.out.printf("\n| Sueldo neto%-13s%.2f", "", sueldoBruto - irpfAplicado);
    System.out.printf("\n--------------------------------");
      
  }
}
