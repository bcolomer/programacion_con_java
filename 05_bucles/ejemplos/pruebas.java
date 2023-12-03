import java.util.Scanner;

public class pruebas {
  /**
   * comprueba si el numero es primo o no
   * 
   * @param numero
   * @return
   */
  /*
   * public static boolean esPrimo(int numero) {
   * int i = 2;
   * while ((i < numero) && (numero % i != 0)) {
   * i++;
   * }
   * return (i >= numero);
   * 
   * }
   * 
   * public static void main(String[] args) {
   * int filas = 5; // Cambia este número para tener más o menos filas
   * 
   * // Bucle para las filas
   * for (int i = 1; i <= filas; i++) {
   * // Bucle para imprimir los bloques en cada fila
   * for (int j = 1; j <= i; j++) {
   * System.out.print("* "); // Cambia "*" por cualquier otro carácter si quieres
   * }
   * System.out.println(); // Salto de línea para pasar a la siguiente fila
   * }
   * }
   */
  /*
   * public static void main(String[] args) {
   * int altura = 7;
   * int fila = 0;
   * int columna = 0;
   * 
   * // esto hace que la fila empiece en cero y que cuente hasta la altura
   * definida
   * for (fila = 0; fila < altura; fila++) {
   * 
   * // esto hace que por cada una de las filas, vaya por las columnas empezando
   * // desde a-f que es 4 mientras
   * // que el valor de la columna sea superior a 0, vaya disminuyendo de uno en
   * uno
   * for (columna = altura - fila; columna > 1; columna--) {
   * // y que cada vez que eso ocurra imprima un espacio
   * System.out.printf(" ");
   * }
   * // esto pinta todos los asteriscos de la fila izquierda
   * System.out.print("*");
   * // esto es para los espacios centrales
   * for (columna = fila + 1; columna < 2 * fila + 1; columna++) {
   * System.out.print("o");
   * }
   * // esto es para los asteriscos-->
   * // que por cada columna despues de lo anterior, y hasta que la columna sea
   * igual
   * // a fila*2+1 en la primera fila sera 0*2+1, en la 2da sera 1*2+1 etc imprima
   * un
   * // *
   * /*
   * for (columna = 0; columna < (2 * fila) + 1; columna++) {
   * System.out.print("*");
   * }
   *
   * // esto proporciona un salto de linea entre fila y fila
   * System.out.println();
   * }
   * }
   */
  /*
   * public static void main(String[] args) {
   * int alt = 5;
   * int fila = 0;
   * int columna;
   * int incremento = 1;
   * char car = '*';
   * for (fila = 0; fila < alt; fila++) {
   * 
   * // dibujamos los espacios
   * for (columna = 1; columna <= (alt - fila); columna++) {
   * System.out.print(" ");
   * }
   * 
   * // pintamos las estrellitas
   * for (columna = 1; columna <= incremento; columna++) {
   * if ((fila == alt) || (columna == 1) || (columna == incremento)) {
   * System.out.print(car);
   * } else {
   * System.out.print(" ");
   * }
   * }
   * 
   * // aumentamos el número de estrellas por fila
   * incremento = incremento + 2;
   * 
   * // damos un salto de línea
   * System.out.println("");
   * }
   */

  /* Piramide hueca david */
  public static void main(String[] args) {
    String caracter;
    int altura;
    int nivel = 1; // Esta variable controla que nivel estoy pintando, siendo 1 la cúspide.

    Scanner teclado = new Scanner(System.in);

    System.out.printf("Introduce el caracter de relleno: ");
    caracter = teclado.nextLine();

    System.out.printf("Introduce la altura deseada: ");
    altura = teclado.nextInt();

    int espaciosPorDelante = altura - 1;
    int espaciosPorDentro = 0;
    int basePiramide = (altura * 2) - 1;

    // Controlamos que mientras el nivel sea inferior a la altura introducida por
    // teclado, continuamos pintando
    while (nivel < altura) {

      // Pintamos espacios por delante
      for (int i = 0; i < espaciosPorDelante; i++) {
        System.out.print(" ");
      }

      // Pintamos el caracter correspondiente
      System.out.print(caracter);

      // Pintamos huecos por dentro
      for (int i = 1; i < espaciosPorDentro; i++) {
        System.out.print(" ");
      }

      // pintamos el segundo caracter (excepto el primer nivel)
      if (nivel > 1) {
        System.out.print(caracter);
      }

      System.out.println("");
      // Aumentamos y reducimos valores para seguir dibujando
      nivel++; // Aumentamos niveles o pisos de la pirámide
      espaciosPorDelante--; // Reducimos 1 espacio en cada nivel
      espaciosPorDentro += 2; // En cada nivel o piso van aumentando 2 espacios en blanco más

    }

    // Pintamos la base
    for (int i = 0; i < basePiramide; i++) {
      System.out.print(caracter);
    }

    // System.out.println(""); //Saltamos al siguiente renglón

    teclado.close();
  }

}