package ejercicio1ud5ed;

/**
 * Interfaz que define el comportamiento básico de un animal en el sistema.
 * Establece los métodos necesarios para identificar al animal y su sonido.
 * * @author TuNombre
 * @version 1.0
 * @since 2024
 */
public interface Animal {

    /**
     * Obtiene el nombre identificativo del animal.
     * @return El nombre del animal como una cadena de texto.
     */
    String getNombre();

    /**
     * Emite el sonido característico de la especie del animal.
     * @return Una cadena que representa el sonido del animal.
     */
    String hacerSonido();
}