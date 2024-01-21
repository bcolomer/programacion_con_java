/*
 * Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
sustituir el color blanco por colores más alegres. Realiza un programa que
genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
naranja. 
 * 
 * @autor Barbara Colomer
 */
public class T06Ejercicio18r17 {
    public static void main(String[] args) {
        int color1 = 0;
        int color2 = 0;
        int color3 = 0;
        do {
            color1 = (int) (Math.random() * 6 + 1);
            color2 = (int) (Math.random() * 6 + 1);
            color3 = (int) (Math.random() * 6 + 1);
        } while ((color1 == color2) || (color1 == color3) || (color3 == color2));
        System.out.printf("los colores sugeridos son: %s, %s, %s", eleccionColor(color1), eleccionColor(color2),
                eleccionColor(color3));
    }

    public static String eleccionColor(int color) {
        String colorear = "";
        switch (color) {
            case 1:
                colorear = "rojo";
                break;
            case 2:
                colorear = "azul";
                break;
            case 3:
                colorear = "verde";
                break;
            case 4:
                colorear = "amarillo";
                break;
            case 5:
                colorear = "violeta";
                break;
            case 6:
                colorear = "naranja";
                break;
        }
        return colorear;
    }

}
