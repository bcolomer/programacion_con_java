
/*
 * Realiza un programa que calcule la media de los dígitos que contiene un número
entero introducido por teclado. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio58 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        long numero = 0;
        int modulo = 0;
        int contador = 0;
        double media = 0;

        System.out.println("Introduzca un numero entero");
        numero = s.nextLong();
        s.close();

        do {
            modulo = (int) numero % 10;
            numero = numero / 10;
            contador++;
            media = media + modulo;

        } while (numero > 0);
        media = media / contador;
        System.out.println("La media de los digitos es " + media);
    }

}
