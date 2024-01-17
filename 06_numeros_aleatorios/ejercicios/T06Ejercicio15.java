/*
 * Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
con dos barras.
d) La última nota de la melodía debe coincidir con la primera. 
 * 
 * @autor Barbara Colomer
 */
public class T06Ejercicio15 {
    public static void main(String[] args) {
        int compas = 0;
        int nota = 0;
        String notaLetras = "";
        int melodia = 0;
        int notafinal = 0;

        /*
         * genero un numero aleatorio con las caracteristicas requeridas para la melodia
         * llamando a la funcion
         */
        melodia = (melodia());

        // hago que el bucle funcione tantas veces como el numero aleatrorio para la
        // meloia
        for (int vueltas = 1; vueltas <= melodia; vueltas++) {

            // guardo en nota un numero aleatorio entre 1 y 7
            nota = (int) (Math.random() * 7 + 1);

            // guardo en una variable la primera nota que sale aleatoriamente
            if (vueltas == 1) {
                notafinal = nota;

            }
            // convierto a la primera nota la ultima nota que saldra
            if (vueltas == melodia) {
                nota = notafinal;
            }

            // imprimo la nota en letras
            System.out.print(nota(nota));

            // si ya dio 4 vueltas que escriba un palote
            if (vueltas % 4 == 0) {
                System.out.print(" |");
            }

            // si esta en la vuelta final que escriba un palote extra
            if (vueltas == melodia) {
                System.out.print("|");
            }

        }
    }

    /**
     * genera un numero aleatorio multiplo de 4 entre 4 y 28
     * 
     * @return
     */
    private static int melodia() {
        int compas = 0;
        do {
            compas = (int) (Math.random() * 25 + 4);
        } while (compas % 4 != 0);

        return compas;
    }

    /**
     * funcion que convierte un nuemro del 1 al 7 en una nota escrita con letras
     * 
     * @param nota
     * @return
     */
    private static String nota(int nota) {
        String notaMusical = "";
        switch (nota) {
            case 1:
                notaMusical = " do";
                break;
            case 2:
                notaMusical = " re";
                break;
            case 3:
                notaMusical = " mi";
                break;
            case 4:
                notaMusical = " fa";
                break;
            case 5:
                notaMusical = " sol";
                break;
            case 6:
                notaMusical = " la";
                break;
            case 7:
                notaMusical = " si";
                break;
        }
        return notaMusical;
    }

}
