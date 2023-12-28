/*
 * trozoDeNumero: Toma como parámetros las posiciones inicial y final
dentro de un número y devuelve el trozo correspondiente. 
 * 
 * @autor Barbara Colomer
 */

public class T08Ejercicio13TrozoNumero {
    public static void main(String[] args) {
        int posicionInicial = 2;
        int posicionFinal = 4;
        long numero = 45698721;

        System.out.println(trozoNumero(posicionInicial, posicionFinal, numero));

    }

    /**
     * funcion para contar cantidad de digitos de un numero
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
     * funcion para quitar n cantidad de numeors por detras de un numero
     * 
     * @param digitos
     * @param numero
     * @return
     */
    public static long quitaDetras(int digitos, long numero) {

        int contador = 0;

        do {
            numero = numero / 10;
            contador++;
        } while (contador < digitos);

        return numero;
    }

    /**
     * funcion para quitar n cantidad de numeros por delante de un numero
     * 
     * @param digitos
     * @param numero
     * @return
     */
    public static long quitaDelante(int digitos, long numero) {
        long numeroReducido = 0;
        long reves = 0;
        long modulo = 0;
        int contadorAntes = 0;
        int contadorDespues = 0;
        int contadorRecortar = 0;
        int cantidadCeros = 0;

        do {
            modulo = numero % 10;
            numero = numero / 10;
            reves = (reves * 10) + modulo;
            contadorAntes++;
        } while (numero > 0);

        do {
            reves = reves / 10;
            contadorRecortar++;
        } while (contadorRecortar < digitos);

        do {
            modulo = reves % 10;
            reves = reves / 10;
            numero = (numero * 10) + modulo;
            contadorDespues++;

        } while (reves > 0);
        if (contadorAntes > contadorDespues) {
            cantidadCeros = contadorAntes - (contadorDespues + digitos);
            numeroReducido = numero * ((long) (Math.pow(10, cantidadCeros)));
        }

        return numeroReducido;
    }

    public static long trozoNumero(int posicionInicial, int posicionFinal, long numero) {
        long trozoNumero = 0;
        int cantDigitosTotal = 0;
        int cantDigitosDescontar = 0;

        cantDigitosTotal = cuentaDigitos(numero);
        cantDigitosDescontar = cantDigitosTotal - posicionFinal + 1;
        trozoNumero = quitaDetras(cantDigitosDescontar, numero);
        trozoNumero = quitaDelante(posicionInicial, trozoNumero);

        return trozoNumero;

    }
}
