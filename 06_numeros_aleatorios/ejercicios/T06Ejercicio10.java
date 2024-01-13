/*
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
entre 1 y 40 caracteres. 
 * 
 * @autor Barbara Colomer
 */
public class T06Ejercicio10 {
    public static void main(String[] args) {
        int longitudLinea = 0;
        int caracter = 0;
        int linea = 0;

        for (linea = 0; linea < 10; linea++) {
            // System.out.print("linea " + linea + " ");
            longitudLinea = (int) (Math.random() * 40 + 1);
            caracter = (int) (Math.random() * 6 + 1);
            // System.out.print("longitud " + longitudLinea + " ");

            for (int longitud = 0; longitud < longitudLinea; longitud++) {
                System.out.print(elegirCaracter(caracter));
            }
            System.out.println();
        }
    }

    /**
     * funcion para elegir un caracter desde un numero de 1 a 6
     * 
     * @param caracter
     * @return
     */
    public static char elegirCaracter(int caracter) {
        char simbolo = ' ';
        switch (caracter) {
            case 1:
                simbolo = '*';
                break;
            case 2:
                simbolo = '-';
                break;
            case 3:
                simbolo = '=';
                break;
            case 4:
                simbolo = '.';
                break;
            case 5:
                simbolo = '|';
                break;
            case 6:
                simbolo = '@';
                break;
        }
        return simbolo;
    }

}
