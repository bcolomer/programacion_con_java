/*
 * Escribe un programa que cambie un dígito dentro de un número dando la
posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
empezando por el 1. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. Suponemos que el usuario introduce
correctamente los datos. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio45R42 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        long numero = 0;
        int posicion = 0;
        int nuevoNumero = 0;
        long volteado = 0;
        int diferenciadigitos = 0;
        int modulo = 0;
        long componer = 0;
        int contador = 0;

        System.out.println("introduzca un numero");
        numero = s.nextLong();
        System.out.println("Introduzca la posicion del numero a reemplazar");
        posicion = s.nextInt();
        System.out.println("introduzca el numero por el cual debe ser reemplazado");
        nuevoNumero = s.nextInt();
        s.close();

        volteado = Matematicas.voltea(numero);
        diferenciadigitos = Matematicas.cuentaDigitos(numero) - Matematicas.cuentaDigitos(volteado);

        do {
            modulo = (int) (volteado % 10);
            volteado = volteado / 10;
            contador++;
            if (contador == posicion) {
                modulo = nuevoNumero;
            }
            componer = (componer * 10) + modulo;

        } while (volteado > 0);
        if (diferenciadigitos > 0) {
            componer = componer * (Matematicas.potencia(10, diferenciadigitos));

        }
        System.out.println(componer);
    }
}