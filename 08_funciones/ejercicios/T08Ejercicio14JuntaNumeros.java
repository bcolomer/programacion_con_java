/*
 * juntaNumeros: Pega dos números para formar uno. 
 * 
 * @autor Barbara Colomer
 */
public class T08Ejercicio14JuntaNumeros {
    public static void main(String[] args) {
        long numeroA = 123450;
        long numeroB = 7890;
        System.out.println(juntaNumeros(numeroA, numeroB));
    }

    /**
     * funcion para contar la cantidad de digitos que tiene un numero
     * 
     * @param numero
     * @return
     */
    public static int cuentaDigitos(long numero) {
        int cantDigitos = 0;

        do {
            numero = numero / 10;
            cantDigitos++;
        } while (numero > 0);
        return cantDigitos;
    }

    /**
     * funcion para juntar dos numeros enteros en uno.
     * 
     * @param numeroA
     * @param numeroB
     * @return
     */
    public static long juntaNumeros(long numeroA, long numeroB) {
        long numeroPegado = 0;
        int cantidadDigitosB = 0;

        cantidadDigitosB = cuentaDigitos(numeroB);
        numeroA = numeroA * ((long) (Math.pow(10, cantidadDigitosB)));
        numeroPegado = numeroA + numeroB;

        return numeroPegado;
    }

}
