/*
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos. 
 * 
 * @autor Barbara Colomer
 */
public class T05Ejercicio22R19 {
  public static void main(String[] args) {

    for (int num = 2; num <= 100; num++) {
      boolean esPrimo = true;// se pone aqui y no fuera del bucle porque tiene que controlar como verdadero
                             // en cada iteracion
      for (int i = 2; i < num; i++) {
        if (num % i == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        System.out.print(num + "-");
      }
    }
  }
}
