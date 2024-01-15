/*
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor. 
 * 
 * @autor Barbara Colomer
 */
public class T06Ejercicio13 {
    public static void main(String[] args) {
        int dado1 = 0;
        int dado2 = 0;
        int contador = 0;

        do {
            contador++;
            dado1 = tirada();
            dado2 = tirada();
            System.out.printf("la tirada %d es: 1er dado= %d, 2do dado= %d\n", contador, dado1, dado2);

        } while (dado1 != dado2);
    }

    private static int tirada() {
        return (int) (Math.random() * 6 + 1);
    }
}
