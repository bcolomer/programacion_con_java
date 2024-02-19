package Ejercicio05Pizzas;

public class Pizza {
    // CONTADOR ESTATICO//
    private static int cantPedidas = 0;
    private static int cantServidas = 0;

    // ATRIBUTOS ///
    SizePizza sizePizza;
    TipoPizza tipoPizza;
    EstadoPizza estadoPizza;

    // CONSTRUCTOR ///
    public Pizza() {

    }

    public Pizza(SizePizza sizePizza, TipoPizza tipoPizza) {
        this.sizePizza = sizePizza;
        this.tipoPizza = tipoPizza;
        this.estadoPizza = estadoPizza.PEDIDA;
        Pizza.cantPedidas++;
    }

    public Pizza(SizePizza sizePizza) {
        this.sizePizza = sizePizza;

    }

    // GETTERS ///
    public SizePizza getSizePizza() {
        return sizePizza;
    }

    public TipoPizza getTipoPizza() {
        return tipoPizza;
    }

    public EstadoPizza getEstadoPizza() {
        return estadoPizza;
    }

    public static int getCantPedidas() {
        return cantPedidas;
    }

    public static int getCantServidas() {
        return cantServidas;
    }
    // SETTERS ///

    // METODOS ///

    public void sirve() {
        if (this.estadoPizza.equals(EstadoPizza.PEDIDA)) {
            this.estadoPizza = EstadoPizza.SERVIDA;
            cantServidas++;

        } else {
            System.out.println("esa pizza ya se ha servido");
        }

    }

    @Override
    public String toString() {
        return "El pedido contiene: " + this.tipoPizza + " tamaño:" + this.sizePizza;
    }
}
