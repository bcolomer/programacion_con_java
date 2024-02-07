
/*
 * Se quiere crear el juego «Búsqueda del Tesoro» que, como su propio nombre indica, 
 * consiste en buscar un tesoro en un campo plagado de minas. El tablero de juego tiene
 *  unas dimensiones de 6 filas y 8 columnas donde se colocará de forma aleatoria el tesoro
 *  y un número de minas determinado por el nivel de juego elegido por el usuario antes de comenzar.
 *  Los niveles serán fácil (1 mina), normal (3 minas) y difícil (6 minas). 
 * De esta manera, antes de empezar a jugar, se deberá preguntar por el nivel del juego, iniciando 
 * el tablero con el número de minas correspondiente. 
 * A partir de ese momento, el jugador irá introduciendo las coordenadas (x, y) de sus jugadas hasta 
 * encontrar el tesoro o toparse con una mina. Si tras realizar el disparo hay una mina a una casilla 
 * de distancia, el programa deberá avisar indicando: «¡Cuidado! ¡Hay una mina cerca!».
 * El juego finaliza con el mensaje: «¡Enhorabuena! ¡Has encontrado el tesoro!» cuando el jugador se 
 * encuentra con el tesoro. Sin embargo, si encuentra la mina, el jugador pierde la partida y se mostrará 
 * el mensaje: «¡BOOOM! Lo siento, has encontrado una mina».
 * Al finalizar, se muestra el tablero completo mostrando los disparos realizados por el jugador, 
 * la/s mina/s y el tesoro.
 * Recuerda, deberá controlarse la posibilidad de que el jugador introduzca un valor para las coordenadas 
 * que exceda las dimensiones del tablero, en cuyo caso se le deberá indicar convenientemente.
 * Se muestran a continuación un par de vídeos de demostración de funcionamiento de la aplicacion.
 * Debe tenerse en cuenta que, para realizar el borrado de pantalla, tendrás que utilizar el siguiente código de escape:  \033[H\033[2J. 
 * 
 * @autor Barbara Colomer
 */

public class ExamenTema6y7 {

    // TODO NO ME DIO TIEMPO!
    // TODO CONTROLAR QUE NO SE SALGA CUANDO PIDO COORDENADAS X E Y
    // TODO PONER TRY CATCH

    // TODO DARLE la vuelta al indice y y modificar cooredandas
    // TODO HACER QUE AVISE CUANDO HAY BOMBA CERCA
    // TODO MODO NOMAL REPITE LAS BOMBAS POR ESO SALEN DOS, ESTABA PUESTO QUE FUERA
    // DISTINO , EN LA CONDICION DE SALIDA DE ALEATORIO Y TENIA QUE SER QUE FUERA
    // IGUALES

    // genero constantes para la cantidad de filas y columnas del tablero
    public static final int FILAS = 6;
    public static final int COLUMNAS = 8;

    // creo los valores para la bomba y el tesoro
    public static final String BOMBA = "B";
    public static final String TESORO = "$";

    public static void main(String[] args) {

        int opcion;

        String[][] tablero;
        String[][] tableroJugador;

        tablero = new String[FILAS][COLUMNAS];
        tableroJugador = new String[FILAS][COLUMNAS];

        System.out.println();
        pantallaInicial();

        // registro opcion de juego
        do {
            opcion = Integer.parseInt(System.console().readLine());
            if ((opcion < 0) || (opcion > 2)) {
                System.out.println("Error. debe introducir valores validos:");
                pantallaInicial();
            }
        } while ((opcion < 0) || (opcion > 2));

        // limpia pantalla

        System.out.printf("\033[H\033[2J");
        System.out.flush();

        // segun opcion registrada->nivel de juego
        switch (opcion) {
            case 0:
                generojuegoFacil(tablero);
                juego(tablero, tableroJugador);
                break;
            case 1:
                generojuegoNormal(tablero);
                juego(tablero, tableroJugador);
                break;
            case 2:
                generojuegoDificil(tablero);
                juego(tablero, tableroJugador);
                break;

        }

    }

