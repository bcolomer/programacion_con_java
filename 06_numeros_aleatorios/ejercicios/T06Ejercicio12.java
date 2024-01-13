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
            System.out.print(simbolo);
        }
        // System.out.println("corte");
        // numero = (int) (Math.random() * 126 + 32);
        // System.out.println(numero);
        // }
        // for (int i = 0; i < 30; i++) {
        // // solucion del libro:
        // numero = (int) (Math.random() * 11 + 3); // desde el 3 hasta el 14-1
        // System.out.print(numero + " ");

        // }

        // System.out.println("corte");
        // for (int i = 0; i < 20; i++) {

        // numero = (int) (Math.random() * (126 - 32 + 1) + 32);
        // System.out.println(numero);
        // }
        // System.out.println("corte");

        // for (int i = 0; i < 20; i++) {

        // numero = (int) (Math.random() * 93 + 32);
        // System.out.println(numero);
        // }
    }
}
