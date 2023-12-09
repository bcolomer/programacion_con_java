
/*
 * Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio26R23 {
  public static void main(String[] args) {

    int numero = 0;
    int numeroReducido = 0;
    int modulo = 0;
    int invertido = 0;
    int digito = 0;
    int contador = 1;
    int contadordigito = 0;
    int respuesta = 0;
    Scanner s = new Scanner(System.in);

    System.out.println("introduzca un numero");
    numero = s.nextInt();
    System.out.println("intrudzca un digito y se le indicara en que posicion se encuentra");
    digito = s.nextInt();
    s.close();
    numeroReducido = numero;
    // le doy la vuelta al numero
    do {
      contador++;
      modulo = numeroReducido % 10;
      numeroReducido = numeroReducido / 10;
      invertido = (invertido * 10) + modulo;
    } while (numeroReducido > 0);

    // le vuevo a dar la vuelta y controlo si aparece el digito y en que posiciones:
    System.out.printf("El digito %d, respecto al numero %d, esta ubicado en la/s siguientes posiciones: ", digito,
        numero);
    for (int i = 1; i < contador; i++) {
      modulo = invertido % 10;
      invertido = invertido / 10;

      if (modulo == digito) {
        System.out.print(i + " ");
      }

    }
  }
}
// if (contadordigito == 0) {
// System.out.println("el digito que ha introducido no se encuentra en el numero
// ");

// }
// respuesta = contador - contadordigito + 1;
// System.out.println(invertido);
// System.out.println(contador);
// System.out.println(contadordigito);
// System.out.println("el digito esta en la posicion:" + respuesta);

/*
 * String numero;
 * 
 * char digito;
 * int posicion;
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.print("Introduce un número entero: ");
 * numero = sc.nextLine();
 * 
 * System.out.print("Introduce un dígito: ");
 * digito = sc.nextLine().charAt(0);
 * 
 * System.out.
 * printf("Contando de derecha a izquierda, el %s aparece dentro de %c en las siguientes posiciones: "
 * ,
 * numero, digito);
 * 
 * for (posicion = 0; posicion < numero.length(); posicion++) {
 * 
 * if (numero.charAt(posicion) == digito) {
 * System.out.printf("%d ", posicion + 1);
 * }
 * }
 */
/*
 * int resto ;
 * System.out.
 * printf("Contando de derecha a izquierda, el %d aparece dentro de %d en las siguientes posiciones: "
 * , numero, digito);
 * 
 * numero = Varias.invertir(numero) ;
 * 
 * while(numero>0) {
 * 
 * resto = (int) numero%10 ;
 * if (resto==digito) { System.out.printf("%d ", posicion); }
 * 
 * numero = numero/10 ;
 * posicion++ ;
 * }
 */
