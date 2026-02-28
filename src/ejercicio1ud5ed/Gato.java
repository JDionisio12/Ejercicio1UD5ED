package ejercicio1ud5ed;

/**
 * Clase que representa a un Gato, el cual es un tipo de Animal.
 * Esta clase gestiona el nombre del felino y su estado de ronroneo. [cite: 59]
 * * @author JoseDionisio
 * @version 1.0 
 * @see Animal 
 */
public class Gato implements Animal {
    
    /** El nombre identificativo del gato. */
    private String nombre;
    
    /** Indica si el gato está ronroneando actualmente.  */
    private boolean ronronea;
    
    /**
     * Constructor para crear un nuevo Gato.
     * @param nombre El nombre que se le asignará al gato. 
     */
    public Gato(String nombre) {
        this.nombre = nombre;
        this.ronronea = false;
    }
    
    /**
     * {@inheritDoc}
     * @return El nombre del gato. 
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Define si el gato debe empezar o dejar de ronronear.
     * @param ronronea Valor booleano: true para ronronear, false para silencio. 
     */
    public void setRonronea(boolean ronronea) {
        this.ronronea = ronronea;
    }
    
    /**
     * {@inheritDoc}
     * @return El sonido "Miau" característico. 
     */
    @Override
    public String hacerSonido() {
        return "Miau";
    }
    
    /**
     * Comprueba el estado actual de ronroneo del gato.
     * @return true si está ronroneando, false en caso contrario. 
     */
    public boolean isRonroneando() {
        return this.ronronea;
    }
}