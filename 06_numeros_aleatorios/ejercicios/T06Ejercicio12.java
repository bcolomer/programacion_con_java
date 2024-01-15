/*
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter. 
 * 
 * @autor Barbara Colomer
 */
public class T06Ejercicio12 {
    public static void main(String[] args) {
        int numero = 0;
        char simbolo = ' ';
        for (int i = 0; i < 10000; i++) {

            numero = (int) (Math.random() * (126 - 32 + 1) + 32);
            // System.out.println(numero);

            simbolo = (char) numero;
            System.out.printf("\033[32m%c", simbolo);
        }

    }
}
