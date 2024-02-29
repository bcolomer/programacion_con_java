package Ejercicio18Ordenadores;

public class Incidencia {

    // ATRIBUTOS STATIC DE CLASE ////

    static int pendientes = 0;
    static int ultimoCodigo = 0;

    // ATRIBUTOS DE INSTANCIA ////
    private int puesto;
    private int codigo = 0;
    private String estado;
    private String problema;
    private String solucion;

    // CONSTRUCTORES ////
    public Incidencia() {

    }

    public Incidencia(int puesto, String problema) {
        this.puesto = puesto;
        this.problema = problema;
        pendientes++;
        this.codigo = ++ultimoCodigo;
        this.estado = "Pendiente";
    }
    // GETTERS ////

    public static int getPendientes() {
        return pendientes;
    }

    // SETTERS ////
    // METODOS ////
    public void resuelve(String solucion) {
        this.estado = "Resuelta";
        this.solucion = solucion;
        pendientes--;
    }

    @Override
    public String toString() {

        return "Incidencia " + this.codigo + " - Puesto: " + this.puesto + " - " + this.problema
                + " - " + this.estado + (estado.equals("Resuelta") ? " - " + this.solucion : "");

    }
}
