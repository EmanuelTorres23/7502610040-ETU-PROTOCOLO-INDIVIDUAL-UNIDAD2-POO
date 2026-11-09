package taller6;

public class Ejercicio3_Banco {
    protected double saldo;

    public Ejercicio3_Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Discusión sobre por qué no es seguro y cómo mejorar:
    // 1. ¿Por qué no es seguro?: Usar 'protected' en datos críticos como 'saldo' rompe el encapsulamiento
    //    porque permite que cualquier clase hija o del mismo paquete modifique el valor directamente
    //    sin pasar por validaciones (por ejemplo, asignando saldos negativos o valores ilógicos).
    // 2. ¿Cómo mejorar?: Se debe cambiar el modificador a 'private' para ocultar el atributo y controlarlo
    //    utilizando métodos seguros (getters y setters) que validen los datos antes de aplicar cambios.
}