
/*
 * Escribe un programa que convierta una cantidad de días a su equivalente en años,
 *  meses y días. Al final de la pregunta se te proporciona la tabla de códigos de colores. 
 * También puedes usar el selector de color de Google. NOTA: Considera que cada 30 días, se considera 1 mes. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class Ej02 {
  public static void main(String[] args) {
    int dias;
    int meses;
    int años;
    int dia;
    Scanner s = new Scanner(System.in);
    System.out.println("CALCULADORA DE TIEMPO");
    System.out.println("=======================");
    System.out.print("Introduzca la cantidad de dias:");
    dias = s.nextInt();
    años = dias / 365;
    meses = (dias % 365) / 30;
    dia = (dias % 365) % 30;
    s.close();
    System.out.printf(
        dias + " dias son \033[0;41m %d años\033[0m, \033[0;43m %d meses \033[0m, y \033[0;42m %d dias \033[0m, ]",
        años, meses, dia);
  }
}

/**
 * Escribe un programa que convierta una cantidad de días a su equivalente en
 * años, meses y días.
 * Al final de la pregunta se te proporciona la tabla de códigos de colores.
 * También puedes usar
 * el selector de color de Google.
 * NOTA: Considera que cada 30 días, se considera 1 mes.
 * 
 * @author Sergio Sánchez
 */
/*
 * import java.util.Scanner;
 * 
 * public class Ejercicio4 {
 * public static final String BG_RED = "\033[0;41m";
 * public static final String BOLD = "\033[1m";
 * public static final String WHITE = "\033[0;37m";
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int anios;
 * int meses;
 * int dias;
 * int diasIntroducidos;
 * System.out.println("\033[1mCALCULADORA DE TIEMPO");
 * System.out.println("=====================");
 * System.err.print("\033[0m");
 * 
 * System.out.print("Introduce una cantidad de días: ");
 * diasIntroducidos = sc.nextInt();
 * sc.close();
 * 
 * anios = diasIntroducidos / 365;
 * meses = (diasIntroducidos % 365) / 30;
 * dias = (diasIntroducidos % 365) % 30;
 * 
 * System.out.
 * printf("%d días son \033[1;41m%d años\033[0m, \033[1;48;5;226m%d meses\033[0m y \033[1;48;5;34m%d días\033[0m."
 * , diasIntroducidos, anios, meses, dias);
 * }
 * 
 * }
 */