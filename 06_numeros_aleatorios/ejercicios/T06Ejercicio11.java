/*
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc. 
 * 
 * @autor Barbara Colomer
 */
public class T06Ejercicio11 {
    public static void main(String[] args) {

        int nota = 0;
        int contadorSuspenso = 0;
        int contadorSuficiente = 0;
        int contadorBien = 0;
        int contadorNotable = 0;
        int contadorSobresaliente = 0;

        for (int i = 0; i < 20; i++) {
            nota = (int) ((Math.random() * 5 + 1));
            if (nota == 1) {
                contadorSuspenso++;
            } else if (nota == 2) {
                contadorSuficiente++;
            } else if (nota == 3) {
                contadorBien++;
            } else if (nota == 4) {
                contadorNotable++;
            } else {
                contadorSobresaliente++;
            }
            System.out.print(nota(nota) + " ");
        }
        System.out.println("\nsuspensos: " + contadorSuspenso);
        System.out.println("suficientes: " + contadorSuficiente);
        System.out.println("bien: " + contadorBien);
        System.out.println("notables: " + contadorNotable);
        System.out.println("sobresalientes: " + contadorSobresaliente);
        // System.out.println("total " + (contadorBien + contadorNotable +
        // contadorSobresaliente + contadorSuficiente + contadorSuspenso));
    }

    private static String nota(int numero) {
        String nota = "";
        switch (numero) {
            case 1:
                nota = "suspenso ";
                break;
            case 2:
                nota = "suficiente ";
                break;
            case 3:
                nota = "bien ";
                break;
            case 4:
                nota = "notable ";
                break;
            case 5:
                nota = "sobresaliente ";
                break;
        }
        return nota;
    }

}
