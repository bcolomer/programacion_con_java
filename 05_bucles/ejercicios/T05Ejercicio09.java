
/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 * Este ejercicio es equivalente a otro realizado anteriormente, con la salvedad de que 
 * el anterior estaba limitado a números de 5 dígitos como máximo. En esta ocasión, hay 
 * que realizar el ejercicio utilizando bucles; de esta manera, la única limitación en el
 * número de dígitos la establece el tipo de dato que se utilice (int o long). 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio09 {
  public static void main(String[] args) {
    int num = 0;
    int a = -10;
    int b = -1;
    int c = 1;
    int d = 10;
    int digitos = 1;

    Scanner s = new Scanner(System.in);
    System.out.print("Escriba un numero para saber cuantos cifras tiene:");
    num = s.nextInt();
    s.close();
    while (((num > a) && (num <= b)) || ((num >= c) && (num < d))) {
      System.out.printf("El numero introducido tiene %d digitos", digitos);
      digitos = digitos + 1;
      a = a * 10;
      b = b * 10;
      c = c * 10;
      d = d * 10;
    }
    
    do {
      if  {
       
        
         
      }
      
    //} while (((num > a) && (num <= b)) || ((num >= c) && (num < d)));
  }
}
}
/*
 * for (int i = 0; i < num; i++) {
 * digitos = digitos + 1;
 * if ((num > a) && (num < b)) {
 * System.out.printf("El numero introducido tiene %d digito/s\n", digitos);
 * }
 * a = a * 10;
 * b = b * 10;
 */

/*
 * System.out.println("i vale " + i);
 * System.out.println("digitos vale " + digitos);
 * System.out.println("num  vale " + num);
 * System.out.println("a vale " + a);
 * System.out.println("b vale " + b);
 * }
 */
// digitos = digitos + 1;
