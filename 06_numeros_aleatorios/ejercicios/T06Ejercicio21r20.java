/*
 * Realiza un programa que genere una secuencia de cinco monedas de curso
legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
posiciones posibles son cara y cruz. 
 * 
 * @autor Barbara Colomer
 */
public class T06Ejercicio21r20 {
    public static void main(String[] args) {

        System.out.printf("2 céntimos - %s\n", caraCruz());
        System.out.printf("20 céntimos - %s\n", caraCruz());
        System.out.printf("50 céntimos - %s\n", caraCruz());
        System.out.printf("1 euro - %s\n", caraCruz());
        System.out.printf("2 euros - %s\n", caraCruz());
    }

    /**
     * funcion para obtener resultado cara/cruz
     * 
     * @return
     */
    public static String caraCruz() {
        String moneda = "";
        int suerte = (int) (Math.random() * 2 + 1);
        if (suerte == 1) {
            moneda = "cara";
        } else {
            moneda = "cruz";
        }
        return moneda;
    }
}
