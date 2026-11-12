package taller4.Ejercicio2;

public class Ejercicio2_Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Ejercicio2_Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento;
            System.out.println("Acelerando... Nueva velocidad máxima: " + velocidadMaxima + " km/h");
        } else {
            System.out.println("El incremento de velocidad debe ser positivo.");
        }
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
}