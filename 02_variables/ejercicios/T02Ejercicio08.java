/**
 * Escribe un programa que declare 5 variables de tipo char. A continuación,
 * crea otra variable como cadena de caracteres y asígnale como valor la
 * concatenación de las anteriores 5 variables. Por último, muestra la cadena de
 * caracteres por pantalla ¿Qué problemas te encuentras? ¿cómo lo has
 * solucionado?
 * 
 * @autor Barbara Colomer
 */
public class T02Ejercicio08 {
  public static void main(String[] args) {
    char variable1 = 'p';
    char variable2 = 'e';
    char variable3 = 'r';
    char variable4 = 'r';
    char variable5 = 'o';

    /*
     * indica error por incompatibilidad de tipos string +chart:
     * String palabra = variable1 + variable2 + variable3 + variable4 + variable5;
     */
    /*
     * suma los valores de los codigos ascii:
     * int palabra = variable1 + variable2 + variable3 + variable4 + variable5;
     */
    String palabra = variable1 + "" + variable2 + "" + variable3 + "" + variable4 + "" + variable5;
    System.out.println(palabra);

  }
}
