/*
 * Escribe un programa que sea capaz de insertar un dígito dentro de un número
indicando la posición. El nuevo dígito se colocará en la posición indicada y el
resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
correctamente los datos. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio44R41 {
  public static void main(String[] args) {

    long numero = 0;
    int posicion = 0;
    int digito = 0;
    long desinvertir = 0;
    long modulo = 0;
    int contador = 1;
    long parteA = 0;
    double resultado = 0;

    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el numero");
    numero = s.nextLong();
    System.out.println("Introduzca el digito a insertar");
    digito = s.nextInt();
    System.out.println("Introduzca la posicion donde quiere insertarlo");
    posicion = s.nextInt();
    s.close();

    numero = invertir(numero);

    do {
      modulo = numero % 10;
      numero = numero / 10;
      desinvertir = (desinvertir * 10) + modulo;
      contador++;

    } while (contador < posicion);
    numero = invertir(numero);

    parteA = (desinvertir * 10) + digito;
    resultado = (parteA * (Math.pow(10, (contador + 1)))) + numero;

    System.out.printf("el numero resultante es: %.0f", resultado);

  }

  public static long invertir(long numero) {
    long modulo = 0;
    long invertido = 0;
    do {
      modulo = numero % 10;
      numero = numero / 10;
      invertido = (invertido * 10) + modulo;

    } while (numero > 0);
    return invertido;
  }
}
