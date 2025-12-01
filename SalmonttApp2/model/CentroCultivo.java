package model;

/**
 * Representa un centro de cultivo dentro de la empresa salmonera.
 * Extiende la clase UnidadOperativa para heredar los atributos comunes
 * y agrega un atributo propio relacionado con su producción.
 */
public class CentroCultivo extends UnidadOperativa {

    // Cantidad de toneladas de producción del centro de cultivo
    private double toneladasProduccion;

    //Constructor que inicializa los atributos heredados y el atributo específico.
    public CentroCultivo(String nombre, String comuna, double toneladasProduccion) {
        super(nombre, comuna); // Llamado al constructor de la clase padre
        this.toneladasProduccion = toneladasProduccion;
    }

    //Devuelve una representación en texto del centro de cultivo,incluyendo los atributos heredados y el específico.
    public String toString() {
        return "CentroCultivo{" +
                "nombre='" + nombre + '\'' +
                ", comuna='" + comuna + '\'' +
                ", toneladasProduccion=" + toneladasProduccion +
                '}';
    }
}
