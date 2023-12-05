
/*
 * Escribe un programa que calcule el volumen de un tronco de cono según la siguiente fórmula: 
 * V = (1/3)πh(R2 + r2 + Rr)
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class Ej05 {
  public static void main(String[] args) {
    double baseMayor;
    double baseMenor;
    double h;
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el radio de la base mayor en centimetros");
    baseMayor = s.nextDouble();
    System.out.println("introduzca el radio de la base menor en centimetros");
    baseMenor = s.nextDouble();
    System.out.println("Introduzca la altura en centimetros");
    h = s.nextDouble();
    s.close();
    double volumen = ((Math.PI) * h)
        * (((Math.pow(baseMayor, 2)) + (Math.pow(baseMenor, 2))) + (baseMayor * baseMenor)) / 3;
    System.out.printf("El volumen del toroide es de \033[1;31m %.4f cm \u00B3\033[0m.", volumen);
  }
}

/**
 * Escribe un programa que calcule el volumen de un tronco de cono según la
 * siguiente fórmula:
 * V = (1/3)πh(R2 + r2 + Rr)
 * El título del ejercicio y el valor resultante para el volumen deben ser los
 * únicos que aparezcan en negritas;
 * además, el valor del volumen deberá mostrarse también en color rojo y con 4
 * cifras decimales.
 * AYUDA: El código hexadecimal Unicode para el exponente al cubo (³) es \u00B3.
 * 
 * @author Sergio Sánchez
 */
/*
 * import java.util.Scanner;
 * public class Ejercicio2 {
 * 
 * public static void main(String[] args) {
 * 
 * Scanner sc = new Scanner(System.in);
 * double radioMayor;
 * double radioMenor;
 * double altura;
 * double volumen;
 * 
 * System.out.println("\033[1mVOLUMEN DE UN TRONCO DE CONO");
 * System.out.println("=============================");
 * System.err.print("\033[0m");
 * 
 * System.out.print("Introduzca el radio de la base mayor R (cm): ");
 * radioMayor = sc.nextDouble();
 * 
 * System.out.print("Introduzca el radio de la bade menor r (cm): ");
 * radioMenor = sc.nextDouble();
 * 
 * System.out.print("Introduzca la altura h (cm): ");
 * altura = sc.nextDouble();
 * 
 * volumen = Math.PI * altura * (Math.pow(radioMayor, 2) + Math.pow(radioMenor,
 * 2) + (radioMayor * radioMenor))/3;
 * 
 * System.out.
 * printf("El volumen del tronco del cono es de \033[1;31m%.4f cm\u00B3",
 * volumen);
 * System.out.println("\033[0m");
 * 
 * sc.close();
 * 
 * }
 * 
 * }
 */