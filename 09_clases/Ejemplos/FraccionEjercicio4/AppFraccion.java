package FraccionEjercicio4;

public class AppFraccion {
    public static void main(String[] args) {

        Fraccion fraccion1 = new Fraccion();

        System.out.println("ingresa el numerador");
        fraccion1.setNumerador(Integer.parseInt(System.console().readLine()));
        System.out.println("Ingresa el denominador");
        fraccion1.setDenominador(Integer.parseInt(System.console().readLine()));

        System.out.println("QUe quieres hacer:");
        System.out.println("1-Invierte");
        System.out.println("2-Simplifica");
        System.out.println("3-Multiplica");
        System.out.println("4-Divide");
        int opcion = Integer.parseInt(System.console().readLine());
        if (opcion == 1) {
            fraccion1.invierte();
            System.out.println("El numerador actuales es : " + fraccion1.getNumerador());
            System.out.println("El denominador actuales es : " + fraccion1.getDenominador());

        } else if (opcion == 2) {
            fraccion1.simplifica();
            System.out.println("El numerador actuales es : " + fraccion1.getNumerador());
            System.out.println("El denominador actuales es : " + fraccion1.getDenominador());
        } else if (opcion == 3) {
            System.out.println("Ingrese el multiplicando");
            int multiplicando = Integer.parseInt(System.console().readLine());
            fraccion1.multiplica(multiplicando);
            System.out.println("El numerador actuales es : " + fraccion1.getNumerador());
            System.out.println("El denominador actuales es : " + fraccion1.getDenominador());

        } else if (opcion == 4) {
            System.out.println("Ingrese el divisor");
            int divisor = Integer.parseInt(System.console().readLine());
            fraccion1.divide(divisor);
            System.out.println("El numerador actuales es : " + fraccion1.getNumerador());
            System.out.println("El denominador actuales es : " + fraccion1.getDenominador());
        }
    }
}