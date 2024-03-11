public class T05Ejercicio70Repaso {
    public static void main(String[] args) {
        int altura;
        int alturaRombo;

        System.out.println("Introduzca la altura");
        altura = Integer.parseInt(System.console().readLine());
        // imprime la piramide
        for (int i = 0; i < altura; i++) {
            // imprime los espacios de la izquierda
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            // imprime las estrellas o espacios segun j sea impar o par
            for (int j = 0; j < i * 2 + 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // salto de linea
            System.out.println();
        }
        System.out.println();
        System.out.println();

        alturaRombo = altura / 2;

        // imprime la primea mitad del rombo
        for (int i = 0; i <= alturaRombo; i++) {
            // imprime los espacios de la izquierda
            for (int j = 0; j < alturaRombo - i; j++) {
                System.out.print(" ");
            }
            // imprime las estrellas o espacios segun j sea impar o par
            for (int j = 0; j < i * 2 + 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // salto de linea
            System.out.println();

        }

        for (int i = alturaRombo - 1; i >= 0; i--) {
            // imprime los espacios de la izquierda
            for (int j = 0; j < alturaRombo - i; j++) {
                System.out.print(" ");
            } // imprime las estrellas o espacios segun j sea impar o par
            for (int j = 0; j < i * 2 + 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // salto de linea

        System.out.println();
        System.out.println();
        // imprime piramide de numeros
        for (int i = 0; i < altura; i++) {
            // imprime los espacios de la izquierda
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            // imprime la primera mitad de los numeros
            for (int j = 1; j < i + 2; j++) {

                System.out.print(j);

            }
            // imprime la segunda mitad de los numeros
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        // salto de linea
        System.out.println();
    }
}
