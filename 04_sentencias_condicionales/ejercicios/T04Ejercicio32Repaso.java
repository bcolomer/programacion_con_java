/*
 * escribe un programa que solicite al usuario una nota numerica comprendido 
 * entre 0 y 100 y muestre en pantalla la calificacion siguiendo el formato
 * anglosajon a, b, c, d ,f
 * de manera que 
 * a 90-100
 * b 80-89
 * c 70-79
 * d 60-69
 * f 0 59
 * 
 * @autor Barbara Colomer
 */
public class T04Ejercicio32Repaso {
    public static void main(String[] args) {
        int nota;
        System.out.println("Introduzca su nota de 0 a 100");
        nota = Integer.parseInt(System.console().readLine());

        if ((nota >= 0) && (nota <= 100)) {
            if ((nota >= 0) && (nota <= 59)) {
                System.out.println("Su calificacion es F");
            } else if ((nota >= 60) && (nota <= 69)) {
                System.out.println("Su calificacion es D");
            } else if ((nota >= 70) && (nota <= 79)) {
                System.out.println("Su calificacion es C");
            } else if ((nota >= 80) && (nota <= 89)) {
                System.out.println("Su calificacion es B");
            } else {
                System.out.println("Su calificacion es A");
            }
        } else {
            System.out.println("No ha introducido un valor correcto");
        }
    }
}
