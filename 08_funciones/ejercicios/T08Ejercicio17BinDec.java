/*
 * Escribe un programa que pase de binario a decimal. 
 * 
 * @autor Barbara Colomer
 */
public class T08Ejercicio17BinDec {
    public static void main(String[] args) {
        long binario = 100;
        System.out.println(binarioDecimal(binario));
    }

    /**
     * funcion para convertir un numero binario a decimal
     * 
     * @param numero
     * @return
     */
    public static long binarioDecimal(long numero) {

        long decimal = 0;
        int contador = 0;
        long modulo = 0;
        do {
            modulo = numero % 10;
            numero = numero / 10;
            if (modulo == 1) {
                decimal = decimal + (long) (Math.pow(2, contador));
            }
            contador++;
        } while (numero > 0);

        return decimal;
    }

}
