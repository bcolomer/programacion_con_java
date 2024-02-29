package Ejercicio14Domino;

public class AppDomino {
    public static void main(String[] args) {

        FichaDomino f1 = new FichaDomino(6, 1);
        FichaDomino f2 = new FichaDomino(0, 4);
        FichaDomino f3 = new FichaDomino(3, 3);
        FichaDomino f4 = new FichaDomino(0, 1);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f2.voltea());
        System.out.println(f2.encaja(f4));
        System.out.println(f1.encaja(f4));
        System.out.println(f1.encaja(f3));
        System.out.println(f1.encaja(f2));

        FichaDomino[] juego = new FichaDomino[8];
        for (int i = 0; i < juego.length; i++) {
            juego[i] = new FichaDomino();
        }

        juego[0].setIzq((int) (Math.random() * 7));
        juego[0].setDer((int) (Math.random() * 7));

        for (int i = 1; i < juego.length; i++) {

            juego[i].setIzq(juego[i - 1].getDer());
            juego[i].setDer((int) (Math.random() * 7));
        }

        for (int i = 0; i < juego.length; i++) {
            System.out.print(juego[i] + " ");
        }
    }
}
