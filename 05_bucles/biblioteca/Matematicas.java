/**
 * Crea una biblioteca de funciones matemáticas llamada Matematicas.java que
 * contenga las
 * siguientes funciones. Recuerda que puedes usar unas dentro de otras si es
 * necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado,
 * te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua resulta
 * trivial
 * teniendo voltea y la función siguientePrimo también es muy fácil de
 * implementar teniendo
 * esPrimo.
 * 
 * 
 */

public class Matematicas {
    /**
     * funcion para saber si un numero es capicua
     * 
     * @param numero
     * @return
     */
    public static boolean esCapicua(long numero) {

        boolean esCapi = true;
        long modulo = 0;
        long invertido = 0;
        long copiaNumero = numero;

        do {
            modulo = numero % 10;
            numero = numero / 10;
            invertido = (invertido * 10) + modulo;

        } while (numero > 0);

        if (invertido != copiaNumero) {
            esCapi = false;
        }

        return esCapi;
    }

    /**
     * Comprueba si un número es o no primo
     * 
     * @param int numero
     * @return boolean
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
     * funcion que devuelve el siguiente primo al numero dado
     * 
     * @param numero
     * @return
     */
    public static long siguientePrimo(long numero) {
        long sigPrimo = numero;
        boolean esSigPrimo = false;
        do {
            sigPrimo++;
            esSigPrimo = esPrimo(sigPrimo);

        } while (!esSigPrimo);

        return sigPrimo;
    }

    /**
     * funcion que te da la potencia n de un numero dado
     * 
     * @param numero
     * @param exponente
     * @return
     */
    public static long potencia(long numero, int exponente) {

        long resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado = resultado * numero;
        }

        return resultado;
    }

    /**
     * funcion que te indica la cantidad de digitos de un numero
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
     * funcion para darle la vuelta a un numero
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
     * funcion que te indica el numero que esta en una posicion
     * 
     * @param posicion
     * @param numero
     * @return
     */
    public static int digitoPosicion(int posicion, long numero) {

        long volteado = voltea(numero);
        long reves = 0;
        long modulo = 0;
        int contador = 0;

        do {
            modulo = volteado % 10;
            volteado = volteado / 10;
            reves = (reves * 10) + modulo;
            contador++;

        } while (contador - 1 != posicion);
        return contador;
    }

    /**
     * funcion que te devuelve la primera posicion de un numero
     * 
     * @param digito
     * @param numero
     * @return
     */
    public static int posicionDigito(int digito, long numero) {

        long volteado = voltea(numero);
        // long reves = 0;
        long modulo = 0;
        int contador = 0;
        int posicionDigito = -1;

        do {
            modulo = volteado % 10;
            volteado = volteado / 10;
            // reves = (reves * 10) + modulo;
            contador++;
            if (digito == modulo) {
                posicionDigito = contador;
            }

        } while ((digito != modulo) && (volteado > 0));

        return posicionDigito;
    }

    /**
     * funcion que quita n cantidad de digitos por detras de un numero
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
     * funcion que quita n cantidad de digitos por delante
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

    /**
     * funcion para agregar un digito por detras a un numero
     * 
     * @param digito
     * @param numero
     * @return
     */
    public static long pegaDetras(int digito, long numero) {
        long numeroCompleto = 0;
        numeroCompleto = (numero * 10) + digito;

        return numeroCompleto;
    }

    /**
     * funcion para agregar un digito por delante de un numero
     * 
     * @param digito
     * @param numero
     * @return
     */
    public static long pegaDelante(int digito, long numero) {

        long numeroCompleto = 0;

        numeroCompleto = voltea(numero);
        numeroCompleto = (numeroCompleto * 10) + digito;
        numeroCompleto = voltea(numeroCompleto);

        return numeroCompleto;
    }

    /**
     * funcion que devuelve un trozo de un numero dado la posicion inicial y final
     * deseada
     * 
     * @param posicionInicial
     * @param posicionFinal
     * @param numero
     * @return
     */
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