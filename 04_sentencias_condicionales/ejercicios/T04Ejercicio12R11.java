/*
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. 
 * El programa mostrará al final la calificación obtenida. 
 * Pásale el minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal
 * andan de conocimientos en las diferentes asignaturas del curso. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T04Ejercicio12R11 {
  public static void main(String[] args) {
    System.out.println("----------------------- HOY, EXAMEN TIPO TEST -----------------------");
    System.out.println("Respuesta correcta 1 pto, respuesta incorrecta -0.33 ptos");
    System.out.println("Respuestas con caracteres invalidos o en blanco también restan puntos");
    System.out.println("Introduce tu nombre");
    Scanner s = new Scanner(System.in);
    String nombre = System.console().readLine();
    double nota = 0;
    System.out.println("Bienvenido/a " + nombre + ". Aqui estan las preguntas, suerte.");
    System.out.println("1-¿En que año se lanzó al mercado el primero ordenador con ratón incluido?");
    System.out.println("Introduzca el numero de la opcion: \n 1: 1968   2:1981    3:2000");
    int respuesta = s.nextInt();
    if (respuesta == 2) {
      nota = nota + 1;
    } else {
      nota = nota - 0.33;
    }
    System.out.println("2-¿Cual es el valor de x? (double x = Math.pow(2, 2))");
    System.out.println("Introduzca el numero de la opcion: \n 1: 4   2:'4'    3: 4.0    4: todas son válidas");
    respuesta = s.nextInt();
    if (respuesta == 3) {
      nota = nota + 1;
    } else {
      nota = nota - 0.33;
    }
    System.out.println("3-¿Que es la cardinalidad 1 a 1?");
    System.out.println(
        "Introduzca el numero de la opcion: \n 1: Una entidad de un tipo, puede estar relacionada ÚNICAMENTE con una entidad de otro tipo   \n 2: Una entidad de un tipo, puede estar relacionada con muchas entidades de otro tipo    \n 3: Ambas son correctas");
    respuesta = s.nextInt();
    if (respuesta == 1) {
      nota = nota + 1;
    } else {
      nota = nota - 0.33;
    }
    System.out.println("4-¿Para que se utiliza el metodo Math.sqrt");
    System.out.println(
        "Introduzca el numero de la opcion: \n 1: Para potencias   2:Para resolver areas en ecuaciones    3:Para raices cuadradas");
    respuesta = s.nextInt();
    if (respuesta == 3) {
      nota = nota + 1;
    } else {
      nota = nota - 0.33;
    }
    System.out.println("5-¿Que es una clave foranea?");
    System.out.println(
        "Introduzca el numero de la opcion: \n 1: Una clave principal que referencia a otra tabla  \n 2: La clave principal de la tabla en la que se encuentra \n 3: Ninguna opcion es correcta");
    respuesta = s.nextInt();
    if (respuesta == 1) {
      nota = nota + 1;
    } else {
      nota = nota - 0.33;
    }
    System.out.println("6-¿Para que se usa Git");
    System.out.println(
        "Introduzca el numero de la opcion: \n 1: Es para publicar fotos de gatitos \n 2: Es un lenguaje de programacion  \n 3: Es un sistema de control de versiones");
    respuesta = s.nextInt();
    if (respuesta == 3) {
      nota = nota + 1;
    } else {
      nota = nota - 0.33;
    }
    System.out.println("7-¿Que es JAVA?");
    System.out.println(
        "Introduzca el numero de la opcion: \n 1: Una marca de cafe de calidad   \n 2: Un programa para crear bases de datos    \n 3: Un lenguaje de programacion orientado a objetos");
    respuesta = s.nextInt();
    if (respuesta == 3) {
      nota = nota + 1;
    } else {
      nota = nota - 0.33;
    }
    System.out.println("8-¿Que es el Raid 10?");
    System.out.println(
        "Introduzca el numero de la opcion: \n 1: Un sistema de 2 discos duros \n 2: Una combinacion de Raid 0 y Raid 1    \n 3: El mejor mata insectos del mercado");
    respuesta = s.nextInt();
    if (respuesta == 2) {
      nota = nota + 1;
    } else {
      nota = nota - 0.33;
    }
    System.out.println("9-¿Cual es la función del VRM?");
    System.out.println(
        "Introduzca el numero de la opcion: \n 1: regular el voltaje   2:regular el modo video    3:alimentar el procesador");
    respuesta = s.nextInt();
    if (respuesta == 1) {
      nota = nota + 1;
    } else {
      nota = nota - 0.33;
    }
    System.out.println("10-Para que una condición con el operador || sea verdadera se tiene que cumplir que...");
    System.out.println(
        "Introduzca el numero de la opcion: \n 1: Cualquier operando sea true \n 2:Todos los operandos sean true \n 3: Al menos dos operados sean true");
    respuesta = s.nextInt();
    if (respuesta == 1) {
      nota = nota + 1;
    } else {
      nota = nota - 0.33;
    }
    s.close();
    System.out.printf("La nota de este examen es %.2f ", nota);
    if (nota >= 9) {
      System.out.println("Un SOBRESALIENTE. Enhorabuena, vas por buen camino.");
    } else if (nota >= 5) {
      System.out.println("Has aprobado pero aun puedes esforzarte un poco");
    } else if ((nota < 5) && (nota > 1)) {
      System.out.println("has suspendido");
    } else {
      System.out.println("Nota negativa, debes prestar mas atencion en clase y estudiar!");
    }
  }
}
