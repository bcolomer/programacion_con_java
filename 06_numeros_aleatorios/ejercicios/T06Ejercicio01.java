/*
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados). 
 * 
 * @autor Barbara Colomer
 */
public class T06Ejercicio01 {
    public static void main(String[] args) {
        int dado = 0;
        int suma = 0;

        System.out.print("\nTirada de tres dados: ");

        for (int contador = 1; contador <= 3; contador++) {
            dado = randomNumber();
            System.out.print(dado + " ");
            suma += dado;
        }
        System.out.println();
        System.out.println("suma: " + suma);
    }

    /**
     * devuelve numero aleatorio entre 1 y 6
     * 
     * @return
     */
    public static int randomNumber() {
        return (int) (Math.random() * 6 + 1);

    }
}
