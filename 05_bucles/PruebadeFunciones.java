import biblioteca.Matematicas;
import java.util.Scanner;

public class PruebadeFunciones {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("escribe numero");
    long num = s.nextLong();
    s.close();
    if (Matematicas.capicua(num)) {
      System.out.println("bingo");
    } else {
      System.out.println("ooooohhh");
    }
  }
}
