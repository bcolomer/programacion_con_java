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

        for (int i = 0; i < 100; i++) {
            compas = (int) (Math.random() * 25 + 4);
            if (compas % 4 == 0) {
                System.out.println(compas);
            }

        }
    }

    private static String nota(int nota) {
        String notaMusical = "";
        switch (nota) {
            case 1:
                notaMusical = "do ";
                break;
            case 2:
                notaMusical = "re ";
                break;
            case 3:
                notaMusical = "mi ";
                break;
            case 4:
                notaMusical = "fa ";
                break;
            case 5:
                notaMusical = "sol ";
                break;
            case 6:
                notaMusical = "la ";
                break;
            case 7:
                notaMusical = "si ";
                break;
        }
        return notaMusical;
    }

}
