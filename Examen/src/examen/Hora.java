
package examen;


public class Hora extends Empleados{

    public Hora(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
     public double calcularSalarioAnual(){
       
        return getSalario()/24 * 365;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Nombre: " + " " + getNombre() +" "+ "Salario: " + " " + getSalario());
    }
}
