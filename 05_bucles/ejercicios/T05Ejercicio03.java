/*
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while. 
 * 
 * @autor Barbara Colomer
 */
public class T05Ejercicio03 {
  public static void main(String[] args) {
    int num = 1;
    int resultado;
    do {
      resultado = num * 5;
      num++;
      System.out.print(resultado + ", ");
    } while (resultado <= 99);
  }
}
