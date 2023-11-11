
/*
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado según las siguientes condiciones:
 * Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto), 
 * los días que ha estado de viaje visitando clientes durante el mes y su estado civil
 * (1 - Soltero, 2 - Casado).  El sueldo base según el cargo es de 950, 1200 y 1600 euros según si se trata
 * de un prog. junior, un prog. senior o un jefe de proyecto respectivamente. 
 * Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas.
 * Al sueldo neto hay que restarle el IRPF, que será de un 25% en caso de estar soltero y 
 * un 20% en caso de estar casado. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio24R22 {
  public static void main(String[] args) {
    int cargo;
    int dias;
    int estCivil;
    double progjunior = 950;
    double progSenior = 1200;
    double jefe = 1600;
    double dietas = 30;
    double soltero = 20;
    double casado = 25;
    double sueldoBase = 0;
    double irpf = 0;
    double sueldoNeto = 0;
    double dietaMensual = 0;
    double sueldoBruto = 0;

    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca su cargo: \n1-Programador Junior\n2-Programador Senior\n3-Jefe de proyecto\n");
    cargo = s.nextInt();
    System.out.print("\nIntroduzca cuantos dias ha estado de viaje visitando clientes:");
    dias = s.nextInt();
    System.out.print("\nIntroduzca su estado civil:\n1-Soltero\n2-Casado\n");
    estCivil = s.nextInt();
    s.close();

    switch (cargo) {
      case 1:
        sueldoBase = progjunior;
        break;
      case 2:
        sueldoBase = progSenior;
        break;
      case 3:
        sueldoBase = jefe;
        break;
      default:
        System.out.println("El valor indicado no se corresponde con ningun puesto actual.");
        break;
    }
    switch (estCivil) {
      case 1:
        irpf = soltero;
        break;
      case 2:
        irpf = casado;
        break;
      default:
        System.out.println("El codigo indicado no se corresponde con ningun valor correcto");
        break;
    }
    if ((dias < 0) || (dias > 31)) {
      System.out.println("El numero de días indicado no se corresponde con la cantidad de dias que tiene el mes");

    } else {
      dietaMensual = dias * dietas;
      sueldoBruto = sueldoBase + dietaMensual;
      sueldoNeto = sueldoBruto + (sueldoBruto * irpf / 100);
      System.out.println("---------------------------------");
      System.out.printf("|%-20s %10.2f|\n", "Sueldo base", sueldoBase);
      System.out.printf("|%-20s %10.2f|\n", ("Dietas (" + dias + " viajes)"), dietaMensual);
      System.out.println("---------------------------------");
      System.out.printf("|%-20s %10.2f|\n", "Sueldo bruto", sueldoBruto);
      System.out.printf("|%-20s %10.2f|\n", ("Retencion IRPF " + irpf + "%"), (sueldoBruto * irpf / 100));
      System.out.println("---------------------------------");
      System.out.printf("|%-20s %10.2f|\n", "Sueldo neto", sueldoNeto);
      System.out.println("---------------------------------");
    }
  }
}