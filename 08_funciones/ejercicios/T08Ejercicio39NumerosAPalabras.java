/*
 * Esta función convierte los dígitos del número n en las correspondientes palabras
y lo devuelve todo en una cadena de caracteres. Por ejemplo, el 470213
convertido a palabras sería:
cuatro, siete, cero, dos, uno, tres
Utiliza esta función en un programa para comprobar que funciona bien. Desde
la función no se debe mostrar nada por pantalla, solo se debe usar print desde
el programa principal. Fíjate que hay una coma detrás de cada palabra salvo al
final. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T08Ejercicio39NumerosAPalabras {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        long numero = 0;
        int contadorAntes = 0;
        int contadorDespues = 0;

        System.out.println("Introduce un numero para recibirlo por escrito con palabras");
        numero = s.nextLong();
        s.close();

        contadorAntes = cuentaDigitos(numero);
        numero = voltea(numero);
        contadorDespues = cuentaDigitos(numero);

        System.out.println(convertirAPalabras(numero, contadorAntes, contadorDespues));
    }

    public static int cuentaDigitos(long numero) {
        int cantDigitos = 0;

        do {
            numero = numero / 10;
            cantDigitos++;
        } while (numero > 0);
        return cantDigitos;
    }

    /**
     * funcion para voltear un numero
     * 
     * @param numero
     * @return
     */
    public static long voltea(long numero) {
        long reves = 0;
        long modulo = 0;
        do {
            modulo = numero % 10;
            numero = numero / 10;
            reves = (reves * 10) + modulo;
        } while (numero > 0);

        return reves;
    }

    /**
     * funcion para convertir un numero a palabras
     * 
     * @param numero
     * @param contadorAntes
     * @param contadorDespues
     * @return
     */
    public static String convertirAPalabras(long numero, int contadorAntes, int contadorDespues) {

        String numeroEscrito = "";
        int modulo = 0;
        int contador = 0;

        while (numero > 0) {
            modulo = (int) numero % 10;
            numero = numero / 10;

            switch (modulo) {
                case 1:
                    numeroEscrito += "uno";
                    break;
                case 2:
                    numeroEscrito += "dos";
                    break;
                case 3:
                    numeroEscrito += "tres";
                    break;
                case 4:
                    numeroEscrito += "cuatro";
                    break;
                case 5:
                    numeroEscrito += "cinco";
                    break;
                case 6:
                    numeroEscrito += "seis";
                    break;
                case 7:
                    numeroEscrito += "siete";
                    break;
                case 8:
                    numeroEscrito += "ocho";
                    break;
                case 9:
                    numeroEscrito += "nueve";
                    break;
                default:
                    numeroEscrito += "cero";
                    break;
            }
            if (numero > 0) {
                numeroEscrito += ", ";
            }
        }
        if (contadorAntes > contadorDespues) {
            contador = contadorAntes - contadorDespues;
            for (int i = 0; i < contador; i++) {
                numeroEscrito += ", cero";
            }

        }
        return numeroEscrito;
    }
}
