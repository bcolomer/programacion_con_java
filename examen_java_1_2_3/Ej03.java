
/*
 * Uno de los factores que mide la vita útil de un disco duro SSD es la cantidad de TWB
 *  (TeraBytes Written). Así, un SSD Crucial MX500 con 360 TWB, si queremos que tenga
 *  una vida útil de 10 años, puedes escribir como máximo aproximadamente 0.0986 
 * terabytes (98.6 GB) de datos por día.Implemente un programa que pida la cantidad 
 * del factor TWB de un disco duro SSD y que calcule el número de terabytes (TB)
 *  y su equivalencia en gigabytes GB de datos que podemos escribir por día como 
 * máximo si deseas que tu SSD dure 6 años. NOTA: Considera, por defecto, que un año son 365 días. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class Ej03 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el factor TBW de tu disco duro SSD:");
    double twb = s.nextDouble();

    double solucion = twb / 6 / 365;
    double giga = solucion * 1024;
    System.out.println("VIDA UTIL SSD");
    System.out.println("================");
    System.out.printf("la cantidad maxima de terabytes que puedes escribir por dia es de: %.4f TB (%.1f GB)", solucion,
        giga);
    s.close();
  }
}
