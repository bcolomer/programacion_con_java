
/*
 * Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media. 
 * 
 * @autor Barbara Colomer
 */import java.util.Scanner;

public class T05Ejercicio23R20 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    double numero = 0;
    int contador = 0;
    double suma = 0;
    double media = 0;

    System.out.println("Introduzca numeros separados por Enter, el programa finalizara cuando la suma supere 10.000");
    do {
      numero = s.nextDouble();
      contador++;
      suma = suma + numero;

    } while (suma <= 10000);
    media = suma / contador;
    System.out.printf(
        "La suma de los numeros introducidos es %.2f, la cantidad de numeros que ha introducido es %d, y la media de ellos es %.2f",
        suma, contador, media);

    /*
     * double num = 0;
     * double suma = 0;
     * int contadorNum = 0;
     * double media = 0;
     * 
     * System.out.println("Introduzca numeros");
     * do {
     * num = s.nextDouble();
     * suma = suma + num;
     * contadorNum++;
     * 
     * } while (suma < 10000);
     * 
     * if (suma >= 10000) {// esto es para descontar el ultimo numero que supero el
     * maximo permitido
     * suma = suma - num;
     * contadorNum = contadorNum - 1;
     * }
     * media = suma / contadorNum;
     * System.out.printf(
     * "El la suma total de los numeros introducidos es %.2f,  usted ha introducido %d numeros los cuales su suma no exceden el valor indicado, y la media es %.2f"
     * ,
     * suma, contadorNum, media);
     */
    s.close();
  }

}
