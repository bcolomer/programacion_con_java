public class EjercicioCartasEspañolas {

    public static void main(String[] args) {
        String cartaElegida = "";
        String simboloElegido = "";

        cartaElegida = carta((int) (Math.random() * 12 + 1));
        simboloElegido = simbolo(((int) (Math.random() * 4 + 1)));
        System.out.println(cartaElegida + simboloElegido);

    }

    public static String carta(int numero) {
        String carta = "";
        switch (numero) {
            case 1:
                System.out.print("as");
                break;
            case 2:
                System.out.print("2");
                break;
            case 3:
                System.out.print("3");
                break;
            case 4:
                System.out.print("4");
                break;
            case 5:
                System.out.print("5");
                break;
            case 6:
                System.out.print("6");
                break;
            case 7:
                System.out.print("7");
                break;
            case 8:
                System.out.print("8");
                break;
            case 9:
                System.out.print("9");
                break;
            case 10:
                System.out.print("sota");
                break;
            case 11:
                System.out.print("caballo");
                break;
            case 12:
                System.out.print("rey");
                break;
        }
        return carta;
    }

    public static String simbolo(int numero) {
        String simbolo = "";
        switch (numero) {
            case 1:
                System.out.print(" de bastos");
                break;
            case 2:
                System.out.print(" de oros");
                break;
            case 3:
                System.out.print(" de espadas");
                break;
            case 4:
                System.out.print(" de copas");
                break;
        }

        return simbolo;
    }
}