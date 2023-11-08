/*
 * Escribe un programa que pinte por pantalla la bandera de Andalucía utilizando el carácter Unicode 2588 (U+2588),
 *  que representa un bloque completamente lleno o un cuadrado sólido de ancho completo.
 * Es suficiente con pintar 10 caracteres por franja. Al final de la pregunta se te proporciona la tabla de códigos de colores.
 *  También puedes usar el selector de color de Google.
 * 
 * @autor Barbara Colomer
 */
public class Ej01 {
  public static void main(String[] args) {
    System.out.printf("\033[38;5;34m\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n");
    System.out.printf("\033[0m\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\n");
    System.out.printf("\033[38;5;34m\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");
  }
}
