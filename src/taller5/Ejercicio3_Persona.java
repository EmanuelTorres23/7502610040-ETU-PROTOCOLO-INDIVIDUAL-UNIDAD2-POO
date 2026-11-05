package taller5;

public class Ejercicio3_Persona {
    private String nombre;
    int edad;

    public Ejercicio3_Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}