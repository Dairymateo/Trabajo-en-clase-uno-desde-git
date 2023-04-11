import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Empleado e1 =new Empleado();
        Scanner sc= new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre=sc.next();
        System.out.println("Ingrese su cedula: ");
        String cedula=sc.next();
        System.out.println("Ingrese las horas trabajadas: ");
        int horasTrabajadas=sc.nextInt();
        System.out.println("Ingrese el valor por hora de trabajo: ");
        double valorHora=sc.nextDouble();
        System.out.println("Ingrese el porcentaje de la retencion en decimales: ");
        double retencionFuente= sc.nextDouble();
        e1.setNombre(nombre);
        e1.setCedula(cedula);
        e1.setHorasTrabajadas(horasTrabajadas);
        e1.setvalorHora(valorHora);
        e1.setRetencionFuente(retencionFuente);
        System.out.println("El empleado: "+e1.getNombre());
        System.out.println("Con No Cedula:"+e1.getCedula());
        System.out.println("El salario bruto es: "+e1.calcularSalarioBruto());
        System.out.println("La retencion es: "+e1.calcularMontoRetencion());
        System.out.println("El salario neto es: "+e1.calcularSalarioNeto());

        System.out.println("Ingrese las horas extras");
        int horasExtras= sc.nextInt();
        System.out.println("Las horas totales son: "+e1.calcularHorasTrabajadas(horasExtras));
        System.out.println("El nuevo salario neto es: "+e1.calcularSalarioNeto());




     }
 }
