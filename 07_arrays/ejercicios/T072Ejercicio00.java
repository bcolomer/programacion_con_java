
public class T072Ejercicio00 {

    public static void main(String[] args) {
        int iniUsuario = 0;
        int finUsuario = 0;
        int iniDivinarem = 0;
        int finDivinarem = 0;

        iniUsuario = solicitarNumeroInicial();
        finUsuario = solicitarNumeroFinal(iniUsuario);
        iniDivinarem = generarAleatorio(iniUsuario, finUsuario);
        finDivinarem = generarAleatorio(iniDivinarem, finUsuario);
        System.out.println(iniUsuario);
        System.out.println(finUsuario);
        System.out.println(iniDivinarem);
        System.out.println(finDivinarem);
    }

    public static void pantallaInicial() {
        System.out.println("-D-I-V-I-N-A-R-E-M-");
        System.out.println("Divinarem pensara un numero entre los valores que tu decidas");

    }

    /**
     * genero aleatorio para invervalo
     * 
     * @param ini
     * @param fin
     * @return
     */
    public static int generarAleatorio(int ini, int fin) {
        int numero;
        ini += 1;
        fin -= 1;
        numero = (int) (Math.random() * (fin + 1 - ini) + ini);

        return numero;
    }

    /**
     * solicita numero entero
     * 
     * @return
     */
    public static int solicitarNumeroInicial() {
        int numero;
        System.out.println("ingrese el inicio de su intervalo");
        numero = Integer.parseInt(System.console().readLine());
        return numero;
    }

    /**
     * solicita numero entero mayor a inicial
     * 
     * @param inicio
     * @return
     */
    public static int solicitarNumeroFinal(int inicio) {
        int numero;
        System.out.println("ingrese el final de su intervalo");
        do {
            numero = Integer.parseInt(System.console().readLine());
            if (numero < inicio) {
                System.out.println("Debe ingresar un numero mayor al inicial");
                System.out.println("Ingrese numero final:");
            }
        } while (numero < inicio);
        return numero;
    }
}

// public static void main(String[] args) {
// int matriz[][];
// matriz = new int[3][3];
// // matriz=[[8,-12,33], [14,1,-24], [100,51,69]];
// // matriz={{8,-12,33},{14,1,-24},{100,51,69}};
// Scanner s = new Scanner(System.in);

// /*
// * //1er ejercicio
// * int fila = 0;
// * int columna = 0;
// * int[][] numeros = { { 8, -12, 33 }, { 14, 1, -24 }, { 100, 51, 69 } };
// * System.out.println("selecciona la fila entre 0 y 2");
// * fila = s.nextInt();
// * System.out.println("selecciona la columna entre 0 y 2");
// * columna = s.nextInt();
// * s.close();
// *
// * System.out.printf("la variable numero [%d] [%d] = %d", fila, columna,
// * numeros[fila][columna]);
// * System.out.printf("la variable elegida es %d", numeros[fila][columna]);
// */

// // ejercicio 2:

// int elemento = 0;
// int[][] numeros = { { 8, -12, 33 }, { 14, 1, -24 }, { 100, 51, 69 } };

// System.out.println(numeros.length);
// System.out.println("indica que elemento quieres ver");
// elemento = s.nextInt();
// /*
// * if ((elemento >= 0) && (elemento <= 3)) {
// * System.out.println(numeros[0][elemento]);
// * } else if ((elemento >= 3) && (elemento <= 5)) {
// * System.out.println(numeros[1][elemento - 3]);
// * } else if ((elemento >= 6) && (elemento <= 8)) {
// * System.out.println(numeros[2][elemento - 6]);}
// */

// }

// }
