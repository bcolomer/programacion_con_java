/*
 * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce 
 * su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción 
 * incorrecta, el programa deberá mostrar un mensaje de error. 
 * 
 * @autor Barbara Colomer
 */
public class T04Ejercicio28R26 {
  public static void main(String[] args) {
    String usuarioA = "";
    String usuarioB = "";
    System.out.println("Jugamos al piedra, papel o tijera:");
    System.out.print("turno del jugador 1: Introduzca   \n piedra \n papel\n tijera\n jugador 1-->");
    usuarioA = System.console().readLine();
    System.out.print("turno del jugador 2: Introduzca :  \n piedra \n papel\n tijera\n jugador 2-->");
    usuarioB = System.console().readLine();
    if (((usuarioA.equals("piedra")) || (usuarioA.equals("papel")) || (usuarioA.equals("tijera"))) &&
        ((usuarioB.equals("piedra")) || (usuarioB.equals("papel")) || (usuarioB.equals("tijera")))) {
      if (usuarioA.equals(usuarioB)) {
        System.out.println("Ha habido empate");
      } else if (usuarioA.equals("piedra")) {
        if (usuarioB.equals("papel")) {
          System.out.println("El ganador es: jugador 2 ");
        } else {
          System.out.println("El ganador es: jugador 1");
        }
      } else if (usuarioA.equals("papel")) {
        if (usuarioB.equals("tijera")) {
          System.out.println("El ganador es: jugador 2 ");
        } else {
          System.out.println("El ganador es: jugador 1");
        }

      } else if (usuarioA.equals("tijera")) {
        if (usuarioB.equals("piedra")) {
          System.out.println("El ganador es: jugador 2 ");
        } else {
          System.out.println("El ganador es: jugador 1");
        }

      }
      /*
       * else if ((usuarioA.equals("piedra")) && (usuarioB.equals("papel"))) {
       * System.out.println("Gana el jugador 2");
       * } else if ((usuarioA.equals("piedra")) && (usuarioB.equals("tijera"))) {
       * System.out.println("Gana el jugador 1");
       * 
       * } else {
       * 
       * }
       * 
       * switch
       * case "piedra":
       * if (jugador2.equals"piedra )empate
       * else if jugador 2 papel gana jugador tal
       * else gana jugador tal
       * 
       */

    } else {
      System.out.println("Algun jugador ha marcado una opcion incorrecta");
    }
  }

}