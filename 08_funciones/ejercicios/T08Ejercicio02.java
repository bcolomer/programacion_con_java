/*
 * esPrimo: Devuelve verdadero si el número que se pasa como parámetro
es primo y falso en caso contrario. 
 * 
 * @autor Barbara Colomer
 */

public class T08Ejercicio02 {
  public static void main(String[] args) {
    long numero = 22222222;

    System.out.println(esPrimo(numero));
  }

  /**
   * Comprueba si un número es o no primo
   * 
   * @param int numero
   * @return boolean
   */
  public static boolean esPrimo(long numero) {

    int i = 2;

    while ((i <= (numero / 2)) && (numero % i != 0)) {
      i++;
    }

    return (i > (numero / 2));
  }
}
