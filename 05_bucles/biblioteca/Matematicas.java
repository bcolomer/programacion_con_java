
/**
 * Crea una biblioteca de funciones matemáticas llamada Matematicas.java que
 * contenga las
 * siguientes funciones. Recuerda que puedes usar unas dentro de otras si es
 * necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado,
 * te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua resulta
 * trivial
 * teniendo voltea y la función siguientePrimo también es muy fácil de
 * implementar teniendo
 * esPrimo.
 * 
 * 
 */

public class Matematicas {

  /**
   * Comprueba si un número es o no capicúa
   * 
   * @param int numero
   * @return boolean
   */
  public static boolean esCapicua(int numero) {
    return numero == voltea(numero);
  }

  /**
   * Comprueba si un número es o no primo
   * 
   * @param int numero
   * @return boolean
   */
  public static boolean esPrimo(int numero) {

    int i = 2;

    while ((i <= (numero / 2)) && (numero % i != 0)) {
      i++;
    }

    return (i > (numero / 2));
  }

  /**
   * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
   * 
   * @param numero
   * @return
   */
  public static int siguientePrimo(int numero) {

    int i;

    for (i = numero + 1; !esPrimo(i); i++)
      ;

    return i;
  }

  /**
   * 
   * @param int base
   * @param int exponente
   * @return float
   */
  public static float potencia(int base, int exponente) {

    int potencia = 1;
    int i;

    for (i = 1; i <= exponente; i++) {
      potencia *= base;
    }

    return (exponente >= 0) ? potencia : 1f / potencia;

  }

  /**
   * Cuenta el total de dígitos de un número dado
   * 
   * @param long numero
   * @return int
   */
  public static int digitos(long numero) {

    int contador = 0;
    for (; numero > 0; numero /= 10) {
      contador++;
    }

    return contador;
  }

  /**
   * Invierte el número dado
   * 
   * @param long numero
   * @return long
   */
  public static long voltea(long numero) {

    long invertido = 0;
    int signo = (numero > 0) ? 1 : -1;

    // obtenemos el valor absoluto del número
    numero = Math.abs(numero);

    for (; numero > 0; numero /= 10) {
      invertido = (invertido * 10) + (numero % 10);
    }

    return invertido * signo;
  }

  /**
   * Devuelve el dígito que está en la posición de un número entero.
   * Se empieza contando por el 0 y de izquierda a derecha.
   * 
   * @param long numero
   * @param int  posicion
   * @return int
   */
  public static int digitoN(long numero, int posicion) {

    // giramos el número
    numero = voltea(numero);

    // buscamos la posición
    for (; posicion > 0; posicion--) {
      numero /= 10;
    }
    return (int) numero % 10;

  }

  /**
   * Devuelve la posición de la primera ocurrencia de un dígito dentro de un
   * número
   * entero. Si no se encuentra, devuelve -1.
   * 
   * @param long numero
   * @param int  digito
   * @return int
   */
  public static int posicionDeDigito(long numero, int digito) {

    int posicion = 0;
    boolean encontrado = false;

    // volteamos el número
    numero = voltea(numero);

    // buscamos el dígito
    while ((numero > 0) && (numero % 10 != digito)) {
      posicion++;
      numero /= 10;
    }

    return (numero > 0) ? posicion : -1;
  }

  /**
   * Le quita a un número n dígitos por detrás (por la derecha)
   * 
   * @param int  n
   * @param long numero
   * @return long
   */
  public static long quitaPorDetras(int n, long numero) {

    for (; n > 0; n--) {
      numero /= 10;
    }
    return numero;
  }

  /**
   * Le quita a un número n dígitos por delante (por la izquierda)
   * 
   * @param int  n
   * @param long numero
   * @return long
   */
  public static long quitaPorDelante(int n, long numero) {

    // calculamos la longitud del número
    int digitosPrevistos = digitos(numero) - n;

    // calculamos el resultado
    long resultado = voltea(quitaPorDetras(n, voltea(numero)));

    // calculamos el total de dígitos del resultado
    int digitosResultado = digitos(resultado);

    // si el total de digitos del resultado no es correcto multiplicamos por 10^n
    if (digitosResultado < digitosPrevistos) {
      resultado *= potencia(10, digitosPrevistos - digitosResultado);
    }

    return resultado;
  }

  /**
   * Añade un dígito a un número por detrás (por la derecha)
   * 
   * @param digito
   * @param numero
   * @return
   */
  public static long pegaPorDetras(int digito, long numero) {
    return (numero * 10) + digito;
  }

  /**
   * Añade un dígito a un número por detrás (por la izquierda)
   * 
   * @param digito
   * @param numero
   * @return
   */
  public static long pegaPorDelante(int digito, long numero) {
    return voltea((voltea(numero) * 10) + digito);
  }

  /**
   * Toma como parámetros las posiciones inicial y final dentro de
   * un número y devuelve el trozo correspondiente.
   * 
   * @param long numero
   * @param int  inicio
   * @param int  fin
   * @return long
   */
  public static long trozoDeNumero(long numero, int inicio, int fin) {

    // obtenemos los digitos del numero
    int totalDigitos = digitos(numero);

    // eliminamos inicio digitos por delante
    numero = quitaPorDelante(inicio, numero);

    // eliminamos fin digitos por detrás
    numero = quitaPorDetras(totalDigitos - fin - 1, numero);

    return numero;
  }

  /**
   * Pega dos números dados para formar uno.
   * 
   * @param int a
   * @param int b
   * @return long
   */
  public static long juntoNumeros(int a, int b) {

    int digitosB = digitos(b);
    return (a * (int) potencia(10, digitosB)) + b;
  }

}
/*
 * public class Matematicas {
 * /*
 * public static boolean capicua(long num) {
 * return true;
 * }
 */
/*
 * public static boolean capicua(long numero) {
 * long nummero;
 * long temporal;
 * long inverso = 0;
 * boolean capi;
 * // Scanner s = new Scanner(System.in);
 * 
 * // System.out.print("Introduce un número entero positivo: ");
 * // numero = s.nextLong();
 * 
 * temporal = numero;// numero;
 * 
 * // Invertimos el número
 * for (; temporal > 0; temporal /= 10) {
 * inverso = (inverso * 10) + (temporal % 10);
 * }
 * 
 * // Comprobamos si es capicúa
 * if (numero == inverso) {
 * capi = true;
 * } else {
 * capi = false;
 * }
 * return capi;
 * }
 * }
 */