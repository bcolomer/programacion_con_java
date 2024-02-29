package Ejercicio00GatoSimple;

/**
 * Mascota.java
 * Definición de la interfaz Mascota
 *
 * @author Luis José Sánchez
 */
public interface Mascota {
    String getCodigo();

    void hazRuido();

    void come(String comida);

    void peleaCon(Animal contrincante);
}
