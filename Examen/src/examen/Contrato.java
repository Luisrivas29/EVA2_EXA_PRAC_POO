
package examen;


public class Contrato extends Empleados{

    public Contrato(String nombre, double salario) {
        super(nombre, salario);
    }

    public Contrato() {
    }
    
    @Override
     public double calcularSalarioAnual(){
        return getSalario() * 12;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Nombre: " + " " + getNombre() +" "+ "Salario: " + " " +calcularSalarioAnual());
    }
}
