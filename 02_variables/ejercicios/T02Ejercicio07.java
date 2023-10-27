/**
 * Escribe un programa que declare variables de tipo char y de tipo String.
 * Intenta
 * mostrarlas por pantalla todas juntas en la misma línea y con una sola
 * sentencia
 * de Java (con un solo println) ¿es posible?
 * 
 * @autor Barbara Colomer
 */
public class T02Ejercicio07 {
  public static void main(String[] args) {
    // char variable = "a"; char no se pueden asignar con comillas dobles
    // String variable4 = 'Esto es una cadena con comillas simples'; String no se
    // pueden asignar con comillas simples
    char variable2 = 'b';
    String variable3 = " Esto es una cadena con comillas dobles";
    char variable4 = 'c';

    System.out.println(variable2);
    System.out.println(variable3);

    System.out.println("mostrando por pantalla una variable tipo char: " +
        variable2 + " y  una variable tipo String en la misma linea:" + variable3);

    System.out.println(variable2 + variable3);
    System.out.println("esto es una prueba mas " + variable2 + variable3);
    System.out.println("esto es otra prueba:");
    System.out.println("mostrando por pantalla una variable tipo char: " + variable2
        + " y una variable tipo String en la misma linea:" + variable3);
    // esto sumara los codigos ascii de las variables tipo char y luego concatenara
    // el string, para que imprima los caracteres hay que agregar comillas
    System.out.println(variable2 + variable4 + variable3);
    System.out.println("" + variable2 + variable4 + variable3);
  }
}
