/*
 * quitaPorDelante: Le quita a un número n dígitos por delante (por la
izquierda). 
 * 
 * @autor Barbara Colomer
 */
public class T08Ejercicio10QuitaDelante {
    public static void main(String[] args) {
        long numero = 1253450;
        int digitos = 2;
        System.out.println(quitaDelante(digitos, numero));
    }

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
}
