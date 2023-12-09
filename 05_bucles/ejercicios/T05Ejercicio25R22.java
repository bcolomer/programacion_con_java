
/*
 * Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés. 
 * 
 * @autor Barbara Colomer
 */import java.util.Scanner;

public class T05Ejercicio25R22 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero = 0;
    int modulo = 0;
    int invertido = 0;

    System.out.println("Introduzca un numero y se mostrara al reves");
    numero = s.nextInt();
    s.close();
    do {
      modulo = numero % 10;
      numero = numero / 10;
      invertido = (invertido * 10) + modulo;

    } while (numero > 0);

    System.out.println("el numero es " + invertido);

  }

}
/*
 * int numdiv = 0;
 * int auxMod = 0;
 * int auxModMultiplicado = 0;
 * 
 */
/*
 * do {
 * auxMod = num % 10;
 * numdiv = num / 10;
 * auxModMultiplicado = auxMod * 10;
 * 
 * } while ((num / 10) != 0);
 */
/*
 * int invertido = 0;
 * int digito;
 * while (numero > 0) {
 * digito = numero % 10;
 * 
 * numero = numero / 10;
 * invertido = (invertido * 10) + digito;
 */ // digito se puede cambiar directamente por la operacion sin tener que
// guardarlo en variable

/*
 * while (numero > 0) {
 * digito = numero % 10;
 * System.out.print(digito);
 * numero = numero / 10;
 */// esto lo imprime por pantalla pero no lo guarda

// System.out.print(numero);