/*
 * digitos: Cuenta el número de dígitos de un número entero. 
 * 
 * @autor Barbara Colomer
 */
public class T08Ejercicio05CuentaDigitos {
    public static void main(String[] args) {
        long numero = 987654321;
        System.out.println(cuentaDigitos(numero));
    }

    public static int cuentaDigitos(long numero) {
        int cantDigitos = 0;

        do {
            numero = numero / 10;
            cantDigitos++;
        } while (numero > 0);
        return cantDigitos;
    }

}