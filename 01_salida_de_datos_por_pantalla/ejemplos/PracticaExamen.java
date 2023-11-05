
public class PracticaExamen {
  // public static void main(String[] args) {
  /*
   * System.out.println("      \033[44mTICKET\033[0m      ");
   * System.out.println("------------------");
   * System.out.printf("%-10s %-3s\n", "pan", 1);
   * System.out.printf("%-10s %-3s", "galletas", 0.5);
   * System.out.printf("\033[4;31m HOLA ");
   * System.out.println();
   */

  public static void main(String[] args) {
    System.out.printf("\033[45m%-13s %-13s %-13s %-13s %-13s", "Lunes", "Martes", "Miercoles", "Jueves",
        "Viernes");
    System.out.println("\033[0m");
    System.out.println("---------------------------------------------------------------------");
    System.out.printf("\033[32m%-13s \033[32m%-13s \033[31m%-13s \033[33m%-13s \033[31m%-13s\n", "Programacion",
        "Programacion", "Sist Inf", "Base Datos", "Sist Inf");
    System.out.printf("\033[32m%-13s \033[32m%-13s \033[31m%-13s \033[33m%-13s \033[31m%-13s\n", "Programacion",
        "Programacion", "Sist Inf", "Base Datos", "Sist Inf");
    System.out.printf("\033[35m%-13s \033[35m%-13s \033[31m%-13s \033[34m%-13s \033[31m%-13s\n", "Lenguaje M",
        "Lenguaje M", "Sist Inf", "Entornos", "Sist Inf");
    System.out.printf("\033[0m%-50s \n", "--------------------------------RECREO-------------------------------");
    System.out.printf("\033[35m%-13s \033[35m%-13s \033[32m%-13s \033[34m%-13s \033[30m%-13s\n", "Lenguaje M",
        "Lenguaje M", "Programacion", "Entornos", "FOL");
    System.out.printf("\033[33m%-13s \033[33m%-13s \033[32m%-13s \033[32m%-13s \033[30m%-13s\n", "Base Datos",
        "Base Datos", "Programacion", "Programacion", "FOL");
    System.out.printf("\033[33m%-13s \033[33m%-13s \033[34m%-13s \033[32m%-13s \033[30m%-13s\n", "Base Datos",
        "Base Datos", "Entornos", "Programacion", "FOL");
  }

}
