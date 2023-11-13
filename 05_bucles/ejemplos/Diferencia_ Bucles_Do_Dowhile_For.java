public class BuclesDoDowhileFor {
  public static void main(String[] args) {
    System.out.println("10 primeros numeros");
    int contador = 1;
    System.out.println("while");
    while (contador <= 10) {
      System.out.print(contador);
      contador++;
    }
    System.out.println("");
    System.out.println("do while");// este no funciona
    contador = 1;// le vuelvo a dar valor 1 a contador porque cambio su valor en el bucle
                 // anterior
    do {

      System.out.print(contador);
      contador++;
    } while (contador <= 10);

    // for (int i = 0; i < args.length; i++) {}

    System.out.println("");
    System.out.println("for");

    for (contador = 1; contador <= 10/* condicion de fin de bucle */; contador++) {
      System.out.print(contador);
    }
  }

}
