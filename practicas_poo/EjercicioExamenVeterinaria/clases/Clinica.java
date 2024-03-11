package clases;

import clasesDiscos.Disco;

public class Clinica {
    // ATRIBUTOS STATIC DE CLASE ////
    private static final int MAX = 100;
    // ATRIBUTOS DE INSTANCIA ////
    private Clinica[] listado = new Clinica[MAX];

    // CONSTRUCTORES ////
    // GETTERS ////
    // SETTERS ////
    // METODOS ////
    public boolean esVacia() {

        return totalMascotas() < MAX ? true : false;
    }

    public boolean esLlena() {
        return totalMascotas() >= MAX ? true : false;
    }

    public int totalPerros() {
        return totalPerros();
    }

    public int totalGatos() {
        return totalGatos();
    }

    public int totalMascotas() {
        return totalMascotas();
    }

    // public Mascota buscarChipMascota(String chip) {
    // int i = 0;
    // int chip;
    // while ((i < totalMascotas()) && (!listado[i].mascota.getChip().equals(chip)))
    // {
    // i++;
    // }
    // return this.listado[i];

    // }

    public void agregar(Mascota mascota) {

    }

    public void listar() {
        for (int i = 0; i < totalMascotas(); i++) {
            System.out.println(listado[i]);
        }
    }
}