    public static void juego(String[][] tablero, String[][] tableroJugador) {
        int x;
        int y;

        mostrarTablero(tablero);// control para saber donde estan las bombas y el
        // premio
        System.out.println();
        creoTableroJugador(tableroJugador);
        mostrarTablero(tableroJugador);

        do {
            System.out.println();
            x = coordenadax();
            y = coordenaday();
            // limpia pantalla

            System.out.printf("\033[H\033[2J");
            System.out.flush();

            if (tablero[y][x] == "B") {
                System.out.println("«¡BOOOM! Lo siento, has encontrado una mina»");
                mostrarTablero(tablero);

            } else if (tablero[y][x] == "$") {
                System.out.println("«¡Enhorabuena! ¡Has encontrado el tesoro!»");
                mostrarTablero(tablero);

            } else {
                tablero[y][x] = "X";
                tableroJugador[y][x] = "X";
                mostrarTablero(tableroJugador);

            }

        } while ((tablero[y][x] != "$") && (tablero[y][x] != "B"));
    }

    /**
     * genero tablero para juego version dificl con seis minas
     * 
     * @param tablero
     */
    public static void generojuegoDificil(String[][] tablero) {
        int mina1;
        int mina2;
        int mina3;
        int mina4;
        int mina5;
        int mina6;
        int premio;
        int contador = 0;
        do {
            mina1 = generarAleatorio();
            mina2 = generarAleatorio();
            mina3 = generarAleatorio();
            mina4 = generarAleatorio();
            mina5 = generarAleatorio();
            mina6 = generarAleatorio();
            premio = generarAleatorio();

        } while ((mina1 == premio) ||
                (mina1 == mina2) ||
                (mina1 == mina3) ||
                (mina1 == mina4) ||
                (mina1 == mina5) ||
                (mina1 == mina6) ||
                (mina2 == premio) ||
                (mina2 == mina3) ||
                (mina2 == mina4) ||
                (mina2 == mina5) ||
                (mina2 == mina6) ||
                (mina3 == premio) ||
                (mina3 == mina4) ||
                (mina3 == mina5) ||
                (mina3 == mina6) ||
                (mina4 == premio) ||
                (mina4 == mina5) ||
                (mina4 == mina6) ||
                (mina5 == premio) ||
                (mina5 == mina6) ||
                (mina6 == premio));

        for (int filas = 0; filas < tablero.length; filas++) {
            for (int columnas = 0; columnas < tablero[filas].length; columnas++) {
                if (mina1 == contador) {
                    tablero[filas][columnas] = BOMBA;
                }
                if (mina2 == contador) {
                    tablero[filas][columnas] = BOMBA;
                }
                if (mina3 == contador) {
                    tablero[filas][columnas] = BOMBA;
                }
                if (mina4 == contador) {
                    tablero[filas][columnas] = BOMBA;
                }
                if (mina5 == contador) {
                    tablero[filas][columnas] = BOMBA;
                }
                if (mina6 == contador) {
                    tablero[filas][columnas] = BOMBA;
                }
                if (premio == contador) {
                    tablero[filas][columnas] = TESORO;
                } else if ((contador != premio) &&
                        (contador != mina1) &&
                        (contador != mina2) &&
                        (contador != mina3) &&
                        (contador != mina4) &&
                        (contador != mina5) &&
                        (contador != mina6)) {
                    tablero[filas][columnas] = " ";
                }
                contador++;
            }
        }
    }

