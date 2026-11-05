//package taller5.Prueba;
//
//import taller5.vehiculos.Ejercicio2_Vehiculo;
//import taller5.vehiculos.Ejercicio2_Moto;
//
//public class PruebaMala_Vehiculos {
//    public static void main(String[] args) {
//        
//        // 1. Código que genera el error de compilación:
//        Ejercicio2_Vehiculo vehiculo = new Ejercicio2_Vehiculo("Carro");
//        vehiculo.tipo = "Carro";
//
//        Ejercicio2_Moto moto = new Ejercicio2_Moto("Moto");
//        moto.tipo = "Deportiva";
//        
//    }
//}

/*
 POR QUÉ ESTÁ MALO (Explicación del error de compilación):
 El atributo 'tipo' en la clase Ejercicio2_Vehiculo está definido con visibilidad 
 por defecto (package-private). Esto significa que Java solo permite acceder a 
 él desde clases que pertenezcan exactamente al mismo paquete ('taller5.vehiculos').
 
 Al intentar instanciar los objetos y modificar el atributo 'tipo' 
 desde la clase de prueba que se encuentra en un paquete diferente 
 ('taller5.Prueba'), el compilador arroja un error indicando que el 
 miembro no es visible ni accesible desde fuera de su paquete original.
*/