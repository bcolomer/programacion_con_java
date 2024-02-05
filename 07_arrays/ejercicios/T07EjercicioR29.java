/*
 * El juego «Busca el tesoro» coloca inicialmente, y de forma aleatoria, una mina y un
tesoro sobre un tablero de 4 filas por 5 columnas. Hecho esto, el jugador debe
averiguar dónde está el tesoro indicando las coordenadas (x, y). Si se encuentra el
tesoro el programa debe terminar con el mensaje «¡Enhorabuena! ¡Has encontrado el
tesoro!». Sin embargo, si se encuentra la mina el jugador pierde la partida y el
programa acaba. Al finalizar, se muestra el tablero completo, mostrando los disparos
realizados por el jugador, la mina y el tesoro. 
 * 
 * @autor Barbara Colomer
 */

public class T07EjercicioR29 {
    public static final int MAXIMO = 20;

    public static void main(String[] args) {
        String[][] tablero;
        String[][] tableroJugador;
        int x;
        int y;

        tablero = new String[4][5];
        tableroJugador = new String[4][5];

        ubicacionTesoroMina(tablero);
        rellenarArrayJugador(tableroJugador);
        mostrarArray(tablero);
        System.out.println();
        mostrarArray(tableroJugador);

        // pido cordenada x e y y me aseguro que sea dentro de los limites del array

        do {
            do {
                System.out.println("ingrese cordenada x (menor a 5-horizontal):");
                x = Integer.parseInt(System.console().readLine());
            } while ((x >= 5) || (x < 0));

            do {
                System.out.println("ingrese cordenada y (menor a 4-vertical):");
                y = Integer.parseInt(System.console().readLine());
            } while ((y >= 4) || (y < 0));
            System.out.println();

            // compruebo que la cordenada no este ocupada por el tesoro o la mina

            if ((tablero[y][x] != "B") && (tablero[y][x] != "€")) {
                tablero[y][x] = "X";
                tableroJugador[y][x] = "X";
                mostrarArray(tableroJugador);
            } else if (tablero[y][x] == "€") {
                System.out.println("Enhorabuena! Has encontrado el tesoro");
                mostrarArray(tablero);
            } else if (tablero[y][x] == "B") {
                System.out.println("Lo siento! Has encontrado la bomba y ha explotado");
                mostrarArray(tablero);
            }
            System.out.println();
        } while ((tablero[y][x] != "€") && (tablero[y][x] != "B"));
    }

    /** muestra array */
    public static void mostrarArray(String[][] tablero) {

        // System.out.println("x 01234");
        // System.out.println("y ______");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
        System.out.println("y  -----");
        System.out.println(" x 01234");
    }

    /**
     * ubicacion aleatoria tesoro y mina
     * 
     * @param tablero
     */
    public static void ubicacionTesoroMina(String[][] tablero) {
        int tesoro;
        int mina;
        int contador = 0;

        do {
            tesoro = generarAleatorio();
            mina = generarAleatorio();
        } while (tesoro == mina);

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tesoro == contador) {
                    tablero[i][j] = "€";
                }
                if (mina == contador) {
                    tablero[i][j] = "B";
                }
                if ((contador != mina) && (contador != tesoro)) {

                    tablero[i][j] = "-";
                }
                contador++;
            }
        }
    }

    /**
     * genero aleatorio
     * 
     * @return
     */
    public static int generarAleatorio() {
        return (int) (Math.random() * (MAXIMO + 1));
    }

    /**
     * relleno el tablero de jugador con espacios para ir colocando los disparos y
     * que no se vea null
     * 
     * @param jugador
     */
    public static void rellenarArrayJugador(String[][] jugador) {
        for (int i = 0; i < jugador.length; i++) {
            for (int j = 0; j < jugador[i].length; j++) {
                jugador[i][j] = " ";
            }
            System.out.println();
        }
    }
}
