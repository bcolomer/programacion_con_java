
/*
 * codigo 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T08Ejercicio00 {
    public static void main(String[] args) {
        int numero = 0;
        System.out.println("Introduzca un numero mayor a 2");
        numero = leerValor(numero);
        System.out.printf("El numero introducido es : %d", numero);
    }

    /**
     * leer valor por teclado, comprueba si es mayor o igual a 2, devuelve numero
     * 
     * @param numero
     * @return
     */
    public static int leerValor(int numero) {
        Scanner s = new Scanner(System.in);
        numero = s.nextInt();
        do {

            if (numero < 2) {
                System.out.println("Lo siento, el valor minimo es 2");
                System.out.println("Introduzca un nuevo valor: ");
                numero = s.nextInt();
            }
        } while (numero < 2);

        s.close();
        return numero;

    }

    /**
     * funcion para leer un numero mayor a dos sin utilizar un if
     * 
     * @param numero
     * @return
     */
    public static int leerValor2(int numero) {
        Scanner s = new Scanner(System.in);
        numero = s.nextInt();
        while (numero < 2) {

            System.out.println("Lo siento, el valor minimo es 2");
            System.out.println("Introduzca un nuevo valor: ");
            numero = s.nextInt();
        }

        s.close();
        return numero;

    }
}
