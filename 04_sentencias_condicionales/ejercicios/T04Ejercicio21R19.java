
/*
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
la nota media anterior. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio21R19 {
  public static void main(String[] args) {
    double nota1;
    double nota2;
    double media;
    String recuperacion = "";

    Scanner s = new Scanner(System.in);
    System.out.println("Por favor ingrese la nota del primer examen");
    nota1 = s.nextDouble();
    System.out.println("Escriba la nota del segundo examen");
    nota2 = s.nextDouble();
    media = (nota1 + nota2) / 2;
    if (media >= 5) {
      System.out.printf("Aprobado. Su nota media es %.2f", media);
    } else {
      System.out.println("Indique si  su examen de recuperacion ha sido apto o no apto");
      recuperacion = System.console().readLine();
      if (recuperacion.equals("apto")) {
        System.out.println("Su nota es un 5");
      } else {
        System.out.println("Su nota media de los dos examenes es " + media);
      }
    }
    s.close();
  }
}
