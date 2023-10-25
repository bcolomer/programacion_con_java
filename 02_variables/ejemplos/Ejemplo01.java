/**
 * Explica tu codigo aqui
 * 
 * @autor Barbara Colomer
 */
public class Ejemplo01 {
  public static void main(String[] args) {
    // tipo byte numero entero de -127 a 127
    byte miNumByte = 100;
    System.out.println(miNumByte);

    // Tipo Short
    short miNumShort = 5000;
    System.out.println(miNumShort);

    // Tipo long se le agrega L mayuscula al final
    long miNumLong = 150000000L;
    System.out.println(miNumLong);

    // tipo float se le agrega f minuscula al final
    float miNumFloat = 5.75f;
    System.out.println(miNumFloat);

    // tipo boolean
    boolean esJavaDivertido = true;
    boolean esElProfeDivertido = false;
    System.out.println(esJavaDivertido);
    System.out.println(esElProfeDivertido);

    int numero = 5;
    System.out.println("el valor de una variables es " + numero);
    double x;
    double y;
    x = 7;
    y = 25.75;
    System.out.println("x vale " + x);
    System.out.println("y vale " + y);

    char letra1 = 99;
    char letra2 = 97;
    char letra3 = 'd';
    System.out.println(letra1); // imprime la letra asociada a ese caracter ASCII
    System.out.println("" + letra1 + letra2);
    System.out.println(letra1 + letra2);
    System.out.println(letra3);

    int num1 = 9;
    int num2 = 2;
    System.out.println("El resto de dividir " + num1 + " entre " + num2 + " es igual a " + num1 % num2);

  }
}
