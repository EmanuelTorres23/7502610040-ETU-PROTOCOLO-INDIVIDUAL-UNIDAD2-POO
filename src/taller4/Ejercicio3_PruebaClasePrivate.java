package taller4;

public class Ejercicio3_PruebaClasePrivate {
    public static void main(String[] args) {
        Ejercicio3_ClasePrivate obj = new Ejercicio3_ClasePrivate();

        // 1. INTENTO DE ACCESO DIRECTO (Esto genera error de compilación):
        // Si descomentas alguna de estas líneas, el IDE te marcará error rojo:
        // System.out.println(obj.datoSecreto);
        // obj.datoSecreto = "Modificación prohibida";
    }
}

/*
 DISCUSIÓN Y ANÁLISIS (Puntos 1 y 2):
 1. Sobre el error de compilación (Acceso directo a private):
    Al intentar leer o modificar directamente el atributo 'datoSecreto' desde
    otra clase, el compilador arroja un error de acceso privado. Esto demuestra
    que el modificador 'private' aísla la propiedad y protege los datos internos
    de la clase contra manipulaciones externas no deseadas.

 2. Sobre la ausencia de métodos get y set:
    Si una propiedad se declara como 'private' pero la clase no implementa
    métodos públicos de acceso (getters y setters), el atributo queda totalmente
    bloqueado e inaccesible para el resto del sistema.
    - Impacto en la protección: Ofrece la máxima seguridad ya que nadie puede
      alterarlo desde fuera.
    - Impacto operativo: Si en algún momento una clase externa legítima necesita
      consultar o modificar ese dato de forma controlada, la falta de estos métodos
      lo impedirá por completo, haciendo que la clase sea rígida y poco funcional.
*/

