/*
 * posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
dentro de un número entero. Si no se encuentra, devuelve -1. 
 * 
 * @autor Barbara Colomer
 */
public class T08Ejercicio08PosicionDigito {
    public static void main(String[] args) {
        long numero = 71453348;
        int digito = 4;
        System.out.println(posicionDigito(digito, numero));
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
}
