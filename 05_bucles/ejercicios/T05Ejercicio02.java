/*
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while. 
 * 
 * @autor Barbara Colomer
 */
public class T05Ejercicio02 {
  public static void main(String[] args) {
    int num = 0;
    while (num <= 100) {
      // mi opcion: num = num + 5;
      // opcion corregido:
      if (num % 5 == 0) {
        System.out.print(num + ", ");
      }
      num++;
    }
  }
}
