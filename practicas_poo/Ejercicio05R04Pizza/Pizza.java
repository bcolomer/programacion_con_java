package Ejercicio05R04Pizza;

public class Pizza {

    // ATRIBUTOS STATIC DE CLASE ////

    static int totalPedidas = 0;
    static int totalServidas = 0;

    // ATRIBUTOS DE INSTANCIA ////
    Tipo tipo;
    Tamano tamano;
    String estado;

    // CONSTRUCTORES ////
    public Pizza() {

    }

    public Pizza(Tipo tipo, Tamano tamano) {
        this.tipo = tipo;
        this.tamano = tamano;
        this.estado = "pedida";
        totalPedidas++;
    }

    // GETTERS ////
    public String getEstado() {
        return estado;
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    // SETTERS ////
    // METODOS ////
    public void sirve() {
        if (this.estado == "pedida") {
            this.estado = "servida";
            totalServidas++;

        } else {
            System.out.println("Esta pizza ya ha sido entregada");
        }
        System.out.println("Aqui tiene su pizza");
    }

    @Override
    public String toString() {

        return "Pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
    }
}
