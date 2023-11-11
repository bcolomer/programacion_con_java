
/*
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio10R09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Escriba el numero de su mes de nacimiento ");
    int mes = s.nextInt();
    System.out.println("Introduzca el dia de su nacimiento");
    int dia = s.nextInt();
    s.close();

    switch (mes) {

      case 1:
        if (dia <= 19) {
          System.out.println("Su signo del zodiaco es Capricornio.");
        } else if ((dia >= 20) && (dia <= 31)) {
          System.out.println("Su signo del zodiaco es Acuario.");
        } else {
          System.out.println("Debe introducir datos validos");
        }
        break;
      case 2:
        if (dia <= 18) {
          System.out.println("Su signo del zodiaco es Acuario.");
        } else if ((dia >= 19) && (dia <= 29)) {
          System.out.println("Su signo del zodiaco es Piscis.");
        } else {
          System.out.println("Debe introducir datos validos");
        }
        break;
      case 3:
        if (dia <= 20) {
          System.out.println("Su signo del zodiaco es Piscis.");
        } else if ((dia >= 21) && (dia <= 31)) {
          System.out.println("Su signo del zodiaco es Aries.");
        } else {
          System.out.println("Debe introducir datos validos");
        }
        break;
      case 4:
        if (dia <= 19) {
          System.out.println("Su signo del zodiaco es Aries.");
        } else if ((dia >= 20) && (dia <= 30)) {
          System.out.println("Su signo del zodiaco es Tauro.");
        } else {
          System.out.println("Debe introducir datos validos");
        }
        break;
      case 5:
        if (dia <= 21) {
          System.out.println("Su signo del zodiaco es Tauro.");
        } else if ((dia >= 22) && (dia <= 31)) {
          System.out.println("Su signo del zodiaco es Geminis.");
        } else {
          System.out.println("Debe introducir datos validos");
        }
        break;
      case 6:
        if (dia <= 20) {
          System.out.println("Su signo del zodiaco es Geminis.");
        } else if ((dia >= 21) && (dia <= 30)) {
          System.out.println("Su signo del zodiaco es Cancer.");
        } else {
          System.out.println("Debe introducir datos validos");
        }
        break;
      case 7:
        if (dia <= 22) {
          System.out.println("Su signo del zodiaco es Cancer.");
        } else if ((dia >= 23) && (dia <= 31)) {
          System.out.println("Su signo del zodiaco es Leo.");
        } else {
          System.out.println("Debe introducir datos validos");
        }
        break;
      case 8:
        if (dia <= 22) {
          System.out.println("Su signo del zodiaco es Leo.");
        } else if ((dia >= 23) && (dia <= 31)) {
          System.out.println("Su signo del zodiaco es Virgo.");
        } else {
          System.out.println("Debe introducir datos validos");
        }
        break;
      case 9:
        if (dia <= 22) {
          System.out.println("Su signo del zodiaco es Virgo.");
        } else if ((dia >= 23) && (dia <= 30)) {
          System.out.println("Su signo del zodiaco es Libra.");
        } else {
          System.out.println("Debe introducir datos validos");
        }
        break;
      case 10:
        if (dia <= 22) {
          System.out.println("Su signo del zodiaco es Libra.");
        } else if ((dia >= 23) && (dia <= 31)) {
          System.out.println("Su signo del zodiaco es Escorpio.");
        } else {
          System.out.println("Debe introducir datos validos");
        }
        break;
      case 11:
        if (dia <= 21) {
          System.out.println("Su signo del zodiaco es Escorpio.");
        } else if ((dia >= 22) && (dia <= 30)) {
          System.out.println("Su signo del zodiaco es Sagitario.");
        } else {
          System.out.println("Debe introducir datos validos");
        }
        break;
      case 12:
        if (dia <= 21) {
          System.out.println("Su signo del zodiaco es Sagitario.");
        } else if ((dia >= 22) && (dia <= 31)) {
          System.out.println("Su signo del zodiaco es Capricornio.");
        } else {
          System.out.println("Debe introducir datos validos");
        }
        break;

      default:
        System.out.println("Debe introducir datos validos");
        break;
    }
  }
}
