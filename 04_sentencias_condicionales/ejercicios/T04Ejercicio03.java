/*
 *Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
 *nombre del día de la semana. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T04Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Escriba un numero del 1 al 7 para saber a que dia de la semana corresponde");
    int dia = s.nextInt();
    s.close();

    switch (dia) {
      case 1:
        System.out.println("Corresponde a lunes");
        break;
      case 2:
        System.out.println("Corresponde a martes");
        break;
      case 3:
        System.out.println("Corresponde a miercoles");
        break;
      case 4:
        System.out.println("Corresponde a jueves");
        break;
      case 5:
        System.out.println("Corresponde a viernes");
        break;
      case 6:
        System.out.println("Corresponde a sabado");
        break;
      case 7:
        System.out.println("Corresponde a domingo");
        break;

      default:
        System.out.println("El numero introducido no corresponde a ningun dia");
        break;
    }
  }

}
