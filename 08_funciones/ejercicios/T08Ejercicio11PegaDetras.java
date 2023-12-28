/*
 * pegaPorDetras 
 * 
 * @autor Barbara Colomer
 */
public class T08Ejercicio11PegaDetras {
    public static void main(String[] args) {
        int digito = 3;
        long numero = 1234;
        System.out.println(pegaDetras(digito, numero));
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

}
