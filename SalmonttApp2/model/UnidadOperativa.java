package model;

/**
 * Clase base que representa una unidad operativa dentro de la empresa.
 * Contiene atributos comunes que serán heredados por las subclases.
 */
public class UnidadOperativa {

    // Nombre de la unidad operativa
    protected String nombre;

    // Comuna donde se ubica la unidad operativa
    protected String comuna;

    //Constructor que inicializa los atributos comunes.
    public UnidadOperativa(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
    }

    //Devuelve una representación en texto de la unidad operativa.
    public String toString() {
        return "UnidadOperativa{" +
                "nombre='" + nombre + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }
}
