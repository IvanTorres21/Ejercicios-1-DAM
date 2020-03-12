import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ej1 {
  public static void main(String[] args) {
    
   try {
     
     
     BufferedWriter br = new BufferedWriter(new FileWriter("primos.txt"));
     String text = "";
     for(int num = 1; num <= 500; num++) {
       
       int divisor = 2;
       float modulo = 0;
       float cociente = 0;
       do {

         modulo = (float) num % (float) divisor;
         cociente = (float) num / (float) divisor;
         divisor++;
       } while (divisor < num && modulo != 0);
       if ((int) modulo != 0 && cociente < divisor) {
           
         text += String.valueOf(num) + "\n";
       }
     }
     System.out.println(text);
     br.write(text);
     br.close();
   } catch(IOException ioe) {
     
     System.out.println("Error de input output...");
   }
  }
}
