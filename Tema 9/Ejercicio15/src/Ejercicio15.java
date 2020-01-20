
public class Ejercicio15 {
  public static void main(String[] args) {
    
    FichaDomino[] ficha = new FichaDomino[8];
    
    // Generamos las 8 fichas
    for (int i = 0; i < 8; i++) { 
      
      ficha[i] = new FichaDomino();
    }
    
    // Nos aseguramos de que encajen
    for (int i = 1; i < 8; i++) {
      
      while(!ficha[i-1].encaja(ficha[i])) {
        
        ficha[i].setVa1();
        ficha[i].setVa2();
      }
      
    }
    
    // Las mostramos
    for (int i = 0; i < 8; i++) {
      
      System.out.print(" " + ficha[i]);
    }
    System.out.println();
  }
}
