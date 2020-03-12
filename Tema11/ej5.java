import FileManager.Code;
/**
 * Programa que elimina los comentarios del codigo java
 * @author ivant
 *
 */
public class ej5 {
  public static void main(String[] args) {
    
    /*
     * Esto tambien sirve para probar que funcione bien, por eso está lleno de comentarios
     * Para ver si es correcto voy a llenar el código de comentarios...
     */
    if (args[1] == null) {
      //Un comentario más
      System.out.println("Parameters are missing! Expected 2 parameters..."); //Otro comentario
    } else { //Maravillo comentario
      
      Code.commentRemover(args[0], args[1]);
    }
  }
}
