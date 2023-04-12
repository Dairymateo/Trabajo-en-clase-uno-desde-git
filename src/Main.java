import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Empleado e1=new Empleado();
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre=sc.nextLine();
        System.out.println("-----------------------------");
        System.out.println("Ingrese su cedula: ");
        String cedula=sc.next();
        System.out.println("-----------------------------");
        System.out.println("Ingrese las horas trabajadas: ");
        int horasTrabajadas= Integer.parseInt(sc.next());
        System.out.println("-----------------------------");
        System.out.println("Ingrese el valor por hora de trabajo: ");
        double valorHora= Double.parseDouble(sc.next());
        System.out.println("-----------------------------");
        System.out.println("Ingrese el porcentaje de la retencion en decimales: ");
        double retencionFuente=Double.parseDouble(sc.next());
        System.out.println("-----------------------------");
        e1.setNombre(nombre);
        e1.setCedula(cedula);
        e1.sethorasTrabajadas(horasTrabajadas);
        e1.setvalorHora(valorHora);
        e1.setRetencionFuente(retencionFuente);
        System.out.println("El empleado: "+e1.getNombre());
        System.out.println("Con No Cedula:"+e1.getCedula());
        System.out.println("El salario bruto es: "+e1.calcularSalarioBruto());
        System.out.println("La retencion es: "+e1.calcularMontoRetencion());
        System.out.println("El salario neto es: "+e1.calcularSalarioNeto());

        System.out.println("Ingrese las horas extras");
        int horasExtras= Integer.parseInt(sc.next());
        System.out.println("-----------------------------");
        e1.adicionarHorasExtras(horasExtras);
        System.out.println("Las horas totales son: " +e1.gethorasTrabajadas());
        System.out.println("El nuevo salario neto es: "+e1.calcularSalarioNeto());

        }
    }

