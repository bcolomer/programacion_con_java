/*
 * potencia: Dada una base y un exponente devuelve la potencia. 
 * 
 * @autor Barbara Colomer
 */
public class T08Ejercicio04Potencia {
    public static void main(String[] args) {
        int exponente = 5;
        long numero = 2;
        System.out.println(potencia(numero, exponente));
    }

    public static long potencia(long numero, int exponente) {

        long resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado = resultado * numero;
        }

        return resultado;
    }
}
