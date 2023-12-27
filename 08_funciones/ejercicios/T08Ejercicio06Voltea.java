/*
 * voltea: Le da la vuelta a un número. 
 * 
 * @autor Barbara Colomer
 */
public class T08Ejercicio06Voltea {
    public static void main(String[] args) {
        long numero = 123456789;
        System.out.println(voltea(numero));

    }

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

}
