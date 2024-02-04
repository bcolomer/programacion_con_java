
/*
 * define un array bidimensional de 3*3 y solicita al usuario slos 
         emlemenos que debe contener cada una de sus celdas. luego mostrar el contenido del array 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T072Ejercicios000 {
    // public static void main(String[] args) {
    // int[][] numeros;
    // numeros = new int[3][3];

    // Scanner s = new Scanner(System.in);
    // System.out.println("introduzca el contenido de las celdas, separado con
    // intro");
    // for (int filas = 0; filas < numeros.length; filas++) {
    // for (int columnas = 0; columnas < numeros[filas].length; columnas++) {
    // numeros[filas][columnas] = s.nextInt();
    // }

    // }
    // for (int filas = 0; filas < numeros.length; filas++) {
    // for (int columnas = 0; columnas < numeros[filas].length; columnas++) {
    // System.out.print(numeros[filas][columnas] + "-");
    // }
    // System.out.println();
    // }
    // s.close();

    // }
    public static void main(String[] args) {
        String palabras[] = new String[8];
        String colores[] = new String[8];
        int indiceColores = 0;
        int maximosDigitos = 0;

        System.out.println();
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce una palabra: ");
            palabras[i] = System.console().readLine();
            // Saber cual es la palabra mas grande
            if (palabras[i].length() > maximosDigitos) {
                maximosDigitos = palabras[i].length();
            }
            // Añadir los colores
            switch (palabras[i]) {
                case "rojo":
                case "verde":
                case "azul":
                case "amarillo":
                case "naranja":
                case "rosa":
                case "negro":
                case "blanco":
                case "morado":
                    colores[indiceColores] = palabras[i];
                    indiceColores++;
                    break;
                default:
                    break;
            }
        }

        // Pintamos la array original **********************************************
        System.out.println();
        System.out.println("Array original:");
        System.out.println();

        // Primera linea de la tabla

        for (int i = 0; i < palabras.length; i++) {
            if (i == 0) {
                System.out.print("┌");
            }

            // Centro
            for (int j = 0; j < maximosDigitos + 2; j++) {
                System.out.print("─");
            }

            if (i == (palabras.length - 1)) {
                System.out.println("┐");
            } else {
                System.out.print("┬");
            }
        }

        // Indice de la tabla

        for (int i = 0; i < palabras.length; i++) {
            System.out.print("│ " + i);
            for (int j = 0; j < maximosDigitos; j++) {
                System.out.print(" ");
            }
        }
        System.out.println("│");

        // Segunda linea de la tabla

        for (int i = 0; i < palabras.length; i++) {
            if (i == 0) {
                System.out.print("├");
            }

            // Centro
            for (int j = 0; j < maximosDigitos + 2; j++) {
                System.out.print("─");
            }

            if (i == (palabras.length - 1)) {
                System.out.println("┤");
            } else {
                System.out.print("┼");
            }
        }

        // Palabras de la tabla

        for (int i = 0; i < palabras.length; i++) {
            System.out.print("│ " + palabras[i]);
            for (int j = 0; j <= (maximosDigitos - palabras[i].length()); j++) {
                System.out.print(" ");
            }
        }
        System.out.println("│");

        // Ultima linea de la tabla

        for (int i = 0; i < palabras.length; i++) {
            if (i == 0) {
                System.out.print("└");
            }

            // Centro
            for (int j = 0; j < maximosDigitos + 2; j++) {
                System.out.print("─");
            }

            if (i == (palabras.length - 1)) {
                System.out.println("┘");
            } else {
                System.out.print("┴");
            }
        }

        System.out.println();

        // Pintamos la array final **********************************************
        System.out.println();
        System.out.println("Array final:");
        System.out.println();

        // Primera linea de la tabla

        for (int i = 0; i < colores.length; i++) {
            if (i == 0) {
                System.out.print("┌");
            }

            // Centro
            for (int j = 0; j < maximosDigitos + 2; j++) {
                System.out.print("─");
            }

            if (i == (palabras.length - 1)) {
                System.out.println("┐");
            } else {
                System.out.print("┬");
            }
        }

        // Indice de la tabla

        for (int i = 0; i < colores.length; i++) {
            System.out.print("│ " + i);
            for (int j = 0; j < maximosDigitos; j++) {
                System.out.print(" ");
            }
        }
        System.out.println("│");

        // Segunda linea de la tabla

        for (int i = 0; i < colores.length; i++) {
            if (i == 0) {
                System.out.print("├");
            }

            // Centro
            for (int j = 0; j < maximosDigitos + 2; j++) {
                System.out.print("─");
            }

            if (i == (colores.length - 1)) {
                System.out.println("┤");
            } else {
                System.out.print("┼");
            }
        }

        // Palabras de la tabla

        // Primero los colores
        for (int i = 0; i < indiceColores; i++) {
            System.out.print("│ " + colores[i]);
            for (int j = 0; j <= (maximosDigitos - colores[i].length()); j++) {
                System.out.print(" ");
            }
        }

        // Las palabras menos los colores
        for (int i = 0; i < palabras.length; i++) {
            switch (palabras[i]) {
                case "rojo":
                case "verde":
                case "azul":
                case "amarillo":
                case "naranja":
                case "rosa":
                case "negro":
                case "blanco":
                case "morado":
                    break;
                default:
                    System.out.print("│ " + palabras[i]);
                    for (int j = 0; j <= (maximosDigitos - palabras[i].length()); j++) {
                        System.out.print(" ");
                    }
                    break;
            }
        }

        System.out.println("│");

        // Ultima linea de la tabla

        for (int i = 0; i < colores.length; i++) {
            if (i == 0) {
                System.out.print("└");
            }

            // Centro
            for (int j = 0; j < maximosDigitos + 2; j++) {
                System.out.print("─");
            }

            if (i == (colores.length - 1)) {
                System.out.println("┘");
            } else {
                System.out.print("┴");
            }
        }

        System.out.println();

    }
}
