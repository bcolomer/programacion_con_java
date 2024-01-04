import java.util.Scanner;

public class T08Ejercicio001ReExamen12345 {
    public static void main(String[] args) {

        long numero = 0;
        String grafica = "";
        boolean excepcion = false;
        long volteado = 0;
        int modulo = 0;
        long componer = 0;
        int diferenciadigitos = 0;
        int numeroMayor = 0;
        Scanner s = new Scanner(System.in);

        System.out.printf("\033[32m GRAPHIFY\n===================\n");
        System.out.print("Introduce un numero:");
        try {
            numero = s.nextLong();
        } catch (Exception InputMismatchException) {
            System.out.println("Error: debe introducir un numero");
            excepcion = true;

        }
        if (!excepcion) {
            if (numero < 0) {
                System.out.println("ERROR: el número tiene que ser mayor que cero.");
            } else {
                System.out.println("Dibujo la gráfica en blanco y negro o en color (B|C)?");
                grafica = s.next();

            }
        }
        s.close();

        if (grafica.equals("B")) {
            volteado = voltea(numero);
            diferenciadigitos = cuentaDigitos(numero) - cuentaDigitos(volteado);
            numeroMayor = numeroMayor(numero) + 1;

            do {
                modulo = (int) volteado % 10;
                volteado = volteado / 10;
                componer = (componer * 10) + modulo;
                printLineasHorizontales(numeroMayor);
                System.out.print("\n| " + modulo + " ");
                for (int i = 0; i < numeroMayor; i++) {
                    if (i < modulo) {
                        System.out.print("| * ");
                    } else {
                        System.out.print("|   ");
                    }
                }
                System.out.println();
            } while (volteado > 0);

            if ((diferenciadigitos >= 1)) {
                for (int i = 0; i < diferenciadigitos; i++) {
                    printLineasHorizontales(numeroMayor);
                    System.out.print("\n| 0 ");
                    printPalotes(numeroMayor);
                    System.out.println();
                }
            }
            printLineasHorizontales(numeroMayor);

        } else if (grafica.equals("C")) {
            volteado = voltea(numero);
            diferenciadigitos = cuentaDigitos(numero) - cuentaDigitos(volteado);
            numeroMayor = numeroMayor(numero) + 1;
            lineaSuperiorColor(numeroMayor);
            do {
                modulo = (int) volteado % 10;
                volteado = volteado / 10;
                componer = (componer * 10) + modulo;

                System.out.print("\n\u2560 " + modulo + " ");
                for (int i = 0; i < numeroMayor; i++) {
                    if (i < modulo) {
                        pintarColor(modulo);
                        /*
                         * switch (modulo) {
                         * case 1:
                         * case 4:
                         * case 3:
                         * case 2:
                         * System.out.print("\u2560 \033[41m \033[0m\033[32m ");
                         * break;
                         * case 5:
                         * case 6:
                         * System.out.print("\u2560 \033[42m \033[0m\033[32m ");
                         * break;
                         * case 7:
                         * case 8:
                         * System.out.print("\u2560 \033[44m \033[0m\033[32m ");
                         * break;
                         * case 9:
                         * System.out.print("\u2560 \033[45m \033[0m\033[32m ");
                         * break;
                         * }
                         */
                    } else {
                        System.out.print("\u2560   ");
                    }
                }
                System.out.println();
                if (volteado >= 1) {
                    lineaMediaColor(numeroMayor);
                }
            } while (volteado > 0);

            if ((diferenciadigitos >= 1)) {
                // lineaMediaColor(numeroMayor);
                for (int i = 0; i < diferenciadigitos; i++) {
                    lineaMediaColor(numeroMayor);
                    System.out.print("\n\u2560 0 ");
                    printPalotesColor(numeroMayor);
                    System.out.println();

                }
            }

            lineaInferiorColor(numeroMayor);
        } else {
            System.out.println("Has introducido caracter incorrecto, las opciones válidas son \"B\" o \"C\".");
        }
    }

    /**
     * funcion para darle la vuelta a un numero
     * 
     * @param numero
     * @return
     */
    public static long voltea(long numero) {
        long volteado = 0;
        int modulo = 0;

        do {
            modulo = (int) (numero % 10);
            numero = numero / 10;
            volteado = (volteado * 10) + modulo;

        } while (numero > 0);
        return volteado;
    }

