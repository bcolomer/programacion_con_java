import java.util.Scanner;

public class EsCapicua {
  public static void main(String[] args) {
    long numero;
    Scanner s = new Scanner(System.in);
    System.out.println("introduce numero");
    numero = s.nextLong();
    s.close();
    System.out.println(capicua(numero));

  }

  public static boolean capicua(long num) {
    long numero;
    long temporal;
    long inverso = 0;
    boolean capi;
    // Scanner s = new Scanner(System.in);

    // System.out.print("Introduce un número entero positivo: ");
    // numero = s.nextLong();

    temporal = num;// numero;

    // Invertimos el número
    for (; temporal > 0; temporal /= 10) {
      inverso = (inverso * 10) + (temporal % 10);
    }

    // Comprobamos si es capicúa
    if (num == inverso) {
      capi = true;
    } else {
      capi = false;
    }
    return capi;
  }
}