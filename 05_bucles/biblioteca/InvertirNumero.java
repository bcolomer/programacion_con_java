public class InvertirNumero {

  /**
   * Invierte el número dado
   * 
   * @param numero
   * @return
   */
  public static long invertir(long numero) {

    long invertido = 0;

    for (; numero > 0; numero /= 10) {
      invertido = (invertido * 10) + (numero % 10);
    }

    return invertido;

  }

}