    /**
     * funcion para contar la cant de digitos que tiene un numero
     * 
     * @param numero
     * @return
     */
    public static int cuentaDigitos(long numero) {
        int digitosNum = 0;
        long volteado = 0;
        int modulo = 0;
        do {
            modulo = (int) (numero % 10);
            numero = numero / 10;
            volteado = (volteado * 10) + modulo;
            digitosNum++;

        } while (numero > 0);
        return digitosNum;
    }

    /**
     * funcion que indica cual es el digito mayor de un numero
     * 
     * @param numero
     * @return
     */
    public static int numeroMayor(long numero) {
        int numeroMayor = 0;
        long volteado = 0;
        int modulo = 0;

        do {
            modulo = (int) (numero % 10);
            numero = numero / 10;
            volteado = (volteado * 10) + modulo;
            numeroMayor = (modulo > numeroMayor) ? numeroMayor = modulo : numeroMayor;
        } while (numero > 0);
        return numeroMayor;
    }

    /**
     * funcion para imprimir las lineas que separan las filas
     * 
     * @param numeroMayor
     */
    public static void printLineasHorizontales(int numeroMayor) {
        for (int i = 0; i < numeroMayor; i++) {
            System.out.print(" ---");
        }
    }

    /**
     * funcion para imprimir la linea superior en version color
     * 
     * @param numeroMayor
     */
    public static void lineaSuperiorColor(int numeroMayor) {
        System.out.print("\u2554\u2550\u2550\u2550");
        for (int i = 1; i <= numeroMayor - 1; i++) {
            System.out.print("\u2566\u2550\u2550\u2550");
        }
        System.out.print("\u2557");
    }

    /**
     * funcion para imprimir la linea inferior en version color
     * 
     * @param numeroMayor
     */
    public static void lineaInferiorColor(int numeroMayor) {
        System.out.print("\u255A\u2550\u2550\u2550");
        for (int i = 1; i <= numeroMayor - 1; i++) {
            System.out.print("\u2569\u2550\u2550\u2550");
        }
        System.out.print("\u255D");
    }

    /**
     * funcion para imprimir la linea media en version color
     * 
     * @param numeroMayor
     */
    public static void lineaMediaColor(int numeroMayor) {
        System.out.print("\u2560\u2550\u2550\u2550");
        for (int i = 1; i <= numeroMayor - 1; i++) {
            System.out.print("\u2560\u2550\u2550\u2550");
        }
        System.out.print("\u2560");
    }

    /**
     * funcion para imprimir los palotes
     * 
     * @param numeroMayor
     */
    public static void printPalotes(int numeroMayor) {
        for (int i = 0; i < numeroMayor; i++) {
            System.out.print("|   ");
        }
    }

    /**
     * funcion para imprimir los palotes del cero al final en color
     * 
     * @param numeroMayor
     */
    public static void printPalotesColor(int numeroMayor) {
        for (int i = 0; i < numeroMayor; i++) {
            System.out.print("\u2560   ");
        }
    }

    public static void pintarColor(int modulo) {
        switch (modulo) {
            case 1:
            case 4:
            case 3:
            case 2:
                System.out.print("\u2560 \033[41m \033[0m\033[32m ");
                break;
            case 5:
            case 6:
                System.out.print("\u2560 \033[42m \033[0m\033[32m ");
                break;
            case 7:
            case 8:
                System.out.print("\u2560 \033[44m \033[0m\033[32m ");
                break;
            case 9:
                System.out.print("\u2560 \033[45m \033[0m\033[32m ");
                break;
        }
    }
}
/*
 * public static void pintarColor(int modulo){
 * String imprimir = "";
 * switch (modulo) {
 * case 1:
 * case 4:
 * case 3:
 * case 2:
 * imprimir ="\u2560 \033[41m \033[0m\033[32m ";
 * break;
 * case 5:
 * case 6:
 * imprimir ="\u2560 \033[42m \033[0m\033[32m ";
 * break;
 * case 7:
 * case 8:
 * imprimir ="\u2560 \033[44m \033[0m\033[32m ";
 * break;
 * case 9:
 * imprimir ="\u2560 \033[45m \033[0m\033[32m ";
 * break;
 * }
 * }
 */