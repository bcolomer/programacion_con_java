
/*
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T06Ejercicio06 {
    public static void main(String[] args) {

        int numero = (int) (Math.random() * 100);
        Scanner s = new Scanner(System.in);
        int intento = 0;
        int contador = 1;

        System.out.println("===========ADIVINE EL NUMERO ===========");
        System.out.println("Tiene unicamente 5 oportunidades, no las desaproveche");
        System.out.println("Introduzca un numero de 0 a 100 para ver si consigue acertarlo: ");
        // System.out.println(numero);
        do {
            try {
                intento = s.nextInt();
                if (intento == numero) {
                    System.out.println("Enhorabuena, ha acertado el numero!");
                } else {
                    if (contador < 5) {
                        System.out.println((intento > numero) ? "el numero es mas chico" : "el numero es mas grande");
                        System.out.printf("Le quedan %d oportunidades\n", (5 - contador));
                        System.out.println("Introduzca otro numero:");
                    } else {
                        System.out.println(
                                "Lo siento, no ha acertado y se le han acabado las oportunidades, mejor suerte para la proxima");
                        System.out.println("el numero que debia acertar era: " + numero);
                    }
                    contador++;
                }
            } catch (Exception InputMismatchException) {
                System.out.println("datos invalidos");
                break;
            }
        } while ((numero != intento) && (contador <= 5));

        s.close();

    }
}
