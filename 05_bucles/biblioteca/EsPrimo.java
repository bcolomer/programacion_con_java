public class EsPrimo {

  /**
   * Comprueba si el número dado es o no primo.
   * 
   * @param int numero
   * @return boolean
   */
  public static boolean esPrimo(int numero) {

    int i = 2;

    // Hago el bucle mientras I < NUMERO y la división entre I NO ES exacta
    while ((i < numero) && (numero % i != 0)) {
      i++;
    }

    // Si NUMERO es primo lo muestro en pantalla
    return (i >= numero);
  }

}