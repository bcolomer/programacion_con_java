/*
 * Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle 
 * do-while. 
 * 
 * @autor Barbara Colomer
 */
public class T05Ejercicio06 {
  public static void main(String[] args) {
    int num = 320;
    do {
      num = num - 20;
      System.out.println(num);
    } while (num > 160);
  }
}
