
package examen;


public abstract class Examen {

   
    public static void main(String[] args) {
       Completo comp = new Completo("Luis",20000);
       Hora hora = new Hora("Pedro",50000);
       Contrato cont = new Contrato("Juan",10000);
       
       hora.imprimirDatos();
       comp.imprimirDatos();
       cont.imprimirDatos();
    }
    
}
