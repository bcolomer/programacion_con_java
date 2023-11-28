
/*
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y 
 * un número leído por teclado. 
 * 
 * @autor Barbara Colomer
 */import java.util.Scanner;

public class T05Ejercicio27R24 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num = 0;
    int contador = 0;
    int suma = 0;
    System.out.println("Indique un numero y se le mostrará todos sus multiplos menores:");
    num = s.nextInt();
    s.close();

    System.out.printf("Los numeros multiplos de 3 menores que %d son:", num);
    for (int i = 1; i <= num; i++) {
      if (i % 3 == 0) {
        contador++;
        suma = suma + i;
        System.out.print(i + ", ");
      }

    }
    System.out.printf("\nHay %d numeros multiplos de 3, y todos suman %d", contador, suma);

  }
}
