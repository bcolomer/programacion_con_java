
/*
 * Escribe un programa que dados dos números, uno real (base) y un entero positivo
 *  (exponente), saque por pantalla todas las potencias con base el numero dado y
 *  exponentes entre uno y el exponente introducido. No se deben utilizar funciones 
 * de exponenciación. Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar 
 * 2-1, 2-2, 2-3, 2-4 y 2-5. 
 * 
 * @autor Barbara Colomer
 */import java.util.Scanner;

public class T05Ejericio15R12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double base;
    double exponente;
    double resultado = 1;
    System.out.println("Introduzca la base: ");
    base = s.nextDouble();
    System.out.println("Introduzca el exponente: ");
    exponente = s.nextDouble();
    s.close();
    for (int i = 1; i <= exponente; i++) {
      resultado = resultado * base;
      System.out.printf("%.2f ^ %d = %.2f\n", base, i, resultado);
    }

  }

}
