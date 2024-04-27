
package examen;


public abstract class Empleados {
    private String nombre;
    private double salario;

    public Empleados(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public Empleados() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public abstract double calcularSalarioAnual();
    
    
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + " " +getNombre() + "Salario: " + " " + getSalario());
    }
    
}
