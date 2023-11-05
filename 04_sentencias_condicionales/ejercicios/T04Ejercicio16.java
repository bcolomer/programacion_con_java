
/*
Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos
está siendo infiel. El programa irá haciendo preguntas que el usuario contestará
con verdadero o falso. Cada pregunta contestada como verdadero sumará 3
puntos. Las preguntas contestadas con falso no suman puntos. A continuación
se listan las preguntas del test.
A continuación se muestran los mensajes que deberá dar el programa según
la puntuación obtenida.
• Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente
fiel.
• Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su
vida o en su mente, aunque seguramente será algo sin importancia. No
bajes la guardia.
• Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar
viviendo un romance con otra persona. Te aconsejamos que indagues un
poco más y averigües que es lo que está pasando por su cabeza. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int counter = 0;

    System.out.println("-------------Test  de  fidelidad-------------");
    System.out.println("  Compruebe aqui si debe dudar de su pareja  ");
    System.out.println("---------------------------------------------");
    System.out.println("Responda con v para verdadero y  f para falso");
    System.out.println("-otros caracteres no seran tenidos en cuenta-");
    System.out.println("---------------------------------------------");

    System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    if (System.console().readLine().equals("v")) {
      counter = counter + 3;
    }
    System.out.println("Ha aumentado sus gastos de vestuario");
    if (System.console().readLine().equals("v")) {
      counter = counter + 3;
    }
    System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
    if (System.console().readLine().equals("v")) {
      counter = counter + 3;
    }
    System.out.println(
        "Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");

    if (System.console().readLine().equals("v")) {
      counter = counter + 3;
    }
    System.out.println("No te deja que mires la agenda de su teléfono móvil");
    if (System.console().readLine().equals("v")) {
      counter = counter + 3;
    }
    System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    if (System.console().readLine().equals("v")) {
      counter = counter + 3;
    }
    System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    if (System.console().readLine().equals("v")) {
      counter = counter + 3;
    }
    System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    if (System.console().readLine() == "v") {
      counter = counter + 3;
    }
    System.out.println("Has notado que últimamente se perfuma más");
    if (System.console().readLine().equals("v")) {
      counter = counter + 3;
    }
    System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    if (System.console().readLine().equals("v")) {
      counter = counter + 3;
    }
    s.close();

    if (counter <= 10) {
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    } else if (counter <= 22) {
      System.out.println(
          "Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    } else {
      System.out.println(
          "Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    }
  }
}
