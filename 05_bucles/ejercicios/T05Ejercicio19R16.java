
/*
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe 
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe 
 * pedir por teclado. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio19R16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int altura = 0;
    char relleno;
    int incremento = 1;
    int columna;
    System.out.println("\033[1m------BIENVENIDO A EGIPTO------\033[0m");
    System.out.println("Introduzca la altura para la piramide");
    altura = s.nextInt();
    System.out.println("Introduzca el caracter de relleno, solo se tendrá en cuenta el primer caracter introducido");
    relleno = s.next().charAt(0);
    s.close();

    for (int i = 1; i <= altura; i++) {// esto imprime 3 lineas aunque la primera esta vacia
      System.out.println("");// esto es para que haga salto de linea en cada linea de altura
      for (int j = i; j < (altura + 1); j++) {// esto imprime los espacios, aunque la priimera linea tambien esta vacia
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(relleno);
      }
      for (int l = 2; l <= i; l++) {// la otra mitad de la piramide empieza en dos
        // para que en la 1era linea imprima solo 1
        System.out.print(relleno);
      }
    }
    System.out.println("    a partir de aca la piramide del profesor");
    /**
     * funcion para que la piramide pinte altura
     */
    // public static void dibujarpiramide(altura, relleno) {
    for (int fila = 1; fila <= altura; fila++) {// i es fila
      for (columna = 1; columna <= (altura - fila); columna++) {// pinta espacios
        System.out.print(" ");
      }
      for (columna = 1; columna <= incremento; columna++) { // j es columna -pinta caracteres
        System.out.print(relleno);
      }
      // aumenta el numero de caracteres por fila en 2
      incremento = incremento + 2;
      System.out.println("");
    }

  }
}
