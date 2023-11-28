public class pruebas {
  /**
   * comprueba si el numero es primo o no
   * 
   * @param numero
   * @return
   */
  public static boolean esPrimo(int numero) {
    int i = 2;
    while ((i < numero) && (numero % i != 0)) {
      i++;
    }
    return (i >= numero);

  }

  public static void main(String[] args) {
    int filas = 5; // Cambia este número para tener más o menos filas

    // Bucle para las filas
    for (int i = 1; i <= filas; i++) {
      // Bucle para imprimir los bloques en cada fila
      for (int j = 1; j <= i; j++) {
        System.out.print("* "); // Cambia "*" por cualquier otro carácter si quieres
      }
      System.out.println(); // Salto de línea para pasar a la siguiente fila
    }
  }
}
