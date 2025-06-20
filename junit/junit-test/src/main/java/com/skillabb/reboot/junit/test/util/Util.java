package com.skillabb.reboot.junit.test.util;

import com.skillabb.reboot.junit.test.constants.Constants;
import com.skillabb.reboot.junit.test.model.PrimeNumber;
import java.util.ArrayList;
import java.util.List;

public class Util {

  /**
   * Constructor privado.
   */
  private Util() {
    super();
  }

  /**
   * Valida un numero entero y genera un Objeto PrimeNumber donde mediante sus parametros se tiene
   * el número validado, sus divisores y una variable booleana donde que indica si el numero es
   * Primo o no.
   * 
   * @param number un numero int32.
   * @return un nuevo objeto PrimeNumber.
   */
  public static PrimeNumber getNumber(int number) {
    List<Integer> dividers = new ArrayList<>();

    for (int i = Constants.VALUE_INT_1; i <= number; i++) {
      if (number % i == Constants.VALUE_INT_0) {
        dividers.add(i);
      }
    }
    return new PrimeNumber(number, dividers.size() > Constants.VALUE_INT_2 ? false : true,
        dividers);
  }

  /**
   * Obtiene el valor de la serie de fbonacci en la posicion solicitada iniciando la serie como 0,
   * 1, 1, 2, 3, 5, ...
   * 
   * @param fibonacciPositional posición a calcular en la serie de fibonacci.
   * @return un valor long que marca el valor en la posicion esperada.
   */
  public static long getFibonacciNumber(long fibonacciPositional) {
    long fibVal1 = Constants.VALUE_LONG_1;
    long fibVal2 = Constants.VALUE_LONG_1;
    System.out.print(fibVal1 + Constants.COMMA_SEPARATOR + fibVal2 + Constants.COMMA_SEPARATOR);
    long fibonacciNumber = Constants.VALUE_LONG_0;

    if (fibonacciPositional > Constants.VALUE_LONG_0) {
      if (fibonacciPositional > Constants.VALUE_LONG_2) {
        for (long i =
            Constants.VALUE_LONG_0; i < (fibonacciPositional - Constants.VALUE_LONG_2); i++) {
          fibonacciNumber = fibVal1 + fibVal2;
          System.out.print(fibonacciNumber + Constants.COMMA_SEPARATOR);
          fibVal1 = fibVal2;
          fibVal2 = fibonacciNumber;
        }
      } else {
        fibonacciNumber = Constants.VALUE_LONG_1;
      }
    }
    return fibonacciNumber;
  }

  /**
   * Convierte un valor decimal en alguna de las 3 bases siguientes: B - convierte a base binaria. O
   * - convierte a base octal. H - convierte a base hexadecimal. Si no se ingresa alguna de esas
   * bases entonces el numero se regresa en base decimal.
   * 
   * @param number el numero a convertir a otra base.
   * @param base   el caracter que representa la base a convertir.
   * @return un String que representa el numero en la base que se paso como parametro o en decimal.
   */
  public static String convertDecimalToBaseX(int number, char base) {
    String value = Constants.EMPTY_STRING;

    switch (base) {
      case Constants.BINARY_CHAR:
        value = Integer.toBinaryString(number);
        break;
      case Constants.OCTAL_CHAR:
        value = Integer.toOctalString(number);
        break;
      case Constants.HEXA_CHAR:
        value = Integer.toHexString(number);
        break;
      default:
        value = String.valueOf(number);
        break;
    }
    return value;
  }

  /**
   * Invierte el orden de una secuencia de letras en una palabra o frase.
   * 
   * @param str String que se desea invertir.
   * @return el String invertido.
   */
  public static String reverseString(String str) {
    char[] chars = str.toCharArray();
    int aux = chars.length;
    StringBuilder stringBuilder = new StringBuilder();
    while (aux > Constants.VALUE_INT_0) {
      stringBuilder.append(chars[aux - Constants.VALUE_INT_1]);
      aux--;
    }
    return stringBuilder.toString();
  }

  /**
   * Valida si un String es una palabra palindromo, por ejemplo: oso salas anita_atina ...
   * 
   * @param str String a validar.
   * @return verdadero o falso, verdadero cuando el String es un palindromo y falso cuando no.
   */
  public static boolean isPalindrome(String str) {

    return str.equalsIgnoreCase(Util.reverseString(str));
  }

  /**
   * Ordena un Arreglo(Lista) de String de a-z o A-Z y de z-a o Z-A.
   * 
   * @param array     arreglo a ordenar.
   * @param inReverse esta variable se envia como true si se desea que el orden sea de z-a o de Z-A.
   *                  Si se manda como false entoces se ordenará de a-z o A-Z.
   * @return lista ordenada.
   */
  public static List<String> arraySorted(List<String> array, boolean inReverse) {
    array.sort(Comparable::compareTo);
    List<String> arraySorted = new ArrayList<>();
    array.stream().forEach(arraySorted::add);
    if (inReverse) {
      arraySorted.sort((p1, p2) -> p2.compareTo(p1));
    }
    return arraySorted;
  }
}
