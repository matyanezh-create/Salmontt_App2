package model;

/**
 * Representa una planta de proceso dentro de la empresa.
 * Extiende la clase UnidadOperativa para heredar los atributos comunes
 * y agrega su propio atributo específico.
 */
public class PlantaProceso extends UnidadOperativa {

    // Capacidad de procesamiento de la planta (por ejemplo, toneladas por día)
    private int capacidadProceso;

    //Constructor que inicializa los atributos heredados y el atributo propio.
    public PlantaProceso(String nombre, String comuna, int capacidadProceso) {
        super(nombre, comuna); // Llamado al constructor de la superclase
        this.capacidadProceso = capacidadProceso;
    }

    //Devuelve una representación en texto de la planta de proceso,incluyendo los atributos heredados y el atributo específico.
    public String toString() {
        return "PlantaProceso{" +
                "nombre='" + nombre + '\'' +
                ", comuna='" + comuna + '\'' +
                ", capacidadProceso=" + capacidadProceso +
                '}';
    }
}
