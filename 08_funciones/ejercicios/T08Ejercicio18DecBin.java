/*
 * Escribe un programa que pase de decimal a binario. 
 * 
 * @autor Barbara Colomer
 */
public class T08Ejercicio18DecBin {
    public static void main(String[] args) {
        long decimal = 13;

        System.out.println(decimalBinario(decimal));
    }

    /**
     * funcion para pasar un numero decimal a binario
     * 
     * @param numero
     * @return
     */
    public static long decimalBinario(long decimal) {
        long binario = 0;
        int modulo = 0;
        int contadorAntes = 0;
        long binarioReves = 0;
        int contadorDespues = 0;
        int diferenciaContadores = 0;

        do {
            modulo = (int) (decimal % 2);
            binarioReves = (binarioReves * 10) + modulo;
            decimal = decimal / 2;
            contadorAntes++;
        } while (decimal > 0);

        do {
            modulo = (int) (binarioReves % 10);
            binarioReves = binarioReves / 10;
            binario = (binario * 10) + modulo;
            contadorDespues++;
        } while (binarioReves > 0);

        if (contadorAntes > contadorDespues) {
            diferenciaContadores = contadorAntes - contadorDespues;
            binario = binario * (long) (Math.pow(10, diferenciaContadores));
        }

        return binario;
    }

}