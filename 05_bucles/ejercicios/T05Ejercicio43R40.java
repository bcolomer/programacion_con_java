/*
 * Escribe un programa que permita partir un número introducido por teclado en
dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
el número introducido tiene dos dígitos como mínimo y la posición en la que
se parte el número está entre 2 y la longitud del número. No se permite en
este ejercicio el uso de funciones de manejo de String (por ej. para extraer
subcadenas dentro de una cadena). 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio43R40 {
  public static void main(String[] args) {

    int numero = 0;
    int posicion = 0;
    int modulo = 0;
    int desinvertir = 0;
    int contador = 1;

    Scanner s = new Scanner(System.in);

    System.out.println("Introduzca un numero");
    numero = s.nextInt();
    System.out.println("introduzca la posicion a partirlo");
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
    System.out.println(desinvertir);
    System.out.println(numero);
  }

  public static int invertir(int numero) {
    int modulo = 0;
    int invertido = 0;
    do {
      modulo = numero % 10;
      numero = numero / 10;
      invertido = (invertido * 10) + modulo;

    } while (numero > 0);
    return invertido;
  }
}
