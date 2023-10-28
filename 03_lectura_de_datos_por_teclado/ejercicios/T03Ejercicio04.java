
/**
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T03Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out
        .println(
            "Introduzca dos numeros separados con espacio para poder recibir los resultados de las operaciones. Utilice la coma para separar decimales");
    double num1 = s.nextDouble();
    double num2 = s.nextDouble();
    s.close();
    double suma = num1 + num2;
    double multiplicacion = num1 * num2;
    double resta = num1 - num2;
    double division = num1 / num2;

    System.out.printf("La suma de los numeros introducidos es %.2f \n", suma);
    System.out.printf("La resta de los numeros introducidos es %.2f \n", resta);
    System.out.printf("La multiplicación de los numeros introducidos es %.2f \n", multiplicacion);
    System.out.printf("La division de los numeros introducidos es %.2f ", division);
  }

}
