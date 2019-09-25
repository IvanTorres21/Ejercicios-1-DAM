/**
* Ejercicio 5, Programa que muestra el horario de clase de 1 DAM 19/20 con colores.
*/
public class Ejercicio05 {
  public static void main(String[] args) {

    System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes");
    System.out.println("──────────────────────────────────────────────────");
    System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "\033[96mPRO", "\033[95mEDD", "\033[96mPRO", "\033[96mPRO", "\033[94mSINF");
    System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "\033[96mPRO", "\033[93mLM", "\033[96mPRO", "\033[96mPRO", "\033[94mSINF");
    System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "\033[96mPRO", "\033[93mLM", "\033[96mPRO", "\033[95mEDD", "\033[94mSINF");
    System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "\033[92mBBDD", "\033[94mSINF", "\033[92mBBDD", "\033[95mEDD", "\033[91mFOL");
    System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "\033[92mBBDD", "\033[94mSINF", "\033[92mBBDD", "\033[93mLM", "\033[91mFOL");
    System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "\033[92mBBDD", "\033[94mSINF", "\033[92mBBDD", "\033[93mLM", "\033[91mFOL");
  }
}



