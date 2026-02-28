package ejercicio1ud5ed;

/**
 * Clase que representa a un Perro dentro del sistema.
 * Implementa la interfaz Animal y gestiona comportamientos específicos como el enfado.
 * * @author JoseDionisio
 * @version 1.0
 * @see Animal
 */
public class Perro implements Animal {
    /** Nombre identificativo del perro. */
    private String nombre;
    
    /** Indica si el perro tiene un estado de ánimo enfadado. */
    private boolean enfadado;
    
    /** * @deprecated Este atributo ya no se utiliza en la versión actual.
     * @see #getTalla() 
     */
    @Deprecated
    private String talla;
    
    /**
     * Constructor de la clase Perro.
     * @param nombre El nombre que se le asignará al perro.
     */
    public Perro(String nombre) {
        this.nombre = nombre;
        this.enfadado = false;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Indica el estado de enfado del perro.
     * @return true si está enfadado, false si está tranquilo.
     */
    public boolean isEnfadado() {
        return enfadado;
    }

    /**
     * Modifica el estado de enfado del perro.
     * @param enfadado Nuevo estado de ánimo.
     */
    public void setEnfadado(boolean enfadado) {
        this.enfadado = enfadado;
    }
    
    /**
     * {@inheritDoc}
     * @return El ladrido característico "Guau guau".
     */
    @Override
    public String hacerSonido() {
        return "Guau guau";
    }
    
    /**
     * Determina si el perro está ladrando basándose en su enfado.
     * @return El estado de enfado como indicador de ladrido.
     */
    public boolean isLadrando() {
        return this.enfadado;
    }
    
    /**
     * Obtiene la talla del perro.
     * @return La talla almacenada.
     * @deprecated Ya no se usa este método, será eliminado en futuras versiones. 
     */
    @Deprecated
    public String getTalla() {
        return this.talla;
    }
    
    /**
     * Establece la talla del perro.
     * @param nuevaTalla El valor de la nueva talla.
     * @deprecated Ya no se usa este método. 
     */
    @Deprecated
    public void setTalla(String nuevaTalla) {
        this.talla = nuevaTalla;
    }
}