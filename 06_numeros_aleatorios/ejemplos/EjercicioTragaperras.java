/*
 * codigo 
 * 
 * @autor Barbara Colomer
 */

public class EjercicioTragaperras {

    /*
     * public static void main(String[] args) {
     * int figuraUno = ((int) (Math.random() * 5 + 1));
     * int figuraDos = ((int) (Math.random() * 5 + 1));
     * int figuraTres = ((int) (Math.random() * 5 + 1));
     * // String opcion = "";
     * 
     * System.out.println(simbolo(figuraUno));
     * System.out.println(simbolo(figuraDos));
     * System.out.println(simbolo(figuraTres));
     * if ((figuraUno != figuraDos) && (figuraUno != figuraTres) && (figuraTres !=
     * figuraDos)) {
     * 
     * System.out.println(mensaje(1));
     * 
     * } else if ((figuraDos == figuraTres) && (figuraTres == figuraUno)) {
     * System.out.println(mensaje(3));
     * } else {
     * System.out.println(mensaje(2));
     * }
     * }
     * 
     * private static String simbolo(int numero) {
     * String simbolo = "";
     * switch (numero) {
     * case 1:
     * simbolo = "corazon ";
     * break;
     * case 2:
     * simbolo = "diamante ";
     * break;
     * case 3:
     * simbolo = "herradura ";
     * break;
     * case 4:
     * simbolo = "campana ";
     * break;
     * default:
     * simbolo = "limon ";
     * }
     * return simbolo;
     * }
     * 
     * private static String mensaje(int opcion) {
     * String mensaje = "";
     * switch (opcion) {
     * case 1:
     * mensaje = "Lo siento, ha perdido";
     * break;
     * case 2:
     * mensaje = "Bien, ha recuperado su moneda";
     * break;
     * default:
     * mensaje = "Enhorabuena, ha ganado 10 monedas";
     * 
     * }
     * return mensaje;
     * }
     */

    private static final int FIGURAS = 5;

    private static final int CORAZON = 1;
    private static final int DIAMANTE = 2;
    private static final int HERRADURA = 3;
    private static final int CAMPANA = 4;
    private static final int LIMON = 5;

    public static void main(String[] args) {
        int figura1 = elegirFigura();
        int figura2 = elegirFigura();
        int figura3 = elegirFigura();

        System.out.println();
        mostrarFigura(figura1);
        mostrarFigura(figura2);
        mostrarFigura(figura3);

        if ((figura1 != figura2) && (figura1 != figura3) && (figura3 != figura2)) {
            System.out.printf("\nLo siento, ha perdido\n");
        } else if ((figura2 == figura3) && (figura3 == figura1)) {
            System.out.printf("\nEnhorabuena, ha ganado 10 monedas\n");
        } else {
            System.out.printf("\nBien, ha recuperado su moneda\n");
        }
    }

    private static int elegirFigura() {
        return (int) (Math.random() * FIGURAS + 1);
    }

    /**
     * muestra el nombre de la figura en funcion del valor indicado
     * 
     * @param figura
     */
    private static void mostrarFigura(int figura) {
        switch (figura) {
            case CORAZON:
                System.out.print("corazon ");
                break;
            case DIAMANTE:
                System.out.print("diamante ");
                break;
            case HERRADURA:
                System.out.print("herradura ");
                break;
            case CAMPANA:
                System.out.print("campana ");
                break;
            case LIMON:
                System.out.print("limon ");
                break;

        }
    }

}