import java.util.Scanner;

public class LeeDatosScanner01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "Windows-1252");
    // lo de windows es para que reconozca caracteres especiales, y luego colocar
    // por
    // terminal chcp 1252, pero a mi no me funciona
    // aunque si funciona si coloco chcp.com 1252
    // because git bash can't extend chcp to a full executable on its own, so you
    // need to type the full command.
    // Creamos un objeto de la clase scanner llamado sc, puede tener otro nombre

    System.out.println("Introduce tu nombre: ");
    // Guardamos en la variable nombre lo que introducimos por teclado
    String nombre = sc.nextLine();

    System.out.println("Introduce tu edad: ");
    // Guardamos en la variable edad lo que introducimos por teclado
    int edad = sc.nextInt();

    System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años");
    sc.close();
  }

}
