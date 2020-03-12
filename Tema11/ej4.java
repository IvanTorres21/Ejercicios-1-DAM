import FileManager.Code;

public class ej4 {
  public static void main(String[] args) {
    
    if (args[0] == null) {
      
      System.out.println("The program was expecting a parameter!");
      System.out.println("EJ: java ej4 nombre");
    } else {
      
      Code.sortWords(args[0]);
    }
  }
}
