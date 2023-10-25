/**
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada
 * asignatura
 * de un color diferente.
 * 
 * @autor Barbara Colomer
 */
public class T01Ejercicio05 {
        public static void main(String[] args) {
                System.out.printf("\033[45m%-13s %-13s %-13s %-13s %-13s", "Lunes", "Martes", "Miercoles", "Jueves",
                                "Viernes");
                System.out.println("\033[0m");
                System.out.println("---------------------------------------------------------------------");
                System.out.printf("\033[30m%-13s \033[32m%-13s \033[34m%-13s \033[33m%-13s \033[32m%-13s\n", "FOL",
                                "Programacion",
                                "Entornos", "Base Datos", "Programacion");
                System.out.printf("\033[30m%-13s \033[32m%-13s \033[34m%-13s \033[33m%-13s \033[32m%-13s\n", "FOL",
                                "Programacion",
                                "Entornos", "Base Datos", "Programacion");
                System.out.printf("\033[30m%-13s \033[33m%-13s \033[33m%-13s \033[35m%-13s \033[34m%-13s\n", "FOL",
                                "Base Datos",
                                "Base Datos", "Lenguaje M", "Entornos");
                System.out.printf("\033[31m%-13s \033[33m%-13s \033[33m%-13s \033[35m%-13s \033[31m%-13s\n", "Sist Inf",
                                "Base Datos", "Base Datos", "Lenguaje M", "Sist Inf");
                System.out.printf("\033[31m%-13s \033[35m%-13s \033[32m%-13s \033[32m%-13s \033[31m%-13s\n", "Sist Inf",
                                "Lenguaje M", "Programacion", "Programacion", "Sist Inf");
                System.out.printf("\033[31m%-13s \033[35m%-13s \033[32m%-13s \033[32m%-13s \033[31m%-13s\n", "Sist Inf",
                                "Lenguaje M", "Programacion", "Programacion", "Sist Inf");

                System.out.printf("\033[0;33m%-1s \033[0;31m%1s\n", "▒▒▒", "╲");

                System.out.printf("\033[0;33m%-15s \n", "▒▒▒🂋🂋🂋🂋🂋🂋🂋🂋🂋🂋🂋🂋🂋🂋🂋");
                System.out.printf("\033[0;33m%-3s \033[0;31m%10s \n", "▒🂋", "︱");
                System.out.printf("\033[0;33m%3s \033[0;31m%10s \n", "🂋", "︱");
                System.out.printf("\033[0;33m%3s \033[1;32m%10s \n", "🂋", "▧");
                System.out.printf("\033[0;33m%3s \033[0;31m%10s \n", "🂋", "︼");
                System.out.printf("\033[0;33m%3s \033[1;32m%6s \n", "🂋", "▧");
                System.out.printf("\033[0;33m%3s \033[1;32m \033[1;32m%6s %1s \033[34m%15s \n", "🂋", "▧", "▧",
                                "⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⛵⁓⁓⁓⁓⁓⁓⁓⁓⁓");
                System.out.printf("\033[33m%1s \033[34m%15s \n", "🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡🁡",
                                "⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⛵⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓");
                System.out.printf("\033[34m%-15s", " ⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓⁓");

        }

}
