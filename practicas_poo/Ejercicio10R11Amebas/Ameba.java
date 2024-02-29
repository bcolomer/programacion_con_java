package Ejercicio10R11Amebas;

public class Ameba {
    private int peso;

    public Ameba() {
        this.peso = 3;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void come(int peso) {
        this.peso += peso - 1;
    }

    public void come(Ameba otrAmeba) {
        this.peso += otrAmeba.peso - 1;
        otrAmeba.setPeso(0);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Soy una ameba y peso " + this.peso + " microgramos";
    }
}
