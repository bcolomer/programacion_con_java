public class EjemploDados {
    public static void main(String[] args) {
        int dado = 0;
        int suma = 0;

        System.out.print("\nTirada de tres dados: ");

        for (int i = 1; i <= 3; i++) {
            dado = randomNumber();
            System.out.print(dado + " ");
            suma = suma + dado;
        }
        System.out.println();
        System.out.println("suma: " + suma);
    }

    public static int randomNumber() {
        return (int) (Math.random() * 6 + 1);
        // return (int) (Math.random() * 60 + 50);porque esto no funciona con numeros
        // del 50 al 60?
    }
}
/*
 * otras posibles soluciones;
 * for (int i = 1; i <= 3; i++) {
 * dado = (int) (Math.random() * 7);
 * if (dado <= 0) {
 * dado = (int) (Math.random() * 7);
 * 
 * }
 * 
 * 
 * 
 * }
 * 
 * 
 * System.out.print("Tirada de tres dados: ");
 * for (int i = 1; i <= 3; i++) {
 * dado = (int) (Math.random() * 6 + 1);
 * System.out.print(dado + " ");
 * // System.out.printf("tirada %d: %d", i, dado);
 * // System.out.println();
 * // System.out.println("tirada: " + dado);
 * suma = suma + dado;
 * 
 * }
 * System.out.println();
 * System.out.println("suma: " + suma);
 */