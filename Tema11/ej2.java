import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ej2 {
  public static void main(String[] args) {
    
    try {
      
      BufferedReader bf = new BufferedReader(new FileReader("primos.txt"));
      String line = bf.readLine();
      while (line != null) {
        
        System.out.println(line);
        line = bf.readLine();
      }
    } catch(FileNotFoundException fnfe) {
      
      System.out.println("No se ha encontrado el archivo...");
    } catch(IOException ioe) {
      
      System.out.println("No se ha podido leer el archivo...");
    }
  }
}
