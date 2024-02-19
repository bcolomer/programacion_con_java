package Ejercicio06Tiempo;

public class Tiempo {

    // ATRIBUTOS STATIC DE CLASE ////

    // ATRIBUTOS DE INSTANCIA ////
    int hora;
    int minuto;
    int segundo;

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
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void setHoras(int hora) {
        this.minuto = hora * 60;
    }

    // METODOS ////
    public void mostrarHora() {
        System.out.println(this.hora);
    }

    public Tiempo sumar(Tiempo otroTiempo) {
        Tiempo resultado = new Tiempo();
        resultado.segundo = this.segundo + otroTiempo.segundo;
        if (resultado.segundo >= 60) {
            resultado.segundo -= 60;
            resultado.minuto += 1;
        }
        resultado.minuto = resultado.minuto + this.minuto + otroTiempo.minuto;
        if (resultado.minuto >= 60) {
            resultado.minuto -= 60;
            resultado.hora += 1;
        }
        resultado.hora = resultado.hora + this.hora + otroTiempo.hora;

        return resultado;
    }

    public Tiempo restar(Tiempo otroTiempo) {
        Tiempo resultado = new Tiempo();
        int hora1;
        int hora2;
        hora1 = this.hora * 3600 + this.minuto * 60 + this.segundo;
        hora2 = otroTiempo.hora * 3600 + otroTiempo.minuto * 60 + otroTiempo.segundo;
        resultado.segundo = hora1 - hora2;
        if (resultado.segundo >= 60) {
            resultado.minuto = resultado.segundo / 60;
            resultado.segundo = resultado.segundo % 60;
        }
        if (resultado.minuto >= 60) {
            resultado.hora = resultado.minuto / 60;
            resultado.minuto = resultado.minuto % 60;

        }
        return resultado;
    }

    @Override
    public String toString() {

        return this.hora + "h " + this.minuto + "m " + this.segundo + "s.";
    }

}
