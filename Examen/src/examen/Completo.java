
package examen;


public class Completo extends Empleados{

    public Completo(String nombre, double salario) {
        super(nombre, salario);
    }

    public Completo() {
    }

    @Override
     public double calcularSalarioAnual(){
        
        return (getSalario() * 12)+(getSalario()*.10);
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Nombre: " + " "  + getNombre() + "Salario: " + calcularSalarioAnual());
    }

    

    
    
}
