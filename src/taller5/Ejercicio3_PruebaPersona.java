package taller5;

public class Ejercicio3_PruebaPersona {
    public static void main(String[] args) {
        Ejercicio3_Persona persona = new Ejercicio3_Persona("Carlos", 20);

        System.out.println(persona.edad);
        System.out.println(persona.getNombre());
    }
}
/*

 DISCUSIÓN: DIFERENCIAS DE ACCESO ENTRE PRIVATE Y DE PAQUETE (DEFAULT)

 1. Modificador 'private' (nombre):
    - Oculta por completo el miembro. No se puede leer ni modificar de
      forma directa desde ninguna otra clase, ni siquiera estando en el
      mismo paquete.
    - Requiere métodos públicos de interfaz (`get` y `set`) para interactuar
      con él de manera controlada y segura, protegiendo el encapsulamiento.

 2. Modificador de Paquete / Default (edad):
    - Permite el acceso directo tanto de lectura como de escritura, pero
      únicamente a las clases que compartan exactamente el mismo paquete.
    - Si una clase de un paquete externo intenta acceder a este atributo,
      el compilador bloqueará la acción por cuestiones de seguridad y límites
      de encapsulamiento.
*/