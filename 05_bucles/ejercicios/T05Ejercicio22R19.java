/*
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos. 
 * 
 * @autor Barbara Colomer
 */
public class T05Ejercicio22R19 {
  public static void main(String[] args) {

    for (int i = 2; i <= 100; i++) {
      boolean esPrimo = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          esPrimo = false;

        }
      }
      if (esPrimo) {
        System.out.print(i + " ");
      }
    }

  }
}
/*
 * for (int num = 2; num <= 100; num++) {
 * boolean esPrimo = true;// se pone aqui y no fuera del bucle porque tiene que
 * // controlar como verdadero
 * // en cada iteracion
 * for (int i = 2; i < num; i++) {
 * if (num % i == 0) {
 * esPrimo = false;
 * }
 * }
 * if (esPrimo) {
 * System.out.print(num + "-");
 * }
 * }
 * }
 */
// funciona bien

// solucion profesor:
/*
 * int i = 2;// empieza en dos porque es la variable de control para saber si el
 * numero es
 * // primo o no
 * int numero;
 * for (numero = 2; numero <= 100; numero++) {
 * if (esPrimo(numero)) {
 * System.out.printf("%d, ", numero);
 * }
 * }
 * 
 * }
 * 
 * /**
 * comprueba si el numero es primo o no
 * 
 * @param numero
 * 
 * @return
 */
/*
 * public static boolean esPrimo(int numero) {
 * int i = 2;
 * while ((i < numero) && (numero % i != 0)) {
 * i++;
 * }
 * return (i >= numero);
 * 
 * }
 * }
 */