package Ejercicio06R07Tiempo;

public class Tiempo {
    // ATRIBUTOS STATIC DE CLASE ////
    // ATRIBUTOS DE INSTANCIA ////
    private int hora;
    private int minuto;
    private int segundo;

    // CONSTRUCTORES ////
    public Tiempo() {

    }

    public Tiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // GETTERS ////
    // SETTERS ////
    // METODOS ////

    public Tiempo suma(Tiempo otroTiempo) {
        int thisSeg;
        int otroSeg;
        int totalSegundos;
        Tiempo tiempoResultado = new Tiempo();

        thisSeg = this.hora * 3600;
        thisSeg += this.minuto * 60;
        thisSeg += this.segundo;

        otroSeg = otroTiempo.hora * 3600;
        otroSeg += otroTiempo.minuto * 60;
        otroSeg += otroTiempo.segundo;

        totalSegundos = thisSeg + otroSeg;

        tiempoResultado.hora = totalSegundos / 3600;
        tiempoResultado.minuto = (totalSegundos % 3600) / 60;
        tiempoResultado.segundo = totalSegundos % 60;

        return tiempoResultado;
    }

    public Tiempo resta(Tiempo otroTiempo) {
        int thisSeg;
        int otroSeg;
        int totalSegundos;
        Tiempo tiempoResultado = new Tiempo();

        thisSeg = this.hora * 3600;
        thisSeg += this.minuto * 60;
        thisSeg += this.segundo;

        otroSeg = otroTiempo.hora * 60;
        otroSeg += otroTiempo.minuto * 60;
        otroSeg += otroTiempo.segundo;

        totalSegundos = thisSeg - otroSeg;

        tiempoResultado.hora = totalSegundos / 3600;
        tiempoResultado.minuto = (totalSegundos % 3600) / 60;
        tiempoResultado.segundo = totalSegundos % 60;

        return tiempoResultado;
    }

    @Override
    public String toString() {

        return this.hora + "h " + this.minuto + "m " + this.segundo + "s ";
    }

}
