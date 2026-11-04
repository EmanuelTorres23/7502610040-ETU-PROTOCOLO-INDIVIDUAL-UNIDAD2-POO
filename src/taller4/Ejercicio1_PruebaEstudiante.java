package taller4;

public class Ejercicio1_PruebaEstudiante {
    public static void main(String[] args) {
        Ejercicio1_Estudiante est = new Ejercicio1_Estudiante("Emanuel", 19, 4.4);
        est.mostrarInfo();

        est.setEdad(-5);
        est.setNotaPromedio(6.1);
        est.mostrarInfo();
    }
}