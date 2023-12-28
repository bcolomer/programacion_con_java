
/*
 * quitaPorDetras: Le quita a un número n dígitos por detrás (por la
derecha). 
 * 
 * @autor Barbara Colomer
 */
public class T08Ejercicio09QuitaDetras {
    public static void main(String[] args) {
        int digitos = 2;
        long numero = 123456;
        System.out.println(quitaDetras(digitos, numero));
    }

    public static long quitaDetras(int digitos, long numero) {

        int contador = 0;

        do {
            numero = numero / 10;
            contador++;
        } while (contador < digitos);

        return numero;
    }
}
