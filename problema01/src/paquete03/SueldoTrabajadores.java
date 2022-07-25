package paquete03;

public class SueldoTrabajadores {
    private String cedula;
    private String nombre;
    private String correo;
    private double sueldo;
    private int sueldodelmes;
    public SueldoTrabajadores(String c, String n, String co, double sue, int mesS){
        correo=co;
        sueldo=sue;
        sueldodelmes=mesS;
        cedula=c;
        nombre=n;
        
        
    }
    public SueldoTrabajadores(){
        
    }

    public void establecerCedula(String cedula) {
        this.cedula = cedula;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerCorreo(String correo) {
        this.correo = correo;
    }

    public void establecerSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void establecerMesSueldo(int mesSueldo) {
        this.sueldodelmes = mesSueldo;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public int obtenerMesSueldo() {
        return sueldodelmes;
    }

    @Override
    public String toString() {
        String cadena= String.format("Cedula:%s\n"
                + "Nombre:%s\n"
                + "Correo:%s\n"
                + "Sueldo:%.2f\n"
                + "Mes sueldo:%d\n", 
                obtenerCedula(),
                obtenerNombre(),
                obtenerCorreo(),
                obtenerSueldo(),
                obtenerMesSueldo()
                );
        return cadena;
    }

   
    
    
}
