/*
 * Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado. 
 * 
 * @autor Barbara Colomer
 */
public class T06Ejercicio09 {
    public static void main(String[] args) {
        int numero = 0;
        int contador = 0;
        do {
            numero = (int) (Math.random() * 101);
            if (numero % 2 != 0) {
                numero = (int) (Math.random() * 101);
            } else {
                System.out.println(numero);
                contador++;
            }

        } while (numero != 24);
        System.out.println("contador " + contador);
    }
}
