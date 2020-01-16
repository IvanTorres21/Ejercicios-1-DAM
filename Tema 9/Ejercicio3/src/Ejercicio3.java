
public class Ejercicio3 {

  public static void main(String[] args) {
    Canario can = new Canario(0.1, Sexo.HEMBRA, "mimi", 2, "Yo  que se");
    Gato gat = new Gato(Sexo.MACHO, "Garfield", 5, "Ni idea");
    Perro per = new Perro(Sexo.MACHO, "zar", 6, "cani lo que sea");
    Pinguino pin = new Pinguino(0.1, Sexo.HEMBRA, "GAF", 3, "MEh");
    Lagarto lag = new Lagarto(Sexo.MACHO, "FO", 6, "grgr", true);
    
    System.out.println("Datos de lagarto: " + lag);
    System.out.println("Lag va a envenenar a per");
    lag.envenenar(per);
    System.out.println("Datos de per: " + per);
    System.out.println("gat va a maullar");
    gat.Maullar();
  }
}
