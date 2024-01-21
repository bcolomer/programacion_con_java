/*
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T07ejercicio08 {
    public static void main(String[] args) {

        int temperaturas[];

        Scanner s = new Scanner(System.in);

        temperaturas = new int[12];
        System.out.println("Introduzca la temperatura media de cada mes del año a mostrar grafica");
        System.out.println("Pulse la tecla intro para separar los meses");
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = s.nextInt();
        }
        s.close();
        System.out.println("Esta es la grafica del año solicitado: ");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print(mes(i));
            for (int j = 0; j < temperaturas[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * funcion para devolver un mes segun un indice de array
     * 
     * @param numero
     * @return
     */
    public static String mes(int numero) {
        String mes = "";
        switch (numero) {
            case 0:
                mes = "Enero:      ";
                break;
            case 1:
                mes = "Febrero:    ";
                break;
            case 2:
                mes = "Marzo:      ";
                break;
            case 3:
                mes = "Abril:      ";
                break;
            case 4:
                mes = "Mayo:       ";
                break;
            case 5:
                mes = "Junio:      ";
                break;
            case 6:
                mes = "Julio:      ";
                break;
            case 7:
                mes = "Agosto:     ";
                break;
            case 8:
                mes = "Septiembre: ";
                break;
            case 9:
                mes = "Octubre:    ";
                break;
            case 10:
                mes = "Noviembre:  ";
                break;
            case 11:
                mes = "Diciembre:  ";
                break;
        }
        return mes;
    }
}
