package taller4;

public class Ejercicio2_PruebaCoche  {
    public static void main(String[] args) {
        Ejercicio2_Coche miCoche = new Ejercicio2_Coche("Chevrolet", "Onix", 160.0);
        miCoche.acelerar(20.0);

        /*
         * DEMOSTRACIÓN DE ERROR DE COMPILACIÓN SOLICITADO EN EL TALLER:
         * El taller pide intentar acceder directamente a una propiedad privada para ver el error.
         * Si intentas descomentar la siguiente línea, IntelliJ te mostrará un error en rojo:
         *
         * System.out.println(miCoche.marca); -> Error: marca has private access in taller4.Coche
         */
    }
}