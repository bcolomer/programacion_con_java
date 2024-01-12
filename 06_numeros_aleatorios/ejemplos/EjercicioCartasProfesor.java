public class EjercicioCartasProfesor {
    private static final int FIGURA_AS = 1;
    private static final int FIGURA_1 = 11; // J
    private static final int FIGURA_2 = 12; // Q
    private static final int FIGURA_3 = 13; // K

    public static void main(String[] args) {
        escribirNumeroCarta((int) (Math.random() * 13) + 1);
        escribirPaloCarta((int) (Math.random() * 4) + 1);
        long capi = (long) (Math.random() * 10 + 10);
        System.out.println(esCapicua(capi));
        System.out.println(capi);
    }

    /**
     * funcion para escribir numero de la carta
     * 
     * @param numero
     */
    public static void escribirNumeroCarta(int numero) {
        switch (numero) {
            case FIGURA_AS:
                System.out.print(" A ");
                break;
            case FIGURA_1:
                System.out.print(" J ");
                break;
            case FIGURA_2:
                System.out.print(" Q ");
                break;
            case FIGURA_3:
                System.out.print(" K ");
                break;
            default:
                System.out.printf(" %d ", numero);
                break;
        }
    }

    public static void escribirPaloCarta(int palo) {
        switch (palo) {
            case 1:
                System.out.println(" de picas");
                break;
            case 2:
                System.out.println(" de corazones");
                break;
            case 3:
                System.out.println(" de diamantes");
                break;
            case 4:
                System.out.println(" de treboles");
                break;
        }
    }

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
}
