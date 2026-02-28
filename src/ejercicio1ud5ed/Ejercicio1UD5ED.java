package ejercicio1ud5ed;

/**
 * Clase principal del proyecto Ejercicio1UD5ED.
 * Esta clase sirve como punto de entrada para probar la implementación de
 * las clases Gato y Perro bajo la interfaz Animal.
 * * @author JoseDionisio
 * @version 1.0
 * @since 2024
 */
public class Ejercicio1UD5ED {

    /**
     * Punto de entrada de la aplicación.
     * Crea instancias de animales, configura sus estados y muestra por 
     * consola los sonidos y atributos de cada uno.
     * * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        // Crear un perro
        Perro perro = new Perro("Fido");
        perro.setEnfadado(true);
        
        // Crear un gato
        Gato gato = new Gato("Garfield");
        
        // Mostrar información sobre el perro
        System.out.println("Nombre del perro: " + perro.getNombre());
        System.out.println("Sonido del perro: " + perro.hacerSonido());
        System.out.println("¿Está ladrando? " + perro.isLadrando());
        
        // Mostrar información sobre el gato
        System.out.println("Nombre del gato: " + gato.getNombre());
        System.out.println("Sonido del gato: " + gato.hacerSonido());
        System.out.println("¿Está ronroneando? " + gato.isRonroneando());
    }
}