
/*
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T07Ejercicio07 {
    public static void main(String[] args) {
        int[] numeros;
        int aleatorio = 0;
        int valor1 = 0;
        int valor2 = 0;

        Scanner s = new Scanner(System.in);

        numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            aleatorio = (int) (Math.random() * 21);
            numeros[i] = aleatorio;
            System.out.print(numeros[i] + " ");
        }
        System.out.println(
                "Introduzca dos numeros del 0 al 20, separados por la tecla intro, asegurese que el primero este en el listado mostrado anteriormente");
        valor1 = s.nextInt();
        valor2 = s.nextInt();
        s.close();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor1) {
                numeros[i] = valor2;
                System.out.print("\"" + numeros[i] + "\" ");
            } else {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
