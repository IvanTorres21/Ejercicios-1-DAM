/*
* Ejercicio 10, programa que muestra un objeto inanimado con el uso de carácteres especiales y color
*/
public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("\n");
    System.out.printf("%-7s\033[30m██████\n", "");
    System.out.printf("%-5s██\033[31m████\033[97m██\033[30m██\n", "");
    System.out.printf("%-4s█\033[97m██\033[31m████\033[97m████\033[30m█\n", "");
    System.out.printf("%-3s█\033[97m█\033[31m██\033[97m████\033[31m██\033[97m███\033[30m█\n", "");
    System.out.printf("%-2s█\033[31m███\033[97m██████\033[31m█████\033[30m█\n", "");
    System.out.printf("%-2s█\033[31m███\033[97m██████\033[31m██\033[97m██\033[31m█\033[30m█\n", "");
    System.out.printf("%-2s█\033[97m█\033[31m██\033[97m██████\033[31m█\033[97m████\033[30m█\n", "");
    System.out.printf("%-2s█\033[97m██\033[31m██\033[97m████\033[31m██\033[97m████\033[30m█\n", "");
    System.out.printf("%-2s█\033[97m██\033[31m█████████\033[97m██\033[31m█\033[30m█\n", "");
    System.out.printf("%-2s█\033[97m█\033[31m██\033[30m████████\033[31m███\033[30m█\n", "");
    System.out.printf("%-3s███\033[97m██\033[30m█\033[97m██\033[30m█\033[97m██\033[30m███\n", "");
    System.out.printf("%-4s█\033[97m███\033[30m█\033[97m██\033[30m█\033[97m███\033[30m█\n", "");
    System.out.printf("%-4s█\033[97m██████████\033[30m█\n", "");
    System.out.printf("%-5s█\033[97m████████\033[30m█\n", "");
    System.out.printf("%-6s████████\n", "");
 }
}
