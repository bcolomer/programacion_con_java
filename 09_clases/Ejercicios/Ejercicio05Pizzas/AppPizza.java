/*
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
información sobre el número total de pizzas que se han pedido y que se
han servido. Siempre que se crea una pizza nueva, su estado es “pedida”. 
 * 
 * @autor Barbara Colomer
 */
package Ejercicio05Pizzas;

public class AppPizza {
    public static void main(String[] args) {

        Pizza orden1 = new Pizza(SizePizza.MEDIANA, TipoPizza.MARGARITA);
        Pizza orden2 = new Pizza(SizePizza.FAMILIAR, TipoPizza.FUNGHI);
        orden2.sirve();
        Pizza orden3 = new Pizza(SizePizza.MEDIANA, TipoPizza.CUATRO_QUESOS);
        System.out.println(orden1);
        System.out.println(orden2);
        System.out.println(orden3);
        orden2.sirve();
        System.out.println("Pedidas: " + Pizza.getCantPedidas());
        System.out.println("Serivdas: " + Pizza.getCantServidas());
    }
}
