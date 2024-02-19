/*
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20, 30)
donde los parámetros que se le pasan al constructor son las horas, los minutos
y los segundos respectivamente. Crea el método toString para ver los intervalos
de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y 35m 20s el
resultado debería ser 1h 6m 0s. Realiza un programa de prueba para comprobar
que la clase funciona bien. 
 * 
 * @autor Barbara Colomer
 */

package Ejercicio06Tiempo;

public class AppTiempo {
    public static void main(String[] args) {
        Tiempo hora1 = new Tiempo(2, 26, 10);
        Tiempo hora2 = new Tiempo(0, 59, 01);
        Tiempo resultadoSuma = new Tiempo();
        Tiempo resultadoResta = new Tiempo();

        resultadoSuma = hora1.sumar(hora2);
        System.out.println(resultadoSuma);
        resultadoResta = resultadoSuma.restar(hora2);
        System.out.println(resultadoResta);
    }

}
