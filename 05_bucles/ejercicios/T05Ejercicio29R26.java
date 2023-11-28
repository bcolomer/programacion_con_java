
/*
 * Escribe un programa que muestre por pantalla todos los números enteros positivos 
 * menores a uno leído por teclado que no sean divisibles entre otro también leído 
 * de igual forma. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio29R26 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int numeroA;
    int numeroB;
    System.out.println(
        "Introduzca dos numeros (separados por tecla Enter) para saber los numeros no divisibles entre ellos.");
    numeroA = s.nextInt();
    numeroB = s.nextInt();
    s.close();
    System.out.printf("Los numeros menores de %d no divisibles por %d son: ", numeroA, numeroB);
    for (int i = 1; i < numeroA; i++) {
      if (i % numeroB != 0) {
        System.out.print(i + " ");
      }
    }
  }
}
