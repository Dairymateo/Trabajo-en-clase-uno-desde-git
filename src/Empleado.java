public class Empleado {
    private int calcularHorasTrabajadas;
    private String nombre;

    private String cedula;

    private int horasTrabajadas;

    private double valorHora;

    private double retencionFuente;

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }
    public void setCedula(String cedula){
        this.cedula=cedula;
    }

    public String getCedula(){
        return cedula;
    }

    public void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas=horasTrabajadas;
    }

    public int getHorasTrabajadas(){
        return horasTrabajadas;
    }


    public void setvalorHora(double valorHora){
        this.valorHora=valorHora;
    }

    public double getvalorHora(){
        return valorHora;
    }

    public void setRetencionFuente(double retencionFuente){
        this.retencionFuente=retencionFuente;
    }

    public double getRetencionFuente(){
        return retencionFuente;
    }

    public double calcularSalarioBruto(){
        return horasTrabajadas*valorHora;
    }

    public double calcularMontoRetencion(){
        return calcularSalarioBruto()*retencionFuente;
    }

    public double calcularSalarioNeto(){
        return calcularSalarioBruto()-calcularMontoRetencion();
    }



    public int calcularHorasTrabajadas(int horasExtras){
        return horasTrabajadas+=horasExtras;
    }



}
