import java.util.Scanner;

public class T05Ejemplo01 {
  public static void main(String[] args) {

    /*
     * int i = 1;
     * 
     * while (i <= 10) {
     * System.out.print(i + ", ");
     * i++;
     * }
     */

    Scanner s = new Scanner(System.in);
    System.out.println("introduzca su edad");
    int edad = s.nextInt();
    s.close();
    for (int i = 1; i <= edad; i++) {
      System.out.println("ha cumplido " + i);
    }
  }

}
