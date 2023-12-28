/*
 * pegaPorDelante: Añade un dígito a un número por delante. 
 * 
 * @autor Barbara Colomer
 */
public class T08Ejercicio12PegaDelante {
    public static void main(String[] args) {
        int digito = 5;
        long numero = 4568;

        System.out.println(pegaDelante(digito, numero));
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
}
