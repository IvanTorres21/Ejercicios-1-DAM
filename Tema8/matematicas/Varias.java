
package matematicas;

/**
 * Funciones de manejo de números y matemáticas general.
 * @author Iván Torres
 */
public class Varias {

  /**
   * Función que da la potencia de un número entero usando
   * una base y un exponente
   * 
   * @param b el número que va a ser potenciado
   * @param e el exponente por el que la base va a ser potenciada
   * @return el número potenciado
   */
  public static long potencia(long b, int e) {
    
    long pot;
    if (e != 0) {
      
      pot = b;
    } else {
      
      return 1; //En caso de que se eleve algo a 0 el resultado será 1
    }
    for (int i = 1; i < e; i++) {
      
      pot *= b;
    }
    return pot;
  }
  /**
   * Funcion que devuelve el número de digitos que tiene un número entero
   * 
   * @param x el número cuyos dígitos van a ser contados
   * @return la cantidad de dígitos del número
   */
  public static int digitos(long x) {
    
    if (x < 0) {
      x = -x;
    }
    String num = String.valueOf(x);
    int n = num.length();
    return n;
  }
  /**
   * Función que le da la vuelta a un número entero largo
   * @param x Número al que se le va a dar la vuelta
   * @return  Número ya dado la vuelta, valor positivo siempre. Si x es de un dígito devuelve -1 
   */
  public static long voltea(long x) {
    
    if (x < 0) { //Lo pasamos a positivo si es negativo
      
      x = -x;
    }
    String num = String.valueOf(x); //Lo pasamos a String para que sea más sencillo.
    String num2 = "";
    for (int i = num.length() -1 ; i >= 0; i--) {
          
        if(num.charAt(i) != '-' && num.charAt(i) != '+') {
          
          num2 += num.charAt(i);
        }
      }
    x = Long.parseLong(num2);
    return x;
  }
  /**
   * Función que comprueba si un entero largo es capicua o no
   * @param x Un entero largo que va a ser comprobado
   * @return True si es capicua, false si no lo es.
   */
  public static boolean esCapicua(long x) {
    
    long volteado = voltea(x);
    if (x == volteado && digitos(x) > 1) {
      
      return true;
    }
    return false;
  }
  /**
   * Función que devuelve el valor de un dígito en una posición n
   * @param x Número en el que se quiere encontrar el dígito
   * @param posDig Posición del dígito, empezando en 1 y va desde izquierda a derecha.
   * @return El valor del dígito o -1 si es menor que 1 o mayor que la cantidad de dígitos
   */
  public static long digitoN(long x, int posDig) {
    
    int numDig = digitos(x);
    if (numDig < posDig || posDig < 1) {
      
      return -1;
    }
    long dig = x / potencia(10, (numDig-posDig));
    dig = dig - ((x/potencia(10, (numDig-posDig+1))) * 10);
    return dig; 
  }
  /**
   * Función que devuelve la posición de un dígito dentro de un entero largo
   * @param x EL número en el que se va a buscar el dígito
   * @param dig El dígito a buscar
   * @return Devuelve la posicón empezando desde 1 desde la derecha, si el dígito no está devuelve -1 
   */
  public static int posDigito(long x, int dig) {
    
    int pos = -1;
    int numDig = digitos(x);
    do {
      int digAct = (int) (x / potencia(10, numDig-1));
      digAct = digAct - (int) (x / potencia(10, numDig)*10);
      if (digAct == dig) {
        pos = numDig;
      }
      numDig--;
    } while (numDig > 0 && pos == -1);
    return pos;
  }
  /**
   * Función que quita el último dígito de un entero largo
   * @param x Entero a modificar
   * @param dig Cantida de dígitos a quitar
   * @return El entero con el último dígito eliminado, si es de un solo dígito devuelve -1 
   */
  public static long quitaDetras(long x, int dig) {
    
    if (digitos(x) == 1) {
      
      return -1;
    }
    return x/potencia(10, dig);
  }
  /**
   * Función que quita el primer dígito de un entero largo
   * @param x Entero a modificar
   * @param dig Cantidad de dígitos a quitar
   * @return El entero con el primer dígito eliminado, si es de un solo dígito devuelve -1.
   */
  public static long quitaDelante(long x, int dig) {
    
    int numDig = digitos(x);
    if (digitos(x) == 1) {
      
      return -1;
    }
    long num = x / potencia(10, (numDig-dig));
    num = num * potencia(10, numDig-dig);
    num = x - num;
    return num;
  }
  /**
   * Función que junta dos número enteros
   * @param num1 El primer número, será la parte mayor
   * @param num2 El segundo número, será la parte menor
   * @return Los dos números juntos
   */
  public static long juntaNumeros(long num1, long num2) {
    
    int dig2 = digitos(num2);
    long num = num1 * potencia (10, dig2) + num2;
    return num;
  }
  /**
   * Función que añade un número por detrás (las unidades) a otro
   * @param num El número al que se le va a añadir
   * @param dig El número que se va a añadir
   * @return El número con el dígito ya añadido
   */
  public static long pegaDetras(long num, int dig) {
    
    return juntaNumeros(num, dig);
  }
  /**
   * Función que añade un número por delante a otro
   * @param num El número al que se le va a añadir
   * @param dig El número que se va a añadir
   * @return El número con el dígito ya añadido
   */
  public static long pegaDelante(long num, int dig) {
    
    return juntaNumeros(dig, num);
  }
  /**
   * Función que devuelve un trozo de número dentro de un entero
   * @param num Número del que se va a sacar el trozo
   * @param posIni Posición inicial del trozo (izquierda derecha, desde 1)
   * @param posFin Posición final del trozo (izquierda derecha, desde 1)
   * @return Trozo entre las dos posiciones, devuelve -1 si las posiciones son más grandes que la cantidad de dígitos
   */
  public static long trozoNumero(long num, int posIni, int posFin) {
    
    if (digitos(num) < posFin || digitos(num) < posIni || posIni > posFin) {
      
      return -1;
    }
    long num1 = quitaDelante(num, posIni);
    num1 = quitaDetras(num1, (digitos(num) - posFin));
    return num1;
  }
  /**
   * Función que comprueba si un número es primo
   * @param num Número a comprobar si es primo
   * @return True si es primo, false si no lo es.
   */
  public static boolean esPrimo(long num) {
    
    int x = 2;
    do {
      
      if ((double)num % (double)x == 0) {
        
        return false;
      }
      x++;
    }while (x < num);
    return true;
  }
  /**
   * Función que busca el primer primo desde un número
   * @param num Número desde el que se empieza a buscar
   * @return Valor primo más próximo (mayor que num)
   */
  public static long sigPrimo(long num) {
    
    do {
      
      num++;
    } while (!esPrimo(num));
    
    return num;
  }
  /**
   * Función que pasa un número en base x a base 10
   * @param num Número en base x
   * @return Número en
   */
  public static long binarioDecimal(long num) {
    
    int exponente = 1;
    long res = 0;
    do {
      
      res +=  (digitoN(num, (digitos(num) - exponente)) * potencia(2, exponente));
      exponente++;
    } while (exponente < digitos(num));
    return res;
  }
  /**
   * Función que pasa de números decimales a binarios
   * @param num Número en decimal a convertir
   * @return número en binario
   */
  public static long decimalBinario(long num) {
    
    long res = 0;
    long aux = num;
    int numDig = 0;
    do {
      
      aux = aux / 2;
      numDig++;
    } while (aux >= 1);
    int exponente = numDig;
    do {
        
      res += ((num % 2) * potencia(10, exponente));
      num = num/2;
      exponente--;
    }while (num >= 1);
    res = voltea(res);
    if (digitos(res) != numDig) { //Para evitar la perdida de 0 después del voltea
      
      res = res * potencia(10, numDig-digitos(res));
    }
    return res;
  }
  /**
   * Función que pasa un número de base 10 a base 8
   * @param num Numero en base 10
   * @return Número en base 8
   */
  public static long decimalOctal(long num) {
    
    long res = 0;
    int exponente = 0;
    do {
      
      
      res += (num % 8) * potencia(10, exponente);
      exponente++;
      num = num / 8;
     if (num < 8) {
       
     }
    } while (num >= 8);
    res += num * potencia(10, exponente);
    return res;
  }
  /**
   * Función que pasa un número de base 8 a base 10
   * @param num Número en base 8
   * @return Número en base 10
   */
  public static long octalDecimal(long num) {
    
    long res = 0;
    int exponente = 0;
    int numDig = digitos(num);
    do {
      
      long aux = digitoN(num, numDig-exponente);
      res += (aux * potencia(8, exponente));
      exponente++;
    } while (exponente < numDig);
    return res;
  }
  /**
   * Función que pasa un número de base 10 a base 16
   * @param num Número en base 10
   * @return Número en base 16
   */
  public static String decimalHex(long num) {
    
    String res = "";
    do {
      
      int aux = ((int)num % 16);
      switch (aux) {
        
        case 10:
          
          res = "A" + res;
          break;
        case 11:
          
          res = "B" + res;
          break;
        case 12:
          
          res = "C" + res;
          break;
        case 13:
          
          res = "D" + res;
          break;
        case 14:
          
          res = "E" + res;
          break;
        case 15:
          
          res = "F" + res;
          break;
        default:
          
          res = Integer.toString(aux) + res;
          break;
      }
      num /= 16;
    } while (num > 16);
    int aux = ((int)num % 16);
      switch (aux) {
        
        case 10:
          
          res = "A" + res;
          break;
        case 11:
          
          res = "B" + res;
          break;
        case 12:
          
          res = "C" + res;
          break;
        case 13:
          
          res = "D" + res;
          break;
        case 14:
          
          res = "E" + res;
          break;
        case 15:
          
          res = "F" + res;
          break;
        default:
          
          res = Integer.toString(aux) + res;
          break;
      }
    return res;
  }
  public static long hexDecimal(String num) {
    
    int j = 0;
    long res = 0;
    for (int i = (num.length()-1); i >= 0; i--) {
      
      char aux = num.charAt(i);
      switch(aux) {
        
        case 'A':
          
          res += 10 * potencia(16, j);
          break;
        case 'B':
          
          res += 11 * potencia(16, j);
          break;
        case 'C':
          
          res += 12 * potencia(16, j);
          break;
        case 'D':
          
          res += 13 * potencia(16, j);
          break;
        case 'E':
          
          res += 14 * potencia(16, j);
          break;
        case 'F':
          
          res += 15 * potencia(16, j);
          break;
        default:
          
          res += Character.getNumericValue(aux) * potencia(16, j);
          break;
      }
      j++;
    }
    return res;
  }
}
