/**
 * Salida Formateada utilizando flags
 * 
 * @autor Barbara Colomer
 */
public class SalidaFormateada02 {
  public static void main(String[] args) {
    System.out.printf("%8d\n", 100); // rellena con espacios delante hasta los 8 caracteres
    System.out.printf("%08d\n", 100); // igual pero lo rellena con ceros
    System.out.printf("%+8d\n", 100); // imprime el signo del numero si es posit o negativo
    System.out.printf("%-8d\n", 100); // justifica a la izquierda los esacios
    System.out.printf("%+08d\n", 100);
  }

}
