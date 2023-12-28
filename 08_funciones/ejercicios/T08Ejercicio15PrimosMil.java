/*
 * Muestra los números primos que hay entre 1 y 1000. 
 * 
 * @autor Barbara Colomer
 */
public class T08Ejercicio15PrimosMil {
    public static void main(String[] args) {
        primosHastaMil();
    }

    /**
     * funcion para saber si un numero es primo
     * 
     * @param numero
     * @return
     */
    public static boolean esPrimo(long numero) {

        boolean primo = true;
        if (numero > 2) {

            for (int i = 2; i < ((numero / 2) + 1); i++) {
                if (numero % i == 0) {
                    primo = false;
                }
            }
        }

        return (primo);
    }

    /**
     * funcion para mostrar los numeros primos hasta el 1000.
     *
     */
    public static void primosHastaMil() {
        for (int i = 1; i < 1000; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " - ");
            }
        }
    }
}
