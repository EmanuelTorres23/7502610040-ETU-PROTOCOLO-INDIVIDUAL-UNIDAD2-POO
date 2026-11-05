package taller5.vehiculos;

public class PruebaBuena_Vehiculos {
    public static void main(String[] args) {

        // Al estar en el mismo paquete, sí es posible instanciar y acceder
        // a los miembros con visibilidad de paquete (package-private):

        Ejercicio2_Vehiculo vehiculo = new Ejercicio2_Vehiculo("Carro");
        vehiculo.tipo = "Toyota"; // Acceso directo permitido

        Ejercicio2_Moto moto = new Ejercicio2_Moto("Moto");
        moto.tipo = "Honda"; // Acceso directo permitido

        System.out.println("Vehículo configurado exitosamente: " + vehiculo.tipo);
        System.out.println("Moto configurada exitosamente: " + moto.tipo);

    }
}