    /**
     * genero tablero para juego version medio con tres minas
     * 
     * @param tablero
     */
    public static void generojuegoNormal(String[][] tablero) {
        int mina1;
        int mina2;
        int mina3;
        int premio;
        int contador = 0;
        do {
            mina1 = generarAleatorio();
            mina2 = generarAleatorio();
            mina3 = generarAleatorio();
            premio = generarAleatorio();

        } while ((mina1 == premio) || (mina2 == premio) || (mina3 == premio) || (mina1 == mina2) || (mina1 == mina3)
                || (mina2 == mina3));

        for (int filas = 0; filas < tablero.length; filas++) {
            for (int columnas = 0; columnas < tablero[filas].length; columnas++) {
                if (mina1 == contador) {
                    tablero[filas][columnas] = BOMBA;
                }
                if (mina2 == contador) {
                    tablero[filas][columnas] = BOMBA;
                }
                if (mina3 == contador) {
                    tablero[filas][columnas] = BOMBA;
                }

                if (premio == contador) {
                    tablero[filas][columnas] = TESORO;
                } else if ((contador != premio) && (contador != mina1) && (contador != mina2) && (contador != mina3)) {
                    tablero[filas][columnas] = " ";
                }
                contador++;
            }
        }

    }

    /**
     * creo el tablero de jugador vacio
     * 
     * @param tablero
     */
    public static void creoTableroJugador(String[][] tablero) {
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                tablero[fila][columna] = " ";
            }
            System.out.println();
        }
    }

    /**
     * completo tablero de juego
     * 
     * @param tablero
     * @param x
     * @param y
     */
    public static void juego(String[][] tablero, int x, int y) {
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                if ((fila == y) && (columna == y)) {
                    tablero[fila][columna] = "X";
                }
            }
        }

    }

    /**
     * pido coordenada y
     * 
     * @return
     */
    public static int coordenaday() {
        int y;
        do {
            System.out.println("Coordenada y:");
            y = Integer.parseInt(System.console().readLine());
            if ((y < 0) || (y > FILAS)) {
                System.out.println("Ingrese una coordenada segun tablero");
            }
        } while ((y < 0) || (y > FILAS));
        return y;
    }

    /**
     * pido coordenada x
     * 
     * @return
     */
    public static int coordenadax() {
        int x;
        do {
            System.out.println("Coordenada x:");
            x = Integer.parseInt(System.console().readLine());
            if ((x < 0) || (x > FILAS)) {
                System.out.println("Ingrese una coordenada segun tablero");
            }
        } while ((x < 0) || (x > FILAS));
        return x;
    }

    /**
     * muestro por pantalla tablero de juego
     * 
     * @param array
     */
    public static void mostrarTablero(String[][] array) {
        for (int fila = 0; fila < array.length; fila++) {
            System.out.print(fila + "|");
            for (int columna = 0; columna < array[fila].length; columna++) {
                System.out.print(array[fila][columna]);
            }
            System.out.println();
        }
        System.out.println("y---------");
        System.out.print("x ");
        for (int i = 0; i < COLUMNAS; i++) {
            System.out.print(i);

        }

    }

    /**
     * genero tablero para juego version facil con una mina
     * 
     * @param tablero
     */
    public static void generojuegoFacil(String[][] tablero) {
        int mina;
        int premio;
        int contador = 0;
        do {
            mina = generarAleatorio();
            premio = generarAleatorio();

        } while (mina == premio);
        for (int filas = 0; filas < tablero.length; filas++) {
            for (int columnas = 0; columnas < tablero[filas].length; columnas++) {
                if (mina == contador) {
                    tablero[filas][columnas] = BOMBA;

                }
                if (premio == contador) {
                    tablero[filas][columnas] = TESORO;
                } else if ((contador != premio) && (contador != mina)) {
                    tablero[filas][columnas] = " ";
                }
                contador++;
            }
        }

    }

    /**
     * genero numero aleatorio segun intervalo
     * 
     * @return
     */
    public static int generarAleatorio() {
        int dato;
        int intervalo = FILAS * COLUMNAS;

        dato = (int) (Math.random() * (intervalo + 1));
        return dato;
    }

    /**
     * imprimo pantalla inicial del juego
     */
    public static void pantallaInicial() {
        System.out.println("LA BUSQUEDA DEL TESORO");
        System.out.println("0. Facil");
        System.out.println("1. Normal");
        System.out.println("2. Dificil");
        System.out.println("Elije tu nivel de dificultad:");

    }

}
