package taller6;

public class Ejercicio1_Gerente extends Ejercicio1_Empleado {
    protected String departamento;

    public Ejercicio1_Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); // Hereda las propiedades de Ejercicio1_Empleado
        this.departamento = departamento;
    }

    public void mostrarInformacion() {
        System.out.println("INFORMACIÓN DEL GERENTE");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println("Departamento: " + departamento);
    }
}