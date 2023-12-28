/*
 * darle la vuelta a un numero y volver a darle la vuelta considerando que  
 * puede tener ceros al final
 * 
 * @autor Barbara Colomer
 */
public class T08Ejercicio000Recomponer {
    public static void main(String[] args) {
        long numero = 780100;
        System.out.println(recompone(numero));

    }

    public static long recompone(long numero) {
        long reves = 0;
        long modulo = 0;
        int contadorAntes = 0;
        int contadorDespues = 0;
        int cantidadCeros = 0;
        long recompuesto = 0;

        do {
            modulo = numero % 10;
            numero = numero / 10;
            reves = (reves * 10) + modulo;
            contadorAntes++;
        } while (numero > 0);

        do {
            modulo = reves % 10;
            reves = reves / 10;
            numero = (numero * 10) + modulo;
            contadorDespues++;
        } while (reves > 0);
        if (contadorAntes > contadorDespues) {
            cantidadCeros = contadorAntes - contadorDespues;
            recompuesto = numero * ((long) (Math.pow(10, cantidadCeros)));
        }

        return recompuesto;
    }
}
