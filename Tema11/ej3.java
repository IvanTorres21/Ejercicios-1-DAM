import FileManager.Code;

public class ej3 {
  public static void main(String[] args) {
    
    if (args[2] == null) {
      
      System.out.println("Tiene que introducir el nombre de los archivos de la siguiente manera:");
      System.out.println("ej3 filename1 filename2 fusedName");
    } else {
      
      Code.fuseFiles(args[0], args[1], args[2]);
    }
  }
}
