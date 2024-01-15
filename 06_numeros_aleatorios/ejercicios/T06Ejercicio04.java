
/*
 *  Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
por espacios.
 * 
 * @autor Barbara Colomer
 */
public class T06Ejercicio04 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            // para que llegue a 10 incluido hay que multiplicar por 11
            System.out.print((int) (Math.random() * 11) + " ");
        }
    }

}
