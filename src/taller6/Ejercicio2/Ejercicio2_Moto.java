package taller6.Ejercicio2;

public class Ejercicio2_Moto extends Ejercicio2_Vehiculo {
    protected int cilindrada;

    public Ejercicio2_Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarDetallesMoto() {
        System.out.println("--- DETALLES DE LA MOTO ---");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}