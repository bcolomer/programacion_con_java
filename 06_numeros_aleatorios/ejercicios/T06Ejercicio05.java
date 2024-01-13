
/*
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números. 
 * 
 * @autor Barbara Colomer
 */public class T06Ejercicio05 {
    public static void main(String[] args) {
        int numero = 0;
        double suma = 0;
        int maximo = 0;
        int minimo = 199;
        int contador = 0;
        double media = 0;

        for (contador = 0; contador < 50; contador++) {
            numero = (int) (Math.random() * 100 + 100);
            System.out.print(numero + " ");
            maximo = (numero > maximo) ? numero : maximo;
            minimo = (minimo > numero) ? numero : minimo;
            suma += numero;
        }
        media = suma / 50;
        System.out.printf(
                "\nEl numero maximo es %d. \nEl minimo es %d. \nLa media de todos los numeros mostrados es %.2f",
                maximo, minimo, media);

    }

}